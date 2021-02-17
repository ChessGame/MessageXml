// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

public interface FireRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FireRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = FireReq];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = FireReq];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 gold = 3;</code>
   * @return Whether the gold field is set.
   */
  boolean hasGold();
  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 gold = 3;</code>
   * @return The gold.
   */
  int getGold();

  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleX = 4;</code>
   * @return Whether the angleX field is set.
   */
  boolean hasAngleX();
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleX = 4;</code>
   * @return The angleX.
   */
  float getAngleX();

  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleY = 5;</code>
   * @return Whether the angleY field is set.
   */
  boolean hasAngleY();
  /**
   * <pre>
   *角度
   * </pre>
   *
   * <code>optional float angleY = 5;</code>
   * @return The angleY.
   */
  float getAngleY();

  /**
   * <pre>
   *目标鱼
   * </pre>
   *
   * <code>optional int64 targetFishId = 6;</code>
   * @return Whether the targetFishId field is set.
   */
  boolean hasTargetFishId();
  /**
   * <pre>
   *目标鱼
   * </pre>
   *
   * <code>optional int64 targetFishId = 6;</code>
   * @return The targetFishId.
   */
  long getTargetFishId();
}
