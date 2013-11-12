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

package es.upm.fi.dia.oeg.ogsadai.sparql.optimizers;

import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.cardinality.CardinalityEstimator;

/**
 * Empty implementation for skipping a bug in the OGSA-DQP cardinality estimator
 * @author Carlos Buil Aranda
 *
 */
public class NOOPCardinalityEstimatorOptimiser implements CardinalityEstimator
{

    public Operator estimateCardinalities(Operator lqpRoot)
    {
        // it does nothing, No Operation
        return lqpRoot;
    }

}
