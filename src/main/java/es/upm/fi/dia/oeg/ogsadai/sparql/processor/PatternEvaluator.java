package es.upm.fi.dia.oeg.ogsadai.sparql.processor;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.BasicGraphPattern;

import java.util.List;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

public interface PatternEvaluator
{

    // public ExecutionContext getExecContext() ;

    public Operator basicPattern(BasicGraphPattern pattern);

    // public Operator pathPattern(TriplePath triplePath) ;

    // Two forms that provide custom code evaluation
    // public Operator procedure(Operator Operator, Node procId, ExprList args)
    // ;
    // public Operator propertyFunction(Operator Operator, Node procId,
    // PropFuncArg subjArgs, PropFuncArg objArgs) ;

    // public Operator assign(Operator Operator, VarExprList exprs) ;
    // public Operator extend(Operator Operator, VarExprList exprs) ;

    public Operator join(Operator OperatorLeft, Operator OperatorRight);

    public Operator leftJoin(Operator OperatorLeft, Operator OperatorRight,
            List<String> expr);

    public Operator diff(Operator OperatorLeft, Operator OperatorRight);

    public Operator minus(Operator left, Operator right);

    public Operator union(Operator OperatorLeft, Operator OperatorRight);

    public Operator condition(Operator left, Operator right);

    public Operator filter(List<String> expressions, Operator OperatorLeft) throws SPARQLParserException;

    public Operator unit();

    public Operator list(Operator Operator);

    public Operator order(Operator Operator, List<String> conditions);

    public Operator groupBy(Operator Operator, List<Attribute> groupVars,
            List<String> aggregators);

    public Operator project(Operator Operator, List<Attribute> projectVars);

    public Operator distinct(Operator Operator);

    public Operator reduced(Operator Operator);

    public Operator slice(Operator Operator, long start, long length);
}
