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

package org.apache.inlong.sdk.transform.encode;

import org.apache.inlong.sdk.transform.pojo.FieldInfo;
import org.apache.inlong.sdk.transform.pojo.KvSinkInfo;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;
import java.util.List;

/**
 * KvSinkEncoder
 */
public class KvSinkEncoder implements SinkEncoder {

    protected KvSinkInfo sinkInfo;
    protected Charset sinkCharset = Charset.defaultCharset();
    private List<FieldInfo> fields;
    private StringBuilder builder = new StringBuilder();

    public KvSinkEncoder(KvSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        if (!StringUtils.isBlank(sinkInfo.getCharset())) {
            this.sinkCharset = Charset.forName(sinkInfo.getCharset());
        }
        this.fields = sinkInfo.getFields();
    }

    /**
     * encode
     * @param sinkData
     * @return
     */
    @Override
    public String encode(SinkData sinkData) {
        if (fields == null || fields.size() == 0) {
            return "";
        }
        builder.delete(0, builder.length());
        for (FieldInfo field : fields) {
            String fieldName = field.getName();
            String fieldValue = sinkData.getField(fieldName);
            builder.append(fieldName).append('=').append(fieldValue).append('&');
        }
        return builder.substring(0, builder.length() - 1);
    }
}
