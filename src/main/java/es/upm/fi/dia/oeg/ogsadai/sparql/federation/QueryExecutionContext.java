package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.EvaluationNode;

public class QueryExecutionContext
{
    private DataDictionary mQueryDictionary = null;
    private CommonTree mAst;
    private Set<EvaluationNode> mEvaluationNodes;

    public QueryExecutionContext(DataDictionary queryDictionary,
            CommonTree ast, Set<EvaluationNode> set)
    {
        this.mQueryDictionary = queryDictionary;
        this.mAst = ast;
        this.mEvaluationNodes = set; 
    }

    public DataDictionary getQueryDictionary()
    {
        return mQueryDictionary;
    }

    public void setQueryDictionary(DataDictionary mQueryDictionary)
    {
        this.mQueryDictionary = mQueryDictionary;
    }

    public CommonTree getAst()
    {
        return mAst;
    }

    public void setAst(CommonTree mAst)
    {
        this.mAst = mAst;
    }
    
    public Set<EvaluationNode> getEvaluationNodes()
    {
        return mEvaluationNodes;
    }

}
