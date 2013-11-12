package es.upm.fi.dia.oeg.ogsadai.sparql.processor;

import java.util.ArrayList;
import java.util.List;

import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.CommonPredicate;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.Predicate;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.InnerThetaJoinOperator;
import uk.org.ogsadai.dqp.lqp.operators.LeftOuterJoinOperator;
import uk.org.ogsadai.dqp.lqp.operators.ProductOperator;
import uk.org.ogsadai.dqp.lqp.operators.SelectOperator;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.dqp.lqp.udf.repository.NoSuchFunctionException;
import uk.org.ogsadai.expression.ArithmeticExpressionOperand;
import uk.org.ogsadai.expression.EqualExpression;
import uk.org.ogsadai.expression.Expression;
import uk.org.ogsadai.expression.Operand;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpression;
import uk.org.ogsadai.expression.arithmetic.Constant;
import uk.org.ogsadai.expression.arithmetic.TableColumn;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.parser.sql92query.SQLQueryParser;
import uk.org.ogsadai.tuple.TupleTypes;
import uk.org.ogsadai.tuple.converters.StringConversionException;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators.SparqlUnionOperator;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.udf.FunctionFilter;
import es.upm.fi.dia.oeg.ogsadai.sparql.lqp.udf.FunctionRegex;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.BasicGraphPattern;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

