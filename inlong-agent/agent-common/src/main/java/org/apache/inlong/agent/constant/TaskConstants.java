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

package org.apache.inlong.agent.constant;

/**
 * Basic config for a single task
 */
public class TaskConstants extends CommonConstants {

    // job id
    // public static final String JOB_ID = "job.id";
    public static final String TASK_ID = "task.id";
    public static final String INSTANCE_ID = "instance.id";
    public static final String JOB_INSTANCE_ID = "job.instance.id";
    public static final String INSTANCE_CREATE_TIME = "instance.createTime";
    public static final String INSTANCE_MODIFY_TIME = "instance.modifyTime";
    public static final String TASK_GROUP_ID = "task.groupId";
    public static final String TASK_STREAM_ID = "task.streamId";
    public static final String RESTORE_FROM_DB = "task.restoreFromDB";

    public static final String TASK_SOURCE = "task.source";

    public static final String TASK_CHANNEL = "task.channel";

    public static final String TASK_CLASS = "task.taskClass";
    public static final String INSTANCE_CLASS = "task.instance.class";
    public static final String TASK_FILE_TRIGGER = "task.fileTask.trigger";

    // sink config
    public static final String TASK_SINK = "task.sink";
    public static final String TASK_PROXY_SEND = "task.proxySend";
    public static final boolean DEFAULT_TASK_PROXY_SEND = false;
    public static final String TASK_MQ_CLUSTERS = "task.mqClusters";
    public static final String TASK_MQ_TOPIC = "task.topicInfo";
    public static final String OFFSET = "offset";
    public static final Long DEFAULT_OFFSET = -1L;
    public static final String INODE_INFO = "inodeInfo";

    // File task
    public static final String TASK_DIR_FILTER_PATTERN = "task.fileTask.dir.pattern"; // deprecated
    public static final String FILE_DIR_FILTER_PATTERNS = "task.fileTask.dir.patterns";
    public static final String TASK_FILE_TIME_OFFSET = "task.fileTask.timeOffset";
    public static final String TASK_TIME_ZONE = "task.timeZone";
    public static final String TASK_CYCLE_UNIT = "task.cycleUnit";
    public static final String FILE_TASK_CYCLE_UNIT = "task.fileTask.cycleUnit";
    public static final String TASK_FILE_CONTENT_COLLECT_TYPE = "task.fileTask.contentCollectType";
    public static final String SOURCE_DATA_CONTENT_STYLE = "task.fileTask.dataContentStyle";
    public static final String SOURCE_DATA_SEPARATOR = "task.fileTask.dataSeparator";
    public static final String TASK_RETRY = "task.fileTask.retry";
    public static final String TASK_START_TIME = "task.fileTask.startTime";
    public static final String TASK_END_TIME = "task.fileTask.endTime";
    public static final String FILE_MAX_NUM = "task.fileTask.maxFileCount";
    public static final String PREDEFINE_FIELDS = "task.predefinedFields";
    public static final String FILE_SOURCE_EXTEND_CLASS = "task.fileTask.extendedClass";
    public static final String DEFAULT_FILE_SOURCE_EXTEND_CLASS =
            "org.apache.inlong.agent.plugin.sources.file.extend.ExtendedHandler";

    // Kafka task
    public static final String TASK_KAFKA_TOPIC = "task.kafkaTask.topic";
    public static final String TASK_KAFKA_BOOTSTRAP_SERVERS = "task.kafkaTask.bootstrap.servers";
    public static final String TASK_KAFKA_OFFSET = "task.kafkaTask.partition.offset";
    public static final String TASK_KAFKA_AUTO_COMMIT_OFFSET_RESET = "task.kafkaTask.autoOffsetReset";

    /**
     * delimiter to split offset for different task
     */
    public static final String TASK_KAFKA_OFFSET_DELIMITER = "_";

    /**
     * delimiter to split all partition offset for all kafka tasks
     */
    public static final String TASK_KAFKA_PARTITION_OFFSET_DELIMITER = "#";

    // Pulsar task
    public static final String TASK_PULSAR_TENANT = "task.pulsarTask.tenant";
    public static final String TASK_PULSAR_NAMESPACE = "task.pulsarTask.namespace";
    public static final String TASK_PULSAR_TOPIC = "task.pulsarTask.topic";
    public static final String TASK_PULSAR_SUBSCRIPTION = "task.pulsarTask.subscription";
    public static final String TASK_PULSAR_SUBSCRIPTION_TYPE = "task.pulsarTask.subscriptionType";
    public static final String TASK_PULSAR_SERVICE_URL = "task.pulsarTask.serviceUrl";
    public static final String TASK_PULSAR_SUBSCRIPTION_POSITION = "task.pulsarTask.subscriptionPosition";
    public static final String TASK_PULSAR_RESET_TIME = "task.pulsarTask.resetTime";

