// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface VideoSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.VideoSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Start offset in microseconds (inclusive). Unset means 0.
   * </pre>
   *
   * <code>int64 start_time_offset = 1;</code>
   */
  long getStartTimeOffset();

  /**
   *
   *
   * <pre>
   * End offset in microseconds (inclusive). Unset means 0.
   * </pre>
   *
   * <code>int64 end_time_offset = 2;</code>
   */
  long getEndTimeOffset();
}
