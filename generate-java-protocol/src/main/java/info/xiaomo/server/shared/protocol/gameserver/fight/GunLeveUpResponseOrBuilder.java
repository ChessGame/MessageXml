// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

public interface GunLeveUpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GunLeveUpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = GunLeveUpRes];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = GunLeveUpRes];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <code>optional int32 result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>optional int32 result = 2;</code>
   * @return The result.
   */
  int getResult();
}
