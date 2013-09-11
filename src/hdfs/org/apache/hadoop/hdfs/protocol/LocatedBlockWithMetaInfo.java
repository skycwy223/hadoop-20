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
package org.apache.hadoop.hdfs.protocol;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableFactories;
import org.apache.hadoop.io.WritableFactory;

/**
 * A block with its location and NameNode meta info
 * like data transfer version number and namespace id.
 */
public class LocatedBlockWithMetaInfo extends VersionedLocatedBlock {
  private int namespaceid = -1;  // namespace id
  private int methodFingerPrint;

  LocatedBlockWithMetaInfo() {
  }
  
  public LocatedBlockWithMetaInfo(Block b, DatanodeInfo[] locs, long startOffset, 
      int dataProtocolVersion, int namespaceid, int methodFingerPrint) {
    super(b, locs, startOffset, dataProtocolVersion);
    this.namespaceid = namespaceid;
    this.methodFingerPrint = methodFingerPrint;
  }

  /**
   * Get namespace id
   */
  public int getNamespaceID() {
    return this.namespaceid;
  }
  
  public int getMethodFingerPrint() {
    return methodFingerPrint;
  }

  //////////////////////////////////////////////////
  // Writable
  //////////////////////////////////////////////////
  static {                                      // register a ctor
    WritableFactories.setFactory
      (LocatedBlockWithMetaInfo.class,
       new WritableFactory() {
         public Writable newInstance() { return new LocatedBlockWithMetaInfo(); }
       });
  }

  public void write(DataOutput out) throws IOException {
    out.writeInt(this.namespaceid);
    out.writeInt(methodFingerPrint);
    super.write(out);
  }
  
  public void readFields(DataInput in) throws IOException {
    this.namespaceid = in.readInt();
    this.methodFingerPrint = in.readInt();
    super.readFields(in);
  }
}
