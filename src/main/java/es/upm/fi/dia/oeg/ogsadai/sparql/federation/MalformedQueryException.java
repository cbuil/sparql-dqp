// Copyright (c) Universidad Politecnica de Madrid, 2009-2012.
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

package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import uk.org.ogsadai.exception.ErrorID;

/**
 * @author Carlos Buil Aranda
 * @email cbuil@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 *
 */
public class MalformedQueryException extends Exception
{
    
    /** The error ID. */
    public static final ErrorID ERROR_ID = 
        new ErrorID("uk.org.ogsadai.EXECUTION_ERROR");
    
    /**
     * Default constructor.
     */
    public MalformedQueryException()
    {
        super();
    }
    
    /**
     * Constructor.
     * 
     * @param message
     *            detailed exception message
     */
    public MalformedQueryException(String message) 
    {
        super(message);
    }
    
    /**
     * Constructor.
     * 
     * @param t
     *            exception cause
     */
    public MalformedQueryException(Throwable t)
    {
        super(t);
    }

}
