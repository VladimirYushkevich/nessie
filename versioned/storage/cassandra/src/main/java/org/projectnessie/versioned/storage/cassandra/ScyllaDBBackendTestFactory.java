/*
 * Copyright (C) 2022 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.projectnessie.versioned.storage.cassandra;

import static java.util.Arrays.asList;

import org.testcontainers.containers.CassandraContainer;

public class ScyllaDBBackendTestFactory extends AbstractCassandraBackendTestFactory {

  public ScyllaDBBackendTestFactory() {
    super(
        "scylladb/scylla",
        "scylladb",
        asList("--smp", "1", "--skip-wait-for-gossip-to-settle", "0"));
  }

  @Override
  protected void configureContainer(CassandraContainer<?> c) {}
}
