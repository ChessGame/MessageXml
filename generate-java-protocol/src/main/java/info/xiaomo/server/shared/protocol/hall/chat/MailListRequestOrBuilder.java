// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallChatMessage.proto

package info.xiaomo.server.shared.protocol.hall.chat;

public interface MailListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MailListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = MailListReq];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = MailListReq];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();
}
