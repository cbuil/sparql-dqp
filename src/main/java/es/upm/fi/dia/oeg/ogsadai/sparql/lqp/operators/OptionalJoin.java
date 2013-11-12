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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import uk.org.ogsadai.expression.IncomparableTypesException;
import uk.org.ogsadai.tuple.ColumnNotFoundException;
import uk.org.ogsadai.tuple.Null;
import uk.org.ogsadai.tuple.SimpleTuple;
import uk.org.ogsadai.tuple.Tuple;
import uk.org.ogsadai.tuple.TupleMetadata;
import uk.org.ogsadai.tuple.TypeMismatchException;
import uk.org.ogsadai.tuple.join.ConfigurationException;
import uk.org.ogsadai.tuple.join.ThetaJoin;

/**
 * A simple implementation of an outer join which stores one tuple list and
 * streams the other one.
 * 
 * @author The OGSA-DAI Project Team.
 */
public class OptionalJoin extends ThetaJoin 
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE =
        "Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2011";
    
    /** List of stored tuples. */
    private List<Tuple> mStoredTuples = new LinkedList<Tuple>();
    private int mColumnCount;

    /**
     * {@inheritDoc}
     */
    public void configure(TupleMetadata left, TupleMetadata right)
        throws ColumnNotFoundException, 
           TypeMismatchException,
           IncomparableTypesException,
           ConfigurationException
    {
        super.configure(left, right);
        if (mStoreLeft)
        {
            mColumnCount = left.getColumnCount();
        }
        else
        {
            mColumnCount = right.getColumnCount();
        }
    }
    
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    protected Iterator<Tuple> getCandidateMatches(Tuple tuple)
//    {
//        return mStoredTuples.iterator();
//    }

//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    protected void storeTuple(Tuple tuple)
//    {
//        mStoredTuples.add(tuple);
//    }

    public Iterable<Tuple> join(final Tuple tuple)
    {
        Iterable<Tuple> matches = super.join(tuple);
        final Iterator<Tuple> iterator = matches.iterator();
        return new Iterable<Tuple>() 
        {

            public Iterator<Tuple> iterator()
            {
                return new Iterator<Tuple>()
                {
                    private boolean mIsFirst = true;
                    private Tuple mNext;

                    public boolean hasNext()
                    { 
                        if (mIsFirst)
                        {
                            mIsFirst = false;
                            if (iterator.hasNext())
                            {
                                return true;
                            }
                            else
                            {
                                mNext = getNullJoinedTuple(tuple);
                                return true;
                            }
                        }
                        else
                        {
                            return iterator.hasNext();
                        }
                    }

                    public Tuple next()
                    {
                        if (mNext != null)
                        {
                            Tuple result = mNext;
                            mNext = null;
                            return result;
                        }
                        else
                        {
                            return iterator.next();
                        }
                    }

                    public void remove()
                    {
                        throw new UnsupportedOperationException();
                    }
                    
                };
            }
            
        };
    }
    
    private Tuple getNullJoinedTuple(Tuple tuple)
    {
        if (mStoreLeft)
        {
            Tuple left = createNullTuple(mColumnCount);
            return new SimpleTuple(left, tuple); 
        }
        else
        {
            Tuple right = createNullTuple(mColumnCount);
            return new SimpleTuple(tuple, right); 
        }

    }
    
    /**
     * Creates a null tuple with the given number of columns.
     * 
     * @param columnCount
     *            number of columns
     * @return a null tuple
     */
    private Tuple createNullTuple(int columnCount)
    {
        List<Object> elements = new ArrayList<Object>(columnCount);
        for (int i=0; i<columnCount; i++)
        {
            elements.add(Null.getValue());
        }
        return new SimpleTuple(elements);
    }

    
}

