package es.upm.fi.dia.oeg.ogsadai.sparql.processor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.antlr.runtime.tree.CommonTree;
import org.apache.log4j.Logger;

import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.lqp.Annotation;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.ProjectOperator;
import uk.org.ogsadai.tuple.TupleTypes;

import es.upm.fi.dia.oeg.ogsadai.sparql.federation.DataNodeFactory;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.DefaultDatasetQuery;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.FusionTableScanOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.RDFEmptySetOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.RDFServiceScanOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.RDFVarServiceScanOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.ServiceVarApplyOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleBasicGraphPattern;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleSparqlService;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SparqlService;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.SparqlQuery;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

public class GroupProcessor
{
    /** Logger. */
    private static final Logger LOG = Logger.getLogger(SparqlDQPUtil.class);

    // Suppress default constructor for noninstantiability
    private GroupProcessor()
    {
        throw new AssertionError();
    }

    public static Operator processGroupGraphPattern(SparqlQuery sparqlQuery,
            CommonTree groupAst) throws LQPException, SPARQLParserException
    {
        LOG.debug("Processing Where Clause");

        // CommonTree whereAst = ((SparqlSelectQuery) sparqlQuery)
        // .getSelectQueryStructure().get(ASTConstants.WHERE_TOKEN);

        int i = 0;
        List<Operator> serviceVarOperators;
        serviceVarOperators = new ArrayList<>();

        List<sbOperator> bgpList;
        bgpList = new ArrayList<>();
        PatternEvaluator patternEval = new SimplePatternEvaluator();
        List<String> filterList;
        filterList = new ArrayList<>();
        while (i < groupAst.getChildCount())
        {
            CommonTree child = (CommonTree) groupAst.getChild(i);
            if (child.getType() == SparqlParser.TRIPLES_SAME_SUBJECT)
            {
                SimpleBasicGraphPattern bgp = SparqlDQPUtil.getTriplePattern(
                        child, sparqlQuery.getPrefixes());
                if (bgpList.isEmpty() == false)
                {
                    Operator op = patternEval.join(bgpList.get(0).mOperator,
                            DefaultDatasetQuery.createDefaultServiceScan(
                                    sparqlQuery.getDataDictionary(),
                                    sparqlQuery.getDefaultDataset(), bgp));
                    bgpList.clear();
                    bgpList.add(new sbOperator(op, SparqlDQPUtil
                            .getStronglyBoundVariables(op)));
                }
                else
                {
                    Operator tmpOp = DefaultDatasetQuery
                            .createDefaultServiceScan(
                                    sparqlQuery.getDataDictionary(),
                                    sparqlQuery.getDefaultDataset(), bgp);
                    bgpList.add(new sbOperator(tmpOp, SparqlDQPUtil
                            .getStronglyBoundVariables(tmpOp)));
                }
            }
            else if (child.getType() == SparqlParser.GROUP_GRAPH_PATTERN)
            {
                Operator group = processGroupGraphPattern(sparqlQuery, child);
                if (bgpList.isEmpty() == false)
                {
                    Operator op = patternEval.join(bgpList.get(0).mOperator,
                            group);
                    bgpList.clear();
                    bgpList.add(new sbOperator(op, SparqlDQPUtil
                            .getStronglyBoundVariables(op)));
                }
                else
                {
                    bgpList.add(new sbOperator(group, SparqlDQPUtil
                            .getStronglyBoundVariables(group)));
                }
            }
            else if (child.getType() == SparqlParser.SERVICE)
            {
                SparqlService sparqlService = generateService(
                        (CommonTree) child, sparqlQuery);
                if (sparqlService.getServiceURI().contains("http"))
                {
                    if (bgpList.isEmpty() == false)
                    {
                        Operator op = patternEval.join(
                                bgpList.get(0).mOperator,
                                sparqlService.getServiceOperator());
                        bgpList.clear();
                        bgpList.add(new sbOperator(op, SparqlDQPUtil
                                .getStronglyBoundVariables(op)));
                    }
                    else
                    {
                        bgpList.add(new sbOperator(sparqlService
                                .getServiceOperator(), SparqlDQPUtil
                                .getStronglyBoundVariables(sparqlService
                                        .getServiceOperator())));
                    }
                }
                else if (!sparqlService.getServiceVariable().equals(""))
                {
                    serviceVarOperators.add(sparqlService.getServiceOperator());
                }
            }
            else if (child.getType() == SparqlParser.OPTIONAL)
            {
                Operator rightop = processGroupGraphPattern(sparqlQuery,
                        (CommonTree) child.getChild(0));
                if (bgpList.isEmpty() == false)
                {
                    Operator op = patternEval.leftJoin(
                            bgpList.get(0).mOperator, rightop, null);
                    bgpList.clear();
                    bgpList.add(new sbOperator(op, SparqlDQPUtil
                            .getStronglyBoundVariables(op)));
                }
                else
                {
                    bgpList.add(new sbOperator(rightop, SparqlDQPUtil
                            .getStronglyBoundVariables(rightop)));
                }
            }
            else if (child.getType() == SparqlParser.UNION)
            {
                Operator union_left_op = processGroupGraphPattern(sparqlQuery,
                        (CommonTree) child.getChild(0));
                Operator union_right_op = processGroupGraphPattern(sparqlQuery,
                        (CommonTree) child.getChild(1));
                Operator union_op = patternEval.union(union_left_op,
                        union_right_op);
                if (bgpList.isEmpty() == false)
                {
                    Operator op = patternEval.join(bgpList.get(0).mOperator,
                            union_op);
                    bgpList.clear();
                    bgpList.add(new sbOperator(op, SparqlDQPUtil
                            .getStronglyBoundVariables(op)));
                }
                else
                {
                    bgpList.add(new sbOperator(union_op, SparqlDQPUtil
                            .getStronglyBoundVariables(union_op)));
                }
            }
            else if (child.getType() == SparqlParser.FILTER)
            {
                filterList.add(SparqlDQPUtil.getFilterString(child,
                        sparqlQuery.getPrefixes()));
            }
            else
            {
                // TODO: continue with operators here
            }
            i++;
        }

        if (!filterList.isEmpty())
        {
            if (!bgpList.isEmpty())
            {
                Operator op = patternEval.filter(filterList,
                        bgpList.get(0).mOperator);
                bgpList.clear();
                bgpList.add(new sbOperator(op, SparqlDQPUtil
                        .getStronglyBoundVariables(op)));
                filterList.clear();

            }
            else
            {

                RDFEmptySetOperator empty = new RDFEmptySetOperator();
                empty.setDataDictionary(sparqlQuery.getDataDictionary());

                LOG.debug("Empty RDF SCAN");
                DataNode dn = sparqlQuery.getDataDictionary()
                        .getTableSchema("defaultDataset" + "_someTableName")
                        .getDataNodeTables().get(0).getDataNode(); // get
                                                                   // from
                // "DataDictionary"
                Annotation.addDataNodeAnnotation(empty, dn);
                empty.update();
                return empty;
            }
        }

        if (!serviceVarOperators.isEmpty())
        {
            for (Operator serviceVarOp : serviceVarOperators)
            {
                if (!bgpList.isEmpty())
                {
                    if (SparqlDQPUtil.hasAttribute(
                            bgpList.get(0).mStronglyBoundAttrs,
                            ((RDFVarServiceScanOperator) serviceVarOp)
                                    .getServiceVar()))
                    {
                        LOG.debug("SERVICE VAR operator is SAFE");
                        Operator op = patternEval.join(
                                bgpList.get(0).mOperator, serviceVarOp);
                        Set<Attribute> varsToBind;
                        varsToBind = new HashSet<>();
                        varsToBind = SparqlDQPUtil.getServiceVariable(bgpList
                                .get(0).mStronglyBoundAttrs,
                                ((RDFVarServiceScanOperator) serviceVarOp)
                                        .getServiceVar());
                        ServiceVarApplyOperator serviceApply = new ServiceVarApplyOperator(
                                op, varsToBind);
                        serviceApply.setChild(0, bgpList.get(0).mOperator);
                        serviceApply.setChild(1, serviceVarOp);
                        serviceApply.update();
                        return serviceApply;
                    }
                    else
                    {
                        LOG.debug("SERVICE VAR operator is NOT SAFE");
                        RDFEmptySetOperator empty = new RDFEmptySetOperator();
                        empty.setDataDictionary(sparqlQuery.getDataDictionary());
                        LOG.debug("Empty RDF SCAN");
                        DataNode dn = sparqlQuery
                                .getDataDictionary()
                                .getTableSchema(
                                        "defaultDataset" + "_someTableName")
                                .getDataNodeTables().get(0).getDataNode(); // get
                                                                           // from
                        // "DataDictionary"
                        Annotation.addDataNodeAnnotation(empty, dn);
                        empty.update();
                        return empty;
                    }
                }
                else
                {
                    LOG.debug("SERVICE VAR operator is NOT SAFE");
                    RDFEmptySetOperator empty = new RDFEmptySetOperator();
                    empty.setDataDictionary(sparqlQuery.getDataDictionary());

                    LOG.debug("Empty RDF SCAN");
                    DataNode dn = sparqlQuery
                            .getDataDictionary()
                            .getTableSchema("defaultDataset" + "_someTableName")
                            .getDataNodeTables().get(0).getDataNode(); // get
                                                                       // from
                    // "DataDictionary"
                    Annotation.addDataNodeAnnotation(empty, dn);
                    empty.update();
                    return empty;
                }
            }
        }

        return bgpList.get(0).mOperator;
    }