public class SimplePatternEvaluator implements PatternEvaluator
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2011";

    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(SimplePatternEvaluator.class);

    public SimplePatternEvaluator()
    {
        // this.mQueryContext = context ;
    }

    @Override
    public Operator basicPattern(BasicGraphPattern pattern)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator join(Operator operatorLeft, Operator operatorRight)
    {
        LOG.debug("Join");
        LOG.debug(operatorLeft.getHeading().toString());
        LOG.debug(operatorRight.getHeading().toString());

        return joinProcessor(operatorLeft, operatorRight, false);
    }

    @Override
    public Operator leftJoin(Operator operatorLeft, Operator operatorRight,
            List<String> expr)
    {
        LOG.debug("LeftJoin");
        LOG.debug(operatorLeft.getHeading().toString());
        LOG.debug(operatorRight.getHeading().toString());

        return joinProcessor(operatorLeft, operatorRight, true);
    }

    @Override
    public Operator diff(Operator OperatorLeft, Operator OperatorRight)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator minus(Operator left, Operator right)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator union(Operator operatorLeft, Operator operatorRight)
    {
        LOG.debug("Union");
        LOG.debug(operatorLeft.getHeading().toString());
        LOG.debug(operatorRight.getHeading().toString());
        return unionProcessor(operatorLeft, operatorRight);
    }

    @Override
    public Operator condition(Operator left, Operator right)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator filter(List<String> expressions, Operator operatorLeft) throws SPARQLParserException
    {
        return filterProcessor(operatorLeft, expressions);
    }

    @Override
    public Operator unit()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator list(Operator Operator)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator order(Operator Operator, List<String> conditions)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator groupBy(Operator Operator, List<Attribute> groupVars,
            List<String> aggregators)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator project(Operator Operator, List<Attribute> projectVars)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator distinct(Operator Operator)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator reduced(Operator Operator)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Operator slice(Operator Operator, long start, long length)
    {
        // TODO Auto-generated method stub
        return null;
    }

    private Operator joinProcessor(Operator operatorLeft,
            Operator operatorRight, boolean leftJoin)
    {
        Operator join = null;
        // I just use the first predicate
        Predicate p;
        try
        {
            List<String> predicateList = new ArrayList<String>();

            predicateList = SparqlDQPUtil.getCommonPredicates(operatorLeft
                    .getHeading().getAttributes(), operatorRight.getHeading()
                    .getAttributes());
            // p = new CommonPredicate(ExpressionFactory.buildExpression(
            // SQLQueryParser.getInstance().parseSQLForCondition(
            // predicateList.get(0)), null));
            if (predicateList.isEmpty())
            {
                // no common predicate, thus cross join or product
                join = new ProductOperator(operatorLeft, operatorRight);
            }
            else
            {
                p = new CommonPredicate(predicateList.get(0), null);
                if (leftJoin)
                {
                    join = new LeftOuterJoinOperator(p);
                }
                else
                {
                    join = new InnerThetaJoinOperator(p);
                }
            }

            SparqlDQPUtil.connectBinary(join, operatorLeft, operatorRight);
            join.update();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return join;
    }

    private Operator unionProcessor(Operator operatorLeft,
            Operator operatorRight)
    {
        Operator unionOperator = null;

        try
        {
            unionOperator = new SparqlUnionOperator(null);
            SparqlDQPUtil.connectBinary(unionOperator, operatorLeft,
                    operatorRight);
            unionOperator.update();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return unionOperator;
    }

    private Operator filterProcessor(Operator queryRoot, List<String> filterList) throws SPARQLParserException
    {
        try
        {
            for (String filterExpression : filterList)
            {
                if (filterExpression.contains("regex"))
                {
                    String[] regex_parameters = new String[3];
                    regex_parameters = SparqlDQPUtil
                            .processRegex(filterExpression);
//                    String regexVar = filterExpression.substring(
//                            filterExpression.indexOf("?") + 1,
//                            filterExpression.indexOf(',') - 1);
//                    String regexValue = filterExpression.substring(
//                            filterExpression.indexOf("\"") + 1,
//                            filterExpression.lastIndexOf('\"'));
                    FunctionRepository functionRepository = (FunctionRepository) OGSADAIContext
                            .getInstance().get(
                                    FunctionRepository.FUNCTION_REPOSITORY_KEY);
                    FunctionRegex regex;

                    regex = (FunctionRegex) functionRepository
                            .getFunctionInstanceByName("regex");
                    FunctionFilter filter = new FunctionFilter(regex);

                    // source1.value = MyFunction(source2.value) has to be
                    // regex(var, "value") aka
                    for (Attribute attrFilter : queryRoot.getHeading()
                            .getAttributes())
                    {
                        if (regex_parameters[0].replaceAll("\\?", "").equals(attrFilter.getName()))
                        {
                            // select udf(foo, bar) from mytable
                            List<ArithmeticExpression> paramList = new ArrayList<ArithmeticExpression>();
                            paramList.add(new TableColumn(attrFilter));
                            paramList.add(new Constant(TupleTypes._STRING,
                                    regex_parameters[1]));
                            regex.initialise(paramList);
                            Operand rh = new ArithmeticExpressionOperand(
                                    new Constant(TupleTypes._STRING, "true"));
                            Operand lh = new ArithmeticExpressionOperand(filter);
                            Expression expression = new EqualExpression(lh, rh);
                            Predicate filterPredicate = new CommonPredicate(
                                    expression);
                            SelectOperator filterSelect = new SelectOperator(
                                    filterPredicate);
                            filterSelect.setChild(0, queryRoot);
                            filterSelect.update();
                            queryRoot = filterSelect;
                        }
                    }

                }
                else
                {
                    for (Attribute attrFilter : queryRoot.getHeading()
                            .getAttributes())
                    {
                        if (filterExpression.contains("?"
                                + attrFilter.getName()))
                        {
                            String url_regex = "<\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]>";
                            filterExpression = filterExpression.replaceAll(
                                    "&&", "AND");
                            filterExpression = filterExpression.replaceAll(
                                    "\\|\\|", "OR");
                            filterExpression = filterExpression.replaceAll(
                                    url_regex, "\"\"");
                            filterExpression = filterExpression.replaceAll(
                                    "\\?" + attrFilter.getName(),
                                    attrFilter.toString());
                            Predicate filterPredicate = null;
                            try
                            {
                                filterPredicate = new CommonPredicate(
                                        SQLQueryParser.getInstance()
                                                .parseSQLForCondition(
                                                        filterExpression), null);
                            }
                            catch (SQLParserException e)
                            {
                                throw new LQPException(
                                        "SPARQL FILTER condition not supported");
                                // e.printStackTrace();
                            }
                            SelectOperator filterSelect = new SelectOperator(
                                    filterPredicate);
                            filterSelect.setChild(0, queryRoot);
                            filterSelect.update();
                            queryRoot = filterSelect;
                        }
                    }
                }

            }
        }
        catch (NoSuchFunctionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (StringConversionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return queryRoot;
    }
}
