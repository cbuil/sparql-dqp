package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

//Copyright (c) Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2009-2012.
//
//LICENCE-START
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software 
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//LICENCE-END

import java.util.ArrayList;
import java.util.List;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeMatchMode;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.OperatorVisitor;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;

/**
 * @author Carlos Buil-Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */

public class SparqlUnionOperator extends SparqlSetOperator
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid 2008-2011";

    /** Parameter list. */
    private List<String> mParameterList;

    /**
     * Constructs a new operator.
     */
    protected SparqlUnionOperator()
    {
        mID = OperatorID.getInstance("SPARQL_UNION");
    }

    /**
     * Constructor.
     * 
     * @param parameterList
     *            a list function parameters
     */
    public SparqlUnionOperator(List<String> parameterList)
    {
        this();
        mParameterList = parameterList;
    }

    /**
     * {@inheritDoc}
     */
    public void update() throws LQPException
    {
        List<Attribute> lst = new ArrayList<Attribute>();
        // lst.addAll(mLeftChildOperator.getHeading()
        // .getAttributes());
        // lst.addAll(mRightChildOperator.getHeading()
        // .getAttributes());
        for (Attribute attribute : mLeftChildOperator.getHeading()
                .getAttributes())
        {
            lst.add(attribute);
            for (Attribute attr : mRightChildOperator.getHeading()
                    .getAttributes())
            {
                if (!attribute.equals(attr, AttributeMatchMode.NAME_ONLY)
                        && !containsAttrName(lst, attr))
                {
                    lst.add(attr);
                }
            }
        }

        mOperatorHeading = new HeadingImpl(lst);
    }

    private boolean containsAttrName(List<Attribute> lst, Attribute attr)
    {
        for (Attribute attribute : lst)
        {
            if (attribute.equals(attr, AttributeMatchMode.NAME_ONLY))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public void validate() throws LQPException
    {
        super.validate();

        // for (int i = 0; i < lAttr.size(); i++)
        // {
        // if (!lAttr.get(i).equals(rAttr.get(i)))
        // {
        // throw new LQPException(
        // "Relations incompatibilie. Attributes do not match at position: "
        // + i);
        // }
        // }
    }

    /**
     * {@inheritDoc}
     */
    public void accept(OperatorVisitor visitor)
    {
        visitor.visit(this);
    }
}
