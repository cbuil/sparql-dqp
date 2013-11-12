package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.lqp.Annotation;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.RenameMap;
import uk.org.ogsadai.dqp.lqp.SimpleRenameMap;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.ProjectOperator;
import uk.org.ogsadai.dqp.lqp.operators.RenameOperator;
import uk.org.ogsadai.tuple.TupleTypes;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.RDFDatabaseScanOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.RDFServiceScanOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleBasicGraphPattern;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

public class DefaultDatasetQuery
{
    
    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(DefaultDatasetQuery.class);

    // Suppress default constructor for noninstantiability
    private DefaultDatasetQuery()
    {
        throw new AssertionError();
    }

    /**
     * 
     * I create the SERVICE that queries the default graph. Querying the default
     * graph is treated like querying a remote endpoint
     * 
     * @param defaultGraphQuery
     * @param triplesVarList
     * @param dataDictionary
     * @param prefixMap
     * @return
     * @throws LQPException
     */
    public static Operator createDefaultServiceScan(
            DataDictionary dataDictionary, String source,
            SimpleBasicGraphPattern bgp) throws LQPException
    {

        // DataNode newDataNode = getExecutionNode(dataDictionary, source,
        // sourceUUID);
        List<String> boundList = new ArrayList<String>();
        List<String> triplesVarList;
        triplesVarList = new ArrayList<>();
        if (!bgp.getSubject().contains(":"))
        {
            triplesVarList.add(bgp.getSubject().replaceAll("\\?", ""));
        }
        if (!bgp.getPredicate().contains(":"))
        {
            triplesVarList.add(bgp.getPredicate().replaceAll("\\?", ""));
        }
        if (!bgp.getObject().contains(":"))
        {
            triplesVarList.add(bgp.getObject().replaceAll("\\?", ""));
        }
        RDFDatabaseScanOperator rdfDbScan = new RDFDatabaseScanOperator(
                "SELECT * WHERE { " + bgp.toString() + " }", source,
                triplesVarList, boundList, bgp);
        rdfDbScan.setDataDictionary(dataDictionary);

        LOG.debug("Default dataset table: " + source);
        DataNode dn = dataDictionary.getTableSchema(source +"_someTableName")
                .getDataNodeTables().get(0).getDataNode(); // get from
        // "DataDictionary"
        Annotation.addDataNodeAnnotation(rdfDbScan, dn);
        rdfDbScan.update();

        List<Attribute> attrbs = new ArrayList<Attribute>();
        for (String string : triplesVarList)
        {
            Attribute attr = new AttributeImpl(string, TupleTypes._STRING,
                    source.substring(source.lastIndexOf("/") + 1));
            attr.addAnnotation("resourceId", dn.getResourceID().toString());
            // new way of getting the evaluation node, first using the
            // alias
            // I get the evaluation node, second, once I have the
            // evaluation
            // node, using the resourceID I build where it is going to
            // be
            // evaluated
            attrbs.add(attr);
        }
        ProjectOperator project = new ProjectOperator(rdfDbScan, attrbs);
        project.addAnnotation("originalSource", source);
        project.addAnnotation("safe", "");
        project.update();
        
//        return project;

        RenameMap renameMap = new SimpleRenameMap();
        for (Attribute attribute : project.getHeading().getAttributes())
        {

            String sourceUUID = SparqlDQPUtil.randomId();
            sourceUUID = UUID.randomUUID().toString().replaceAll("[0-9]+", "")
                    .replaceAll("-", "");
            renameMap.add(attribute, new AttributeImpl(attribute.getName(),
                    attribute.getType(), attribute.getSource() + sourceUUID));
        }

        RenameOperator rename = new RenameOperator(renameMap);
        rename.setChild(0, project);
        rename.update();

        return rename;
    }

}
