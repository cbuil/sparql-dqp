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

package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.List;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.BinaryOperator;

/**
 * SPARQL set operator abstract class: UNION
 * @author Carlos Buil Aranda
 * @email cbuil@fi.upm.es
 *
 */
public abstract class SparqlSetOperator extends BinaryOperator
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Universidad Politecnica de Madrid, 2011";

    /** Not a bag operator. */
    protected boolean mBagOperator = true;

    /**
     * Checks if operator is a bag operator.
     * 
     * @return <code>true</code> if operator is a bag operator,
     *         <code>false</code> if it is a set operator
     */
    public boolean isBagOperator()
    {
        return mBagOperator;
    }

    /**
     * {@inheritDoc}
     */
    public void update() throws LQPException
    {
        super.update();
        // One of the heads
        mOperatorHeading = new HeadingImpl(mLeftChildOperator.getHeading());
    }

    /**
     * {@inheritDoc}
     */
    public void validate() throws LQPException
    {
        super.validate();

        List<Attribute> lAttr = mLeftChildOperator.getHeading().getAttributes();
        List<Attribute> rAttr = mRightChildOperator.getHeading()
                .getAttributes();

//        if (!lAttr.containsAll(rAttr))
//        {
//            throw new LQPException(
//                    "Relations incompatible. Not union of attributes");
//        } else if(!rAttr.containsAll(lAttr))
//        {
//            throw new LQPException(
//                    "Relations incompatible. Not union of attributes");
//        }

    }
}
