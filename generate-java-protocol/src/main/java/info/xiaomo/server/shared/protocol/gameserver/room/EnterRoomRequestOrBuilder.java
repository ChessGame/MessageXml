// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

public interface EnterRoomRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnterRoomRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = EnterRoomReq];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = EnterRoomReq];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *房间类型 
   * </pre>
   *
   * <code>required .RoomType type = 2 [default = CLASSICS];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   *房间类型 
   * </pre>
   *
   * <code>required .RoomType type = 2 [default = CLASSICS];</code>
   * @return The type.
   */
  info.xiaomo.server.shared.protocol.gameserver.room.RoomType getType();

  /**
   * <pre>
   *房间级别
   * </pre>
   *
   * <code>required int32 rank = 3;</code>
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   * <pre>
   *房间级别
   * </pre>
   *
   * <code>required int32 rank = 3;</code>
   * @return The rank.
   */
  int getRank();
}
