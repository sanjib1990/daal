/* file: GroupOfBetasMethod.java */
/*******************************************************************************
* Copyright 2014-2017 Intel Corporation
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

/**
 * @ingroup linear_regression_quality_metric_group_of_betas
 * @{
 */
package com.intel.daal.algorithms.linear_regression.quality_metric;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__LINEAR_REGRESSION__QUALITY_METRIC__GROUPOFBETASMETHOD"></a>
 * @brief Available methods for computing the quality metric
 */
public final class GroupOfBetasMethod {
    private int _value;

    public GroupOfBetasMethod(int value) {
        _value = value;
    }

    public int getValue() {
        return _value;
    }

    private static final int DefaultDense = 0;

    public static final GroupOfBetasMethod defaultDense = new GroupOfBetasMethod(DefaultDense); /*!< Default method */
}
/** @} */