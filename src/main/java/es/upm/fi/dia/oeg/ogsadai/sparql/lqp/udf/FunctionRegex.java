// Copyright (c) Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2009-2012.
//
// LICENCE-START
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// LICENCE-END

package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.udf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import uk.org.ogsadai.dqp.lqp.udf.ExecutableFunction;
import uk.org.ogsadai.dqp.lqp.udf.Function;
import uk.org.ogsadai.dqp.lqp.udf.FunctionType;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpression;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.tuple.TupleTypes;
import uk.org.ogsadai.tuple.TypeMismatchException;

/**
 * Currently only supported the following example: regex(?val, "GHI") compares
 * whether the value of variable ?val is equals to "GUI" or not
 * 
 * @author Carlos Buil Aranda
 * 
 */
public class FunctionRegex implements ExecutableFunction, Function
{
    
//    private Pattern mPattern;

    /**
     * result of the execution: boolean
     */
    private Object mResult;

    /** Input parameter expressions. */
    private List<ArithmeticExpression> mParemeterExprList = new ArrayList<ArithmeticExpression>();

    /** Annotations. */
    protected Map<Object, Object> mAnnotations = new ConcurrentHashMap<Object, Object>();

    public void configure(int... types) throws TypeMismatchException
    {
        for (int i = 0; i < 2; ++i)
        {
            switch (types[i])
            {
            case TupleTypes._STRING:
                break;
            default:
                break;// throw new Exception();
            }
        }
    }

    public int getOutputType()
    {
        return TupleTypes._STRING;
    }

    public Object getResult()
    {
        return mResult;
    }

    public void put(Object... parameters)
    {
        if (parameters[0] == null || parameters[1] == null)
        {
            try
            {
                throw new SQLParserException(new Exception(
                        "Bad expression, null parameter"));
            }
            catch (SQLParserException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else
        {
//            Matcher m = mPattern.matcher(parameters[0].toString());
            if(parameters[0].toString().contains(parameters[1].toString()))
//            if(m.matches())
            {
                mResult = "true";
            }
            else
            {
                mResult = "false";
            }
        }
    }

    public String getName()
    {
        return "regex";
    }

    public List<ArithmeticExpression> getParameters()
    {
        return mParemeterExprList;
    }

    public FunctionType getType()
    {
        return FunctionType.UDF_REL_BINARY;
    }

    public void initialise(List<ArithmeticExpression> parameters)
    {
        mParemeterExprList = parameters;
//        mPattern = Pattern.compile(parameters.get(1).toString());
    }

    public String toSQL()
    {
        return "";
    }

    /**
     * {@inheritDoc}
     */
    public void addAnnotation(String key, Object value)
    {
        mAnnotations.put(key, value);
    }

    /**
     * {@inheritDoc}
     */
    public Object getAnnotation(String key)
    {
        return mAnnotations.get(key);
    }

    /**
     * {@inheritDoc}
     */
    public void removeAnnotation(String key)
    {
        mAnnotations.remove(key);
    }

	@Override
	public Map<String, Object> getAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

    // public boolean evaluate(final Tuple tuple)
    // throws ExpressionEvaluationException
    // {
    // Object left = mLHS.getValue(tuple);
    // Object right = mRHS.getValue(tuple);
    // if (left == Null.getValue() || right == Null.getValue())
    // {
    // return false;
    // }
    // return matches(left.toString(), right.toString());
    // }

    /**
     * Returns <code>true</code> if the input string matches the pattern. SQL
     * pattern matching is supported: <code>_</code> matches a single character,
     * and <code>%</code> matches any number of characters. For example,
     * <code>A%</code> matches <code>ABCDE</code> or <code>A</code> whereas
     * <code>A_</code> matches <code>AB</code> but not <code>ABCDE</code> or
     * <code>A</code>.
     * 
     * @param input
     *            string to match against pattern
     * @param pattern
     *            the pattern to match
     * @return <code>true</code> if the input string matches the pattern
     */
    // protected boolean matches(String input, String pattern)
    // {
    // String p = pattern;
    // // escape special characters by adding a backslash in front of them
    // List<String> special = Arrays.asList("\\^", "\\\\", "\\+", "\\^",
    // "\\.", "\\$", "\\?", "\\(", "\\)", "\\[", "\\]", "\\{", "\\}",
    // "\\|");
    // for (String regex : special)
    // {
    // p = p.replaceAll(regex, "\\\\" + regex);
    // }
    // // treat * separately -- why ??
    // p = p.replaceAll("\\\u002a", "\\\\*");
    // p = p.replaceAll("%", ".+?").replaceAll("_", ".");
    //
    // return input.matches(p);
    // }

}
