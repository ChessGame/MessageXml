// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

/**
 * <pre>
 *开炮
 * </pre>
 *
 * Protobuf type {@code FireRequest}
 */
public final class FireRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FireRequest)
    FireRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FireRequest.newBuilder() to construct.
  private FireRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FireRequest() {
    mid_ = 20015;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FireRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FireRequest(
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
          case 24: {
            bitField0_ |= 0x00000002;
            gold_ = input.readInt32();
            break;
          }
          case 37: {
            bitField0_ |= 0x00000004;
            angleX_ = input.readFloat();
            break;
          }
          case 45: {
            bitField0_ |= 0x00000008;
            angleY_ = input.readFloat();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            targetFishId_ = input.readInt64();
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
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.class, info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = FireReq];</code>
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
   * <code>optional .MID mid = 1 [default = FireReq];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.FireReq : result;
  }

  public static final int GOLD_FIELD_NUMBER = 3;
  private int gold_;
  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 gold = 3;</code>
   * @return Whether the gold field is set.
   */
  @java.lang.Override
  public boolean hasGold() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 gold = 3;</code>
   * @return The gold.
   */
  @java.lang.Override
  public int getGold() {
    return gold_;
  }

  public static final int ANGLEX_FIELD_NUMBER = 4;
  private float angleX_;
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleX = 4;</code>
   * @return Whether the angleX field is set.
   */
  @java.lang.Override
  public boolean hasAngleX() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleX = 4;</code>
   * @return The angleX.
   */
  @java.lang.Override
  public float getAngleX() {
    return angleX_;
  }

  public static final int ANGLEY_FIELD_NUMBER = 5;
  private float angleY_;
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleY = 5;</code>
   * @return Whether the angleY field is set.
   */
  @java.lang.Override
  public boolean hasAngleY() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleY = 5;</code>
   * @return The angleY.
   */
  @java.lang.Override
  public float getAngleY() {
    return angleY_;
  }

  public static final int TARGETFISHID_FIELD_NUMBER = 6;
  private long targetFishId_;
  /**
   * <pre>
   *目标鱼
   * </pre>
   *
   * <code>optional int64 targetFishId = 6;</code>
   * @return Whether the targetFishId field is set.
   */
  @java.lang.Override
  public boolean hasTargetFishId() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   *目标鱼
   * </pre>
   *
   * <code>optional int64 targetFishId = 6;</code>
   * @return The targetFishId.
   */
  @java.lang.Override
  public long getTargetFishId() {
    return targetFishId_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(3, gold_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeFloat(4, angleX_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeFloat(5, angleY_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(6, targetFishId_);
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
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, gold_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, angleX_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, angleY_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, targetFishId_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest other = (info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (hasGold() != other.hasGold()) return false;
    if (hasGold()) {
      if (getGold()
          != other.getGold()) return false;
    }
    if (hasAngleX() != other.hasAngleX()) return false;
    if (hasAngleX()) {
      if (java.lang.Float.floatToIntBits(getAngleX())
          != java.lang.Float.floatToIntBits(
              other.getAngleX())) return false;
    }
    if (hasAngleY() != other.hasAngleY()) return false;
    if (hasAngleY()) {
      if (java.lang.Float.floatToIntBits(getAngleY())
          != java.lang.Float.floatToIntBits(
              other.getAngleY())) return false;
    }
    if (hasTargetFishId() != other.hasTargetFishId()) return false;
    if (hasTargetFishId()) {
      if (getTargetFishId()
          != other.getTargetFishId()) return false;
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
    if (hasGold()) {
      hash = (37 * hash) + GOLD_FIELD_NUMBER;
      hash = (53 * hash) + getGold();
    }
    if (hasAngleX()) {
      hash = (37 * hash) + ANGLEX_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAngleX());
    }
    if (hasAngleY()) {
      hash = (37 * hash) + ANGLEY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAngleY());
    }
    if (hasTargetFishId()) {
      hash = (37 * hash) + TARGETFISHID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetFishId());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest prototype) {
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
   *开炮
   * </pre>
   *
   * Protobuf type {@code FireRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FireRequest)
      info.xiaomo.server.shared.protocol.gameserver.fight.FireRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.class, info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.newBuilder()
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
      mid_ = 20015;
      bitField0_ = (bitField0_ & ~0x00000001);
      gold_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      angleX_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000004);
      angleY_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000008);
      targetFishId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest build() {
      info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest result = new info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gold_ = gold_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.angleX_ = angleX_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.angleY_ = angleY_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.targetFishId_ = targetFishId_;
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (other.hasGold()) {
        setGold(other.getGold());
      }
      if (other.hasAngleX()) {
        setAngleX(other.getAngleX());
      }
      if (other.hasAngleY()) {
        setAngleY(other.getAngleY());
      }
      if (other.hasTargetFishId()) {
        setTargetFishId(other.getTargetFishId());
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
      info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 20015;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = FireReq];</code>
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
     * <code>optional .MID mid = 1 [default = FireReq];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.FireReq : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = FireReq];</code>
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
     * <code>optional .MID mid = 1 [default = FireReq];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 20015;
      onChanged();
      return this;
    }

    private int gold_ ;
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 gold = 3;</code>
     * @return Whether the gold field is set.
     */
    @java.lang.Override
    public boolean hasGold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 gold = 3;</code>
     * @return The gold.
     */
    @java.lang.Override
    public int getGold() {
      return gold_;
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 gold = 3;</code>
     * @param value The gold to set.
     * @return This builder for chaining.
     */
    public Builder setGold(int value) {
      bitField0_ |= 0x00000002;
      gold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 gold = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gold_ = 0;
      onChanged();
      return this;
    }

    private float angleX_ ;
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleX = 4;</code>
     * @return Whether the angleX field is set.
     */
    @java.lang.Override
    public boolean hasAngleX() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleX = 4;</code>
     * @return The angleX.
     */
    @java.lang.Override
    public float getAngleX() {
      return angleX_;
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleX = 4;</code>
     * @param value The angleX to set.
     * @return This builder for chaining.
     */
    public Builder setAngleX(float value) {
      bitField0_ |= 0x00000004;
      angleX_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleX = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAngleX() {
      bitField0_ = (bitField0_ & ~0x00000004);
      angleX_ = 0F;
      onChanged();
      return this;
    }

    private float angleY_ ;
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleY = 5;</code>
     * @return Whether the angleY field is set.
     */
    @java.lang.Override
    public boolean hasAngleY() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleY = 5;</code>
     * @return The angleY.
     */
    @java.lang.Override
    public float getAngleY() {
      return angleY_;
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleY = 5;</code>
     * @param value The angleY to set.
     * @return This builder for chaining.
     */
    public Builder setAngleY(float value) {
      bitField0_ |= 0x00000008;
      angleY_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *角度
     * </pre>
     *
     * <code>optional float angleY = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAngleY() {
      bitField0_ = (bitField0_ & ~0x00000008);
      angleY_ = 0F;
      onChanged();
      return this;
    }

    private long targetFishId_ ;
    /**
     * <pre>
     *目标鱼
     * </pre>
     *
     * <code>optional int64 targetFishId = 6;</code>
     * @return Whether the targetFishId field is set.
     */
    @java.lang.Override
    public boolean hasTargetFishId() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     *目标鱼
     * </pre>
     *
     * <code>optional int64 targetFishId = 6;</code>
     * @return The targetFishId.
     */
    @java.lang.Override
    public long getTargetFishId() {
      return targetFishId_;
    }
    /**
     * <pre>
     *目标鱼
     * </pre>
     *
     * <code>optional int64 targetFishId = 6;</code>
     * @param value The targetFishId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFishId(long value) {
      bitField0_ |= 0x00000010;
      targetFishId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *目标鱼
     * </pre>
     *
     * <code>optional int64 targetFishId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetFishId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      targetFishId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:FireRequest)
  }

  // @@protoc_insertion_point(class_scope:FireRequest)
  private static final info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FireRequest>
      PARSER = new com.google.protobuf.AbstractParser<FireRequest>() {
    @java.lang.Override
    public FireRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FireRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FireRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FireRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.fight.FireRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

