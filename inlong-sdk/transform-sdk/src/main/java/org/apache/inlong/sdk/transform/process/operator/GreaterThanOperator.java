/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.sdk.transform.process.operator;

import org.apache.inlong.sdk.transform.decode.SourceData;
import org.apache.inlong.sdk.transform.process.parser.ValueParser;

import net.sf.jsqlparser.expression.operators.relational.GreaterThan;
import org.apache.commons.lang.ObjectUtils;

/**
 * GreaterThanOperator
 * 
 */
public class GreaterThanOperator implements ExpressionOperator {

    private ValueParser left;
    private ValueParser right;

    public GreaterThanOperator(GreaterThan expr) {
        this.left = OperatorTools.buildParser(expr.getLeftExpression());
        this.right = OperatorTools.buildParser(expr.getRightExpression());
    }

    /**
     * check
     * @param sourceData
     * @param rowIndex
     * @return
     */
    @SuppressWarnings("rawtypes")
    @Override
    public boolean check(SourceData sourceData, int rowIndex) {
        return ObjectUtils.compare((Comparable) this.left.parse(sourceData, rowIndex),
                (Comparable) this.right.parse(sourceData, rowIndex)) > 0;
    }

}
