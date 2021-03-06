// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface CreateProductSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.CreateProductSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project in which the ProductSet should be created.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The project in which the ProductSet should be created.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The ProductSet to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 2;</code>
   */
  boolean hasProductSet();
  /**
   *
   *
   * <pre>
   * The ProductSet to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 2;</code>
   */
  com.google.cloud.vision.v1.ProductSet getProductSet();
  /**
   *
   *
   * <pre>
   * The ProductSet to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 2;</code>
   */
  com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetOrBuilder();

  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this ProductSet. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_set_id = 3;</code>
   */
  java.lang.String getProductSetId();
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this ProductSet. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_set_id = 3;</code>
   */
  com.google.protobuf.ByteString getProductSetIdBytes();
}
