// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *帮会列表，加入时的申请列表
 * </pre>
 *
 * Protobuf type {@code GuildListRequest}
 */
public final class GuildListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuildListRequest)
    GuildListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuildListRequest.newBuilder() to construct.
  private GuildListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuildListRequest() {
    mid_ = 10027;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuildListRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuildListRequest(
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
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            info.xiaomo.server.shared.protocol.Mid.MID value = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              mid_ = rawValue;
            }
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
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.class, info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = GuildListReq];</code>
   * @return Whether the mid field is set.
   */
  @java.lang.Override public boolean hasMid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = GuildListReq];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.GuildListReq : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, mid_);
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
        .computeEnumSize(1, mid_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest other = (info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
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
    if (hasMid()) {
      hash = (37 * hash) + MID_FIELD_NUMBER;
      hash = (53 * hash) + mid_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest prototype) {
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
   *帮会列表，加入时的申请列表
   * </pre>
   *
   * Protobuf type {@code GuildListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuildListRequest)
      info.xiaomo.server.shared.protocol.hall.guild.GuildListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.class, info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.newBuilder()
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
      mid_ = 10027;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest build() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest result = new info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 10027;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListReq];</code>
     * @return Whether the mid field is set.
     */
    @java.lang.Override public boolean hasMid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListReq];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.GuildListReq : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListReq];</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(info.xiaomo.server.shared.protocol.Mid.MID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mid_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListReq];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 10027;
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


    // @@protoc_insertion_point(builder_scope:GuildListRequest)
  }

  // @@protoc_insertion_point(class_scope:GuildListRequest)
  private static final info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GuildListRequest>
      PARSER = new com.google.protobuf.AbstractParser<GuildListRequest>() {
    @java.lang.Override
    public GuildListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuildListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuildListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuildListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

