/* file: DistributedStep2MasterInputId.java */
/*******************************************************************************
* Copyright 2014-2016 Intel Corporation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

package com.intel.daal.algorithms.neural_networks.training;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__NEURAL_NETWORKS__TRAINING__DISTRIBUTEDSTEP2MASTERINPUTID"></a>
 * @brief Available identifiers of input objects for the neural network training algorithm on the master node
 */
public final class DistributedStep2MasterInputId {
    private int _value;

    public DistributedStep2MasterInputId(int value) {
        _value = value;
    }

    /**
     * Returns a value corresponding to the identifier of the input object
     * \return Value corresponding to the identifier
     */
    public int getValue() {
        return _value;
    }

    private static final int partialResultsId = 0;

    /** Collection of partial results obtained on local nodes */
    public static final DistributedStep2MasterInputId partialResults = new DistributedStep2MasterInputId(partialResultsId);
}