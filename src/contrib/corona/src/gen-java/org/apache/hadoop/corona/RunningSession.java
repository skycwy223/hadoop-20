/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.corona;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunningSession implements org.apache.thrift.TBase<RunningSession, RunningSession._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RunningSession");

  private static final org.apache.thrift.protocol.TField HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("handle", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField POOL_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("poolInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField DEADLINE_FIELD_DESC = new org.apache.thrift.protocol.TField("deadline", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField RUNNING_RESOURCES_FIELD_DESC = new org.apache.thrift.protocol.TField("runningResources", org.apache.thrift.protocol.TType.MAP, (short)7);

  public String handle; // required
  public String name; // required
  public String userId; // required
  public PoolInfoStrings poolInfo; // required
  /**
   * 
   * @see SessionPriority
   */
  public SessionPriority priority; // required
  public long deadline; // required
  public Map<ResourceType,Integer> runningResources; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HANDLE((short)1, "handle"),
    NAME((short)2, "name"),
    USER_ID((short)3, "userId"),
    POOL_INFO((short)4, "poolInfo"),
    /**
     * 
     * @see SessionPriority
     */
    PRIORITY((short)5, "priority"),
    DEADLINE((short)6, "deadline"),
    RUNNING_RESOURCES((short)7, "runningResources");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HANDLE
          return HANDLE;
        case 2: // NAME
          return NAME;
        case 3: // USER_ID
          return USER_ID;
        case 4: // POOL_INFO
          return POOL_INFO;
        case 5: // PRIORITY
          return PRIORITY;
        case 6: // DEADLINE
          return DEADLINE;
        case 7: // RUNNING_RESOURCES
          return RUNNING_RESOURCES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DEADLINE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HANDLE, new org.apache.thrift.meta_data.FieldMetaData("handle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "SessionHandle")));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POOL_INFO, new org.apache.thrift.meta_data.FieldMetaData("poolInfo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PoolInfoStrings.class)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SessionPriority.class)));
    tmpMap.put(_Fields.DEADLINE, new org.apache.thrift.meta_data.FieldMetaData("deadline", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RUNNING_RESOURCES, new org.apache.thrift.meta_data.FieldMetaData("runningResources", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RunningSession.class, metaDataMap);
  }

  public RunningSession() {
  }

  public RunningSession(
    String handle,
    String name,
    String userId,
    PoolInfoStrings poolInfo)
  {
    this();
    this.handle = handle;
    this.name = name;
    this.userId = userId;
    this.poolInfo = poolInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RunningSession(RunningSession other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHandle()) {
      this.handle = other.handle;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetPoolInfo()) {
      this.poolInfo = new PoolInfoStrings(other.poolInfo);
    }
    if (other.isSetPriority()) {
      this.priority = other.priority;
    }
    this.deadline = other.deadline;
    if (other.isSetRunningResources()) {
      Map<ResourceType,Integer> __this__runningResources = new HashMap<ResourceType,Integer>();
      for (Map.Entry<ResourceType, Integer> other_element : other.runningResources.entrySet()) {

        ResourceType other_element_key = other_element.getKey();
        Integer other_element_value = other_element.getValue();

        ResourceType __this__runningResources_copy_key = other_element_key;

        Integer __this__runningResources_copy_value = other_element_value;

        __this__runningResources.put(__this__runningResources_copy_key, __this__runningResources_copy_value);
      }
      this.runningResources = __this__runningResources;
    }
  }

  public RunningSession deepCopy() {
    return new RunningSession(this);
  }

  @Override
  public void clear() {
    this.handle = null;
    this.name = null;
    this.userId = null;
    this.poolInfo = null;
    this.priority = null;
    setDeadlineIsSet(false);
    this.deadline = 0;
    this.runningResources = null;
  }

  public String getHandle() {
    return this.handle;
  }

  public RunningSession setHandle(String handle) {
    this.handle = handle;
    return this;
  }

  public void unsetHandle() {
    this.handle = null;
  }

  /** Returns true if field handle is set (has been assigned a value) and false otherwise */
  public boolean isSetHandle() {
    return this.handle != null;
  }

  public void setHandleIsSet(boolean value) {
    if (!value) {
      this.handle = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public RunningSession setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getUserId() {
    return this.userId;
  }

  public RunningSession setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public PoolInfoStrings getPoolInfo() {
    return this.poolInfo;
  }

  public RunningSession setPoolInfo(PoolInfoStrings poolInfo) {
    this.poolInfo = poolInfo;
    return this;
  }

  public void unsetPoolInfo() {
    this.poolInfo = null;
  }

  /** Returns true if field poolInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolInfo() {
    return this.poolInfo != null;
  }

  public void setPoolInfoIsSet(boolean value) {
    if (!value) {
      this.poolInfo = null;
    }
  }

  /**
   * 
   * @see SessionPriority
   */
  public SessionPriority getPriority() {
    return this.priority;
  }

  /**
   * 
   * @see SessionPriority
   */
  public RunningSession setPriority(SessionPriority priority) {
    this.priority = priority;
    return this;
  }

  public void unsetPriority() {
    this.priority = null;
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return this.priority != null;
  }

  public void setPriorityIsSet(boolean value) {
    if (!value) {
      this.priority = null;
    }
  }

  public long getDeadline() {
    return this.deadline;
  }

  public RunningSession setDeadline(long deadline) {
    this.deadline = deadline;
    setDeadlineIsSet(true);
    return this;
  }

  public void unsetDeadline() {
    __isset_bit_vector.clear(__DEADLINE_ISSET_ID);
  }

  /** Returns true if field deadline is set (has been assigned a value) and false otherwise */
  public boolean isSetDeadline() {
    return __isset_bit_vector.get(__DEADLINE_ISSET_ID);
  }

  public void setDeadlineIsSet(boolean value) {
    __isset_bit_vector.set(__DEADLINE_ISSET_ID, value);
  }

  public int getRunningResourcesSize() {
    return (this.runningResources == null) ? 0 : this.runningResources.size();
  }

  public void putToRunningResources(ResourceType key, int val) {
    if (this.runningResources == null) {
      this.runningResources = new HashMap<ResourceType,Integer>();
    }
    this.runningResources.put(key, val);
  }

  public Map<ResourceType,Integer> getRunningResources() {
    return this.runningResources;
  }

  public RunningSession setRunningResources(Map<ResourceType,Integer> runningResources) {
    this.runningResources = runningResources;
    return this;
  }

  public void unsetRunningResources() {
    this.runningResources = null;
  }

  /** Returns true if field runningResources is set (has been assigned a value) and false otherwise */
  public boolean isSetRunningResources() {
    return this.runningResources != null;
  }

  public void setRunningResourcesIsSet(boolean value) {
    if (!value) {
      this.runningResources = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HANDLE:
      if (value == null) {
        unsetHandle();
      } else {
        setHandle((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case POOL_INFO:
      if (value == null) {
        unsetPoolInfo();
      } else {
        setPoolInfo((PoolInfoStrings)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((SessionPriority)value);
      }
      break;

    case DEADLINE:
      if (value == null) {
        unsetDeadline();
      } else {
        setDeadline((Long)value);
      }
      break;

    case RUNNING_RESOURCES:
      if (value == null) {
        unsetRunningResources();
      } else {
        setRunningResources((Map<ResourceType,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HANDLE:
      return getHandle();

    case NAME:
      return getName();

    case USER_ID:
      return getUserId();

    case POOL_INFO:
      return getPoolInfo();

    case PRIORITY:
      return getPriority();

    case DEADLINE:
      return Long.valueOf(getDeadline());

    case RUNNING_RESOURCES:
      return getRunningResources();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HANDLE:
      return isSetHandle();
    case NAME:
      return isSetName();
    case USER_ID:
      return isSetUserId();
    case POOL_INFO:
      return isSetPoolInfo();
    case PRIORITY:
      return isSetPriority();
    case DEADLINE:
      return isSetDeadline();
    case RUNNING_RESOURCES:
      return isSetRunningResources();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RunningSession)
      return this.equals((RunningSession)that);
    return false;
  }

  public boolean equals(RunningSession that) {
    if (that == null)
      return false;

    boolean this_present_handle = true && this.isSetHandle();
    boolean that_present_handle = true && that.isSetHandle();
    if (this_present_handle || that_present_handle) {
      if (!(this_present_handle && that_present_handle))
        return false;
      if (!this.handle.equals(that.handle))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_poolInfo = true && this.isSetPoolInfo();
    boolean that_present_poolInfo = true && that.isSetPoolInfo();
    if (this_present_poolInfo || that_present_poolInfo) {
      if (!(this_present_poolInfo && that_present_poolInfo))
        return false;
      if (!this.poolInfo.equals(that.poolInfo))
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (!this.priority.equals(that.priority))
        return false;
    }

    boolean this_present_deadline = true && this.isSetDeadline();
    boolean that_present_deadline = true && that.isSetDeadline();
    if (this_present_deadline || that_present_deadline) {
      if (!(this_present_deadline && that_present_deadline))
        return false;
      if (this.deadline != that.deadline)
        return false;
    }

    boolean this_present_runningResources = true && this.isSetRunningResources();
    boolean that_present_runningResources = true && that.isSetRunningResources();
    if (this_present_runningResources || that_present_runningResources) {
      if (!(this_present_runningResources && that_present_runningResources))
        return false;
      if (!this.runningResources.equals(that.runningResources))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RunningSession other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RunningSession typedOther = (RunningSession)other;

    lastComparison = Boolean.valueOf(isSetHandle()).compareTo(typedOther.isSetHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.handle, typedOther.handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, typedOther.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPoolInfo()).compareTo(typedOther.isSetPoolInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolInfo, typedOther.poolInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(typedOther.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, typedOther.priority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeadline()).compareTo(typedOther.isSetDeadline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeadline()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deadline, typedOther.deadline);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunningResources()).compareTo(typedOther.isSetRunningResources());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunningResources()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runningResources, typedOther.runningResources);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HANDLE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.handle = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // USER_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.userId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // POOL_INFO
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.poolInfo = new PoolInfoStrings();
            this.poolInfo.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PRIORITY
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.priority = SessionPriority.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DEADLINE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.deadline = iprot.readI64();
            setDeadlineIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // RUNNING_RESOURCES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map26 = iprot.readMapBegin();
              this.runningResources = new HashMap<ResourceType,Integer>(2*_map26.size);
              for (int _i27 = 0; _i27 < _map26.size; ++_i27)
              {
                ResourceType _key28; // required
                int _val29; // required
                _key28 = ResourceType.findByValue(iprot.readI32());
                _val29 = iprot.readI32();
                this.runningResources.put(_key28, _val29);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.handle != null) {
      oprot.writeFieldBegin(HANDLE_FIELD_DESC);
      oprot.writeString(this.handle);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.userId != null) {
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeString(this.userId);
      oprot.writeFieldEnd();
    }
    if (this.poolInfo != null) {
      oprot.writeFieldBegin(POOL_INFO_FIELD_DESC);
      this.poolInfo.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.priority != null) {
      if (isSetPriority()) {
        oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
        oprot.writeI32(this.priority.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (isSetDeadline()) {
      oprot.writeFieldBegin(DEADLINE_FIELD_DESC);
      oprot.writeI64(this.deadline);
      oprot.writeFieldEnd();
    }
    if (this.runningResources != null) {
      if (isSetRunningResources()) {
        oprot.writeFieldBegin(RUNNING_RESOURCES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, this.runningResources.size()));
          for (Map.Entry<ResourceType, Integer> _iter30 : this.runningResources.entrySet())
          {
            oprot.writeI32(_iter30.getKey().getValue());
            oprot.writeI32(_iter30.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RunningSession(");
    boolean first = true;

    sb.append("handle:");
    if (this.handle == null) {
      sb.append("null");
    } else {
      sb.append(this.handle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("poolInfo:");
    if (this.poolInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.poolInfo);
    }
    first = false;
    if (isSetPriority()) {
      if (!first) sb.append(", ");
      sb.append("priority:");
      if (this.priority == null) {
        sb.append("null");
      } else {
        sb.append(this.priority);
      }
      first = false;
    }
    if (isSetDeadline()) {
      if (!first) sb.append(", ");
      sb.append("deadline:");
      sb.append(this.deadline);
      first = false;
    }
    if (isSetRunningResources()) {
      if (!first) sb.append(", ");
      sb.append("runningResources:");
      if (this.runningResources == null) {
        sb.append("null");
      } else {
        sb.append(this.runningResources);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (handle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'handle' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (userId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not present! Struct: " + toString());
    }
    if (poolInfo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'poolInfo' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

