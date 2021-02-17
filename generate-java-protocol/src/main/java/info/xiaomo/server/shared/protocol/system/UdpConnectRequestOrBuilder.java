// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SystemMessage.proto

package info.xiaomo.server.shared.protocol.system;

public interface UdpConnectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UdpConnectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = UdpConnectReq];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = UdpConnectReq];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *tcp会话ID
   * </pre>
   *
   * <code>optional int64 sessionId = 2;</code>
   * @return Whether the sessionId field is set.
   */
  boolean hasSessionId();
  /**
   * <pre>
   *tcp会话ID
   * </pre>
   *
   * <code>optional int64 sessionId = 2;</code>
   * @return The sessionId.
   */
  long getSessionId();

  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>optional int64 rid = 3;</code>
   * @return Whether the rid field is set.
   */
  boolean hasRid();
  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>optional int64 rid = 3;</code>
   * @return The rid.
   */
  long getRid();
}
