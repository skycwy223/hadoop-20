/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.mapred;

import java.io.InputStream;

/**
 * <code>RamManager</code> manages a memory pool of a configured limit.
 */
interface RamManager {
  /**
   * Reserve memory for data
   * 
   * @param requestedSize size of memory requested
   * @throws InterruptedException
   * @return <code>true</code> if memory was allocated immediately, 
   *         else <code>false</code>
   */
  void reserve(int requestedSize) throws InterruptedException;
  
  /**
   * Return memory to the pool.
   * 
   * @param requestedSize size of memory returned to the pool
   */
  void unreserve(int requestedSize);
}
