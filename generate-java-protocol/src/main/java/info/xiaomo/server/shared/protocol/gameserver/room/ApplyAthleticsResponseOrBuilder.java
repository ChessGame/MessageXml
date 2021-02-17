// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

public interface ApplyAthleticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApplyAthleticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = ApplyAthleticsRes];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = ApplyAthleticsRes];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>optional int32 result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>optional int32 result = 2;</code>
   * @return The result.
   */
  int getResult();

  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @return A list containing the roleId.
   */
  java.util.List<java.lang.Long> getRoleIdList();
  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @return The count of roleId.
   */
  int getRoleIdCount();
  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @param index The index of the element to return.
   * @return The roleId at the given index.
   */
  long getRoleId(int index);
}
