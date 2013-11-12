package es.upm.fi.dia.oeg.ogsadai.sparql.query;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.lqp.Attribute;

public class SparqlSelectQuery extends SparqlQuery
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2012";

    private List<SparqlModifier> mModifiers;

    private List<Attribute> mQuerySelectVariables;
    
    private DataDictionary mDataDictionary;
    
    private Set<EvaluationNode> mEvaluationNodes;

    public List<Attribute> getQuerySelectVariables()
    {
        return mQuerySelectVariables;
    }

    public void setQuerySelectVariables(List<Attribute> mQuerySelectVariables)
    {
        this.mQuerySelectVariables = mQuerySelectVariables;
    }
    
    public SparqlSelectQuery()
    {

    }

    @Override
    public CommonTree getQueryAst()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPrefixes(List<Prefix> prefixList)
    {
        super.mQueryPrefixes = prefixList;

    }

    @Override
    public void setDatasets(List<Dataset> datasets)
    {
        super.mQueryDatasets = datasets;
    }

    @Override
    public void setQueryAst(CommonTree queryAst)
    {
        super.mQueryAst = queryAst;

    }

    /**
     * @return the mDataDictionary
     */
    @Override
    public DataDictionary getDataDictionary()
    {
        return mDataDictionary;
    }

    /**
     * @param mDataDictionary the mDataDictionary to set
     */
    public void setDataDictionary(DataDictionary mDataDictionary)
    {
        this.mDataDictionary = mDataDictionary;
    }

    @Override
    public Set<EvaluationNode> getEvaluationNodes()
    {
        return mEvaluationNodes;
    }

    @Override
    public void setEvaluationNodes(Set<EvaluationNode> evaluationNodes)
    {
        mEvaluationNodes = evaluationNodes;
    }
}
