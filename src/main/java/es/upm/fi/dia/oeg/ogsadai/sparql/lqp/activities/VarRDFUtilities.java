package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.activities;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import uk.org.ogsadai.activity.io.BlockWriter;
import uk.org.ogsadai.activity.io.PipeClosedException;
import uk.org.ogsadai.activity.io.PipeIOException;
import uk.org.ogsadai.activity.io.PipeTerminatedException;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.tuple.Null;
import uk.org.ogsadai.tuple.SimpleTuple;
import uk.org.ogsadai.tuple.Tuple;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;

public class VarRDFUtilities
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    /** Logger object for logging in this class. */
    private static final DAILogger LOG = DAILogger
            .getLogger(VarRDFUtilities.class);

    /**
     * Empty constructor
     */
    public VarRDFUtilities()
    {
        // empty constructor
    }

    /**
     * creates a list of tuples from a Jena ResultSet
     * 
     * @param rs
     * @param includeListMarkers
     * @param output
     * @param query
     * @param includeMetaData
     * @throws PipeClosedException
     * @throws PipeIOException
     * @throws PipeTerminatedException
     * @throws SQLException
     * @throws IOException
     */
    public static void createTupleList(ResultSet rs, BlockWriter output) throws PipeClosedException,
            PipeIOException, PipeTerminatedException, SQLException, IOException
    {

        LOG.debug("Into VarRDFUtilities, creating tuple list");

            for (; rs.hasNext();)
            {
                QuerySolution qs = rs.next();
                List<Object> lst = new ArrayList<Object>();
                for (String varName : rs.getResultVars())
                {
                    RDFNode node = qs.get(varName);
                    // if node is null then it is a blank node
                    if (node == null)
                    {
                        lst.add(Null.VALUE);
                    }
                    else
                    {
                        if (node.isLiteral())
                          {
                              lst.add(((Literal) node).getString());
                          }
                        else if (node.isAnon()){
                            lst.add(UUID.randomUUID().toString());
                        }
                        else if (node.isResource()){
                            lst.add(((Resource) node).getURI());
                        }
                          else {
                              lst.add(node.toString());
                          }
                    }
                }
                Tuple tuple = new SimpleTuple(lst);
                LOG.debug("Tuple: " + tuple);
                output.write(tuple);
            }
    }
}