    public static final String TASK_MONGO_HOSTS = "task.mongoTask.hosts";
    public static final String TASK_MONGO_USER = "task.mongoTask.user";
    public static final String TASK_MONGO_PASSWORD = "task.mongoTask.password";
    public static final String TASK_MONGO_DATABASE_INCLUDE_LIST = "task.mongoTask.databaseIncludeList";
    public static final String TASK_MONGO_DATABASE_EXCLUDE_LIST = "task.mongoTask.databaseExcludeList";
    public static final String TASK_MONGO_COLLECTION_INCLUDE_LIST = "task.mongoTask.collectionIncludeList";
    public static final String TASK_MONGO_COLLECTION_EXCLUDE_LIST = "task.mongoTask.collectionExcludeList";
    public static final String TASK_MONGO_FIELD_EXCLUDE_LIST = "task.mongoTask.fieldExcludeList";
    public static final String TASK_MONGO_SNAPSHOT_MODE = "task.mongoTask.snapshotMode";
    public static final String TASK_MONGO_CAPTURE_MODE = "task.mongoTask.captureMode";
    public static final String TASK_MONGO_QUEUE_SIZE = "task.mongoTask.queueSize";
    public static final String TASK_MONGO_STORE_HISTORY_FILENAME = "task.mongoTask.history.filename";
    public static final String TASK_MONGO_OFFSET_SPECIFIC_OFFSET_FILE = "task.mongoTask.offset.specificOffsetFile";
    public static final String TASK_MONGO_OFFSET_SPECIFIC_OFFSET_POS = "task.mongoTask.offset.specificOffsetPos";
    public static final String TASK_MONGO_OFFSETS = "task.mongoTask.offsets";
    public static final String TASK_MONGO_CONNECT_TIMEOUT_MS = "task.mongoTask.connectTimeoutInMs";
    public static final String TASK_MONGO_CURSOR_MAX_AWAIT = "task.mongoTask.cursorMaxAwaitTimeInMs";
    public static final String TASK_MONGO_SOCKET_TIMEOUT = "task.mongoTask.socketTimeoutInMs";
    public static final String TASK_MONGO_SELECTION_TIMEOUT = "task.mongoTask.selectionTimeoutInMs";
    public static final String TASK_MONGO_FIELD_RENAMES = "task.mongoTask.fieldRenames";
    public static final String TASK_MONGO_MEMBERS_DISCOVER = "task.mongoTask.membersAutoDiscover";
    public static final String TASK_MONGO_CONNECT_MAX_ATTEMPTS = "task.mongoTask.connectMaxAttempts";
    public static final String TASK_MONGO_BACKOFF_MAX_DELAY = "task.mongoTask.connectBackoffMaxDelayInMs";
    public static final String TASK_MONGO_BACKOFF_INITIAL_DELAY = "task.mongoTask.connectBackoffInitialDelayInMs";
    public static final String TASK_MONGO_INITIAL_SYNC_MAX_THREADS = "task.mongoTask.initialSyncMaxThreads";
    public static final String TASK_MONGO_SSL_INVALID_HOSTNAME_ALLOWED = "task.mongoTask.sslInvalidHostnameAllowed";
    public static final String TASK_MONGO_SSL_ENABLE = "task.mongoTask.sslEnabled";
    public static final String TASK_MONGO_POLL_INTERVAL = "task.mongoTask.pollIntervalInMs";

    public static final String TASK_STATE = "task.state";

    public static final String INSTANCE_STATE = "instance.state";

    public static final String FILE_UPDATE_TIME = "fileUpdateTime";

    public static final String LAST_UPDATE_TIME = "lastUpdateTime";

    // data time reading file
    public static final String SOURCE_DATA_TIME = "source.dataTime";

    // data time for sink
    public static final String SINK_DATA_TIME = "sink.dataTime";

    /**
     * when job is retried, the retry time should be provided
     */
    public static final String TASK_RETRY_TIME = "task.retryTime";

    /**
     * sync send data when sending to DataProxy
     */
    public static final int SYNC_SEND_OPEN = 1;

}
