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

import org.apache.log4j.Logger;

import uk.org.ogsadai.dqp.lqp.udf.ExecutableFunction;
import uk.org.ogsadai.dqp.lqp.udf.FunctionType;
import uk.org.ogsadai.dqp.lqp.udf.LogicalExecutableFunctionBase;
import uk.org.ogsadai.expression.ExpressionEvaluationException;
import uk.org.ogsadai.expression.Operand;
import uk.org.ogsadai.expression.arithmetic.ExecutableFunctionExpression;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.tuple.Null;
import uk.org.ogsadai.tuple.Tuple;
import uk.org.ogsadai.tuple.TupleTypes;
import uk.org.ogsadai.tuple.TypeMismatchException;

/**
 * This class performs a SPARQL FILTER operation. CUrrently comparision of
 * values <, >, =, <= or >=
 * 
 * @author Carlos Buil Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class FunctionFilter extends ExecutableFunctionExpression
{

    /** Logger. */
    private static final Logger LOG = Logger.getLogger(FunctionFilter.class
            .getName());

    /**
     * comparison result
     */
    private Object mResult;


    /**
     * @param arg0
     */
    public FunctionFilter(ExecutableFunction arg0)
    {
        super(arg0);
    }


}