    /**
     * generates a single SERVICE operator from a CommonTree
     * 
     * @param ct
     * @param selectVars
     * @param dataDictionary
     * @param prefixMap
     * 
     * @return The SERVICE operator
     * @throws LQPException
     */
    private static SparqlService generateService(CommonTree ct,
            SparqlQuery selectQuery) throws LQPException
    {
        String query = "";
        List<String> varList = null;
        varList = new ArrayList<String>();
        List<String> varServiceList = null;
        String source = null;
        if (ct.getChild(0).getType() == SparqlParser.VAR)
        {
            source = ct.getChild(0).getChild(0).getText();
        }
        else
        {
            source = SparqlDQPUtil.getSource(ct.getChild(0));
            source = source.substring(1, source.length() - 1);
        }
        varServiceList = new ArrayList<String>();
        List<String> boundList = new ArrayList<String>();
        SparqlDQPUtil.getServiceVars(ct, varList);
        SparqlDQPUtil.getTerms(ct, boundList);
        StringBuffer serviceSelectVars = new StringBuffer();
        for (String var : varList)
        {
            // if (var.equals(attr.toString())
            // & !varServiceList.contains(var))
            if (!varServiceList.contains(var))
            {
                varServiceList.add(var);
                serviceSelectVars.append("?");
                serviceSelectVars.append(var);
                serviceSelectVars.append(" ");
            }
        }
        query = "SELECT " + serviceSelectVars.toString() + " WHERE { " + query
                + " " + SparqlDQPUtil.getQuery(ct, selectQuery.getPrefixes())
                + " }";

        String sourceUUID = SparqlDQPUtil.randomId();
        sourceUUID = UUID.randomUUID().toString().replaceAll("[0-9]+", "")
                .replaceAll("-", "");
        LOG.debug("Generated data respource ID: " + sourceUUID
                + " for source: " + source);

        Operator serviceScan = null;
        if (source.contains(".ttl"))
        {
            serviceScan = new FusionTableScanOperator(query, sourceUUID,
                    varServiceList, boundList, source);
            ((FusionTableScanOperator) serviceScan)
                    .setDataDictionary(selectQuery.getDataDictionary());
        }
        else if (source.contains("http") & !source.contains(".ttl"))
        {
            serviceScan = new RDFServiceScanOperator(query, sourceUUID,
                    varServiceList, boundList, source);
            ((RDFServiceScanOperator) serviceScan)
                    .setDataDictionary(selectQuery.getDataDictionary());
        }
        else
        {
            serviceScan = new RDFVarServiceScanOperator(query, sourceUUID,
                    varServiceList, new AttributeImpl(source.replaceAll("\\?", ""), sourceUUID));
            ((RDFVarServiceScanOperator) serviceScan)
                    .setDataDictionary(selectQuery.getDataDictionary());
        }
        // how to use distribution in DQP
        // "DataDictionary"
        DataNode newDataNode = null;
        newDataNode = DataNodeFactory.create(selectQuery.getDataDictionary(),
                source, sourceUUID);
        Annotation.addDataNodeAnnotation(serviceScan, newDataNode);

        List<Attribute> attrbs = new ArrayList<Attribute>();
        for (String string : varServiceList)
        {
            Attribute attr = new AttributeImpl(string, TupleTypes._STRING,
                    sourceUUID);
            attr.addAnnotation("resourceId", newDataNode.getResourceID()
                    .toString());
            // new way of getting the evaluation node, first using the
            // alias
            // I get the evaluation node, second, once I have the
            // evaluation
            // node, using the resourceID I build where it is going to
            // be
            // evaluated
            attrbs.add(attr);
        }
        ProjectOperator project = new ProjectOperator(serviceScan, attrbs);
        project.addAnnotation("originalSource",
                source.substring(source.lastIndexOf("/") + 1));
        project.addAnnotation("safe", "");
        project.update();
        SparqlService service = new SimpleSparqlService(project);
        service.setServiceURI(source);
        service.setServiceVariable(source);

        return service;
    }

    static class sbOperator
    {
        Operator mOperator;
        List<Attribute> mStronglyBoundAttrs;

        public sbOperator(Operator op, List<Attribute> sbAttributes)
        {
            mOperator = op;
            mStronglyBoundAttrs = sbAttributes;
        }
    }
}
