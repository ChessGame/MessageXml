// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *公会成员信息
 * </pre>
 *
 * Protobuf type {@code GuildMemberInfo}
 */
public final class GuildMemberInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuildMemberInfo)
    GuildMemberInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuildMemberInfo.newBuilder() to construct.
  private GuildMemberInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuildMemberInfo() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuildMemberInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuildMemberInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            roleId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            name_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            level_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildMemberInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildMemberInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.class, info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ROLEID_FIELD_NUMBER = 1;
  private long roleId_;
  /**
   * <pre>
   *角色Id
   * </pre>
   *
   * <code>required int64 roleId = 1;</code>
   * @return Whether the roleId field is set.
   */
  @java.lang.Override
  public boolean hasRoleId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *角色Id
   * </pre>
   *
   * <code>required int64 roleId = 1;</code>
   * @return The roleId.
   */
  @java.lang.Override
  public long getRoleId() {
    return roleId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   *昵称
   * </pre>
   *
   * <code>required string name = 2;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *昵称
   * </pre>
   *
   * <code>required string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *昵称
   * </pre>
   *
   * <code>required string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 3;
  private int level_;
  /**
   * <pre>
   *等级
   * </pre>
   *
   * <code>required int32 level = 3;</code>
   * @return Whether the level field is set.
   */
  @java.lang.Override
  public boolean hasLevel() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *等级
   * </pre>
   *
   * <code>required int32 level = 3;</code>
   * @return The level.
   */
  @java.lang.Override
  public int getLevel() {
    return level_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasRoleId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasName()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasLevel()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, roleId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, level_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, roleId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, level_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo other = (info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo) obj;

    if (hasRoleId() != other.hasRoleId()) return false;
    if (hasRoleId()) {
      if (getRoleId()
          != other.getRoleId()) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasLevel() != other.hasLevel()) return false;
    if (hasLevel()) {
      if (getLevel()
          != other.getLevel()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRoleId()) {
      hash = (37 * hash) + ROLEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRoleId());
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasLevel()) {
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *公会成员信息
   * </pre>
   *
   * Protobuf type {@code GuildMemberInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuildMemberInfo)
      info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildMemberInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildMemberInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.class, info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      roleId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      level_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildMemberInfo_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo build() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo result = new info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.roleId_ = roleId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.level_ = level_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo.getDefaultInstance()) return this;
      if (other.hasRoleId()) {
        setRoleId(other.getRoleId());
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasLevel()) {
        setLevel(other.getLevel());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasRoleId()) {
        return false;
      }
      if (!hasName()) {
        return false;
      }
      if (!hasLevel()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long roleId_ ;
    /**
     * <pre>
     *角色Id
     * </pre>
     *
     * <code>required int64 roleId = 1;</code>
     * @return Whether the roleId field is set.
     */
    @java.lang.Override
    public boolean hasRoleId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *角色Id
     * </pre>
     *
     * <code>required int64 roleId = 1;</code>
     * @return The roleId.
     */
    @java.lang.Override
    public long getRoleId() {
      return roleId_;
    }
    /**
     * <pre>
     *角色Id
     * </pre>
     *
     * <code>required int64 roleId = 1;</code>
     * @param value The roleId to set.
     * @return This builder for chaining.
     */
    public Builder setRoleId(long value) {
      bitField0_ |= 0x00000001;
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *角色Id
     * </pre>
     *
     * <code>required int64 roleId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      roleId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *昵称
     * </pre>
     *
     * <code>required string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <pre>
     *等级
     * </pre>
     *
     * <code>required int32 level = 3;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *等级
     * </pre>
     *
     * <code>required int32 level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }
    /**
     * <pre>
     *等级
     * </pre>
     *
     * <code>required int32 level = 3;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      bitField0_ |= 0x00000004;
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *等级
     * </pre>
     *
     * <code>required int32 level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      level_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GuildMemberInfo)
  }

  // @@protoc_insertion_point(class_scope:GuildMemberInfo)
  private static final info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GuildMemberInfo>
      PARSER = new com.google.protobuf.AbstractParser<GuildMemberInfo>() {
    @java.lang.Override
    public GuildMemberInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuildMemberInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuildMemberInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuildMemberInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildMemberInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

