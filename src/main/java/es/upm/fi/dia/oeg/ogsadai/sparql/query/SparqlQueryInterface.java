package es.upm.fi.dia.oeg.ogsadai.sparql.query;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.EvaluationNode;

public interface SparqlQueryInterface
{

    public List<Prefix> getPrefixes();

    public List<Dataset> getDatasets();

    public CommonTree getQueryAst();

    public QueryType getQueryType();
    
    public Map<String, CommonTree> getQueryStructure();

    public void setPrefixes(List<Prefix> prefixList);

    public void setDatasets(List<Dataset> datasets);

    public void setQueryAst(CommonTree queryAst);
    
    public void setQueryStructure(Map<String, CommonTree> queryStructure);
    
    public DataDictionary getDataDictionary();
    
    public void setDefaultDataset(String dataset);
    
    public String getDefaultDataset();
    
    public Set<EvaluationNode> getEvaluationNodes();
    
    public void setEvaluationNodes(Set<EvaluationNode> evaluationNodes);
}
