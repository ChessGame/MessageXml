// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package info.xiaomo.server.shared.protocol.server;

public interface ServerEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServerEventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .MID mid = 1 [default = ServerEventRes];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <code>optional .MID mid = 1 [default = ServerEventRes];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *事件类型  1踢玩家
   * </pre>
   *
   * <code>required int32 type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   *事件类型  1踢玩家
   * </pre>
   *
   * <code>required int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>optional int32 result = 3;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>optional int32 result = 3;</code>
   * @return The result.
   */
  int getResult();
}
