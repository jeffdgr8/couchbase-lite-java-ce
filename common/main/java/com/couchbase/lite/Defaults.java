//
// Copyright (c) 2025-present Couchbase, Inc All rights reserved.
//
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
//
package com.couchbase.lite;


// THIS IS AN AUTOGENERATED FILE, MANUAL CHANGES SHOULD BE EXPECTED TO BE OVERWRITTEN

public final class Defaults {
    private Defaults() { }

    public static final class Database {
        private Database() { }

        /**
         * Full sync is off by default because the performance hit is seldom worth the benefit
         */
        public static final boolean FULL_SYNC = false;

        /**
         * Memory mapped database files are enabled by default
         */
        public static final boolean MMAP_ENABLED = true;
    }

    public static final class LogFile {
        private LogFile() { }

        /**
         * Plaintext is not used, and instead binary encoding is used in log files
         */
        public static final boolean USE_PLAINTEXT = false;

        /**
         * 512 KiB for the size of a log file
         */
        public static final long MAX_SIZE = 524288;

        /**
         * 1 rotated file present (2 total, including the currently active log file)
         */
        public static final int MAX_ROTATE_COUNT = 1;
    }

    public static final class FileLogSink {
        private FileLogSink() { }

        /**
         * Plaintext is not used, and instead binary encoding is used in log files
         */
        public static final boolean USE_PLAINTEXT = false;

        /**
         * 512 KiB for the size of a log file
         */
        public static final long MAX_SIZE = 524288;

        /**
         * 2 files preserved during each log rotation
         */
        public static final int MAX_KEPT_FILES = 2;
    }

    public static final class FullTextIndex {
        private FullTextIndex() { }

        /**
         * Accents and ligatures are not ignored when indexing via full text search
         */
        public static final boolean IGNORE_ACCENTS = false;
    }

    public static final class Replicator {
        private Replicator() { }

        /**
         * Perform bidirectional replication
         */
        public static final ReplicatorType TYPE = ReplicatorType.PUSH_AND_PULL;

        /**
         * One-shot replication is used, and will stop once all initial changes are processed
         */
        public static final boolean CONTINUOUS = false;

        /**
         * A heartbeat messages is sent every 300 seconds to keep the connection alive
         */
        public static final int HEARTBEAT = 300;

        /**
         * When replicator is not continuous, after 10 failed attempts give up on the replication
         */
        public static final int MAX_ATTEMPTS_SINGLE_SHOT = 10;

        /**
         * When replicator is continuous, never give up unless explicitly stopped
         */
        public static final int MAX_ATTEMPTS_CONTINUOUS = Integer.MAX_VALUE;

        /**
         * Max wait time between retry attempts in seconds
         */
        public static final int MAX_ATTEMPTS_WAIT_TIME = 300;
        @Deprecated
        public static final int MAX_ATTEMPT_WAIT_TIME = MAX_ATTEMPTS_WAIT_TIME;

        /**
         * Purge documents when a user loses access
         */
        public static final boolean ENABLE_AUTO_PURGE = true;

        /**
         * Whether or not a replicator only accepts self-signed certificates from the remote
         */
        public static final boolean SELF_SIGNED_CERTIFICATE_ONLY = false;

        /**
         * Whether or not a replicator only accepts cookies for the sender's parent domains
         */
        public static final boolean ACCEPT_PARENT_COOKIES = false;
    }
}
