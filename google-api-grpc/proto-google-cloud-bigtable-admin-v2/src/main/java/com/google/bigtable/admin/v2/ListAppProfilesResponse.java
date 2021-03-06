// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * This is a private alpha release of Cloud Bigtable replication. This feature
 * is not currently available to most Cloud Bigtable customers. This feature
 * might be changed in backward-incompatible ways and is not recommended for
 * production use. It is not subject to any SLA or deprecation policy.
 * Response message for BigtableInstanceAdmin.ListAppProfiles.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.ListAppProfilesResponse}
 */
public  final class ListAppProfilesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.ListAppProfilesResponse)
    ListAppProfilesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAppProfilesResponse.newBuilder() to construct.
  private ListAppProfilesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAppProfilesResponse() {
    appProfiles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAppProfilesResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              appProfiles_ = new java.util.ArrayList<com.google.bigtable.admin.v2.AppProfile>();
              mutable_bitField0_ |= 0x00000001;
            }
            appProfiles_.add(
                input.readMessage(com.google.bigtable.admin.v2.AppProfile.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        appProfiles_ = java.util.Collections.unmodifiableList(appProfiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListAppProfilesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListAppProfilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.ListAppProfilesResponse.class, com.google.bigtable.admin.v2.ListAppProfilesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int APP_PROFILES_FIELD_NUMBER = 1;
  private java.util.List<com.google.bigtable.admin.v2.AppProfile> appProfiles_;
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  public java.util.List<com.google.bigtable.admin.v2.AppProfile> getAppProfilesList() {
    return appProfiles_;
  }
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  public java.util.List<? extends com.google.bigtable.admin.v2.AppProfileOrBuilder> 
      getAppProfilesOrBuilderList() {
    return appProfiles_;
  }
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  public int getAppProfilesCount() {
    return appProfiles_.size();
  }
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  public com.google.bigtable.admin.v2.AppProfile getAppProfiles(int index) {
    return appProfiles_.get(index);
  }
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfilesOrBuilder(
      int index) {
    return appProfiles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Set if not all app profiles could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Set if not all app profiles could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < appProfiles_.size(); i++) {
      output.writeMessage(1, appProfiles_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < appProfiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, appProfiles_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.bigtable.admin.v2.ListAppProfilesResponse)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.ListAppProfilesResponse other = (com.google.bigtable.admin.v2.ListAppProfilesResponse) obj;

    boolean result = true;
    result = result && getAppProfilesList()
        .equals(other.getAppProfilesList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAppProfilesCount() > 0) {
      hash = (37 * hash) + APP_PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getAppProfilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.ListAppProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.ListAppProfilesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * This is a private alpha release of Cloud Bigtable replication. This feature
   * is not currently available to most Cloud Bigtable customers. This feature
   * might be changed in backward-incompatible ways and is not recommended for
   * production use. It is not subject to any SLA or deprecation policy.
   * Response message for BigtableInstanceAdmin.ListAppProfiles.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.ListAppProfilesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.ListAppProfilesResponse)
      com.google.bigtable.admin.v2.ListAppProfilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListAppProfilesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListAppProfilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.ListAppProfilesResponse.class, com.google.bigtable.admin.v2.ListAppProfilesResponse.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.ListAppProfilesResponse.newBuilder()
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
        getAppProfilesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (appProfilesBuilder_ == null) {
        appProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        appProfilesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListAppProfilesResponse_descriptor;
    }

    public com.google.bigtable.admin.v2.ListAppProfilesResponse getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.ListAppProfilesResponse.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.ListAppProfilesResponse build() {
      com.google.bigtable.admin.v2.ListAppProfilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.ListAppProfilesResponse buildPartial() {
      com.google.bigtable.admin.v2.ListAppProfilesResponse result = new com.google.bigtable.admin.v2.ListAppProfilesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (appProfilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          appProfiles_ = java.util.Collections.unmodifiableList(appProfiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.appProfiles_ = appProfiles_;
      } else {
        result.appProfiles_ = appProfilesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.ListAppProfilesResponse) {
        return mergeFrom((com.google.bigtable.admin.v2.ListAppProfilesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.ListAppProfilesResponse other) {
      if (other == com.google.bigtable.admin.v2.ListAppProfilesResponse.getDefaultInstance()) return this;
      if (appProfilesBuilder_ == null) {
        if (!other.appProfiles_.isEmpty()) {
          if (appProfiles_.isEmpty()) {
            appProfiles_ = other.appProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAppProfilesIsMutable();
            appProfiles_.addAll(other.appProfiles_);
          }
          onChanged();
        }
      } else {
        if (!other.appProfiles_.isEmpty()) {
          if (appProfilesBuilder_.isEmpty()) {
            appProfilesBuilder_.dispose();
            appProfilesBuilder_ = null;
            appProfiles_ = other.appProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            appProfilesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAppProfilesFieldBuilder() : null;
          } else {
            appProfilesBuilder_.addAllMessages(other.appProfiles_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.ListAppProfilesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.ListAppProfilesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.bigtable.admin.v2.AppProfile> appProfiles_ =
      java.util.Collections.emptyList();
    private void ensureAppProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        appProfiles_ = new java.util.ArrayList<com.google.bigtable.admin.v2.AppProfile>(appProfiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder> appProfilesBuilder_;

    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public java.util.List<com.google.bigtable.admin.v2.AppProfile> getAppProfilesList() {
      if (appProfilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(appProfiles_);
      } else {
        return appProfilesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public int getAppProfilesCount() {
      if (appProfilesBuilder_ == null) {
        return appProfiles_.size();
      } else {
        return appProfilesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile getAppProfiles(int index) {
      if (appProfilesBuilder_ == null) {
        return appProfiles_.get(index);
      } else {
        return appProfilesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder setAppProfiles(
        int index, com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppProfilesIsMutable();
        appProfiles_.set(index, value);
        onChanged();
      } else {
        appProfilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder setAppProfiles(
        int index, com.google.bigtable.admin.v2.AppProfile.Builder builderForValue) {
      if (appProfilesBuilder_ == null) {
        ensureAppProfilesIsMutable();
        appProfiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        appProfilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder addAppProfiles(com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppProfilesIsMutable();
        appProfiles_.add(value);
        onChanged();
      } else {
        appProfilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder addAppProfiles(
        int index, com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppProfilesIsMutable();
        appProfiles_.add(index, value);
        onChanged();
      } else {
        appProfilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder addAppProfiles(
        com.google.bigtable.admin.v2.AppProfile.Builder builderForValue) {
      if (appProfilesBuilder_ == null) {
        ensureAppProfilesIsMutable();
        appProfiles_.add(builderForValue.build());
        onChanged();
      } else {
        appProfilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder addAppProfiles(
        int index, com.google.bigtable.admin.v2.AppProfile.Builder builderForValue) {
      if (appProfilesBuilder_ == null) {
        ensureAppProfilesIsMutable();
        appProfiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        appProfilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder addAllAppProfiles(
        java.lang.Iterable<? extends com.google.bigtable.admin.v2.AppProfile> values) {
      if (appProfilesBuilder_ == null) {
        ensureAppProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, appProfiles_);
        onChanged();
      } else {
        appProfilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder clearAppProfiles() {
      if (appProfilesBuilder_ == null) {
        appProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        appProfilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public Builder removeAppProfiles(int index) {
      if (appProfilesBuilder_ == null) {
        ensureAppProfilesIsMutable();
        appProfiles_.remove(index);
        onChanged();
      } else {
        appProfilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile.Builder getAppProfilesBuilder(
        int index) {
      return getAppProfilesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfilesOrBuilder(
        int index) {
      if (appProfilesBuilder_ == null) {
        return appProfiles_.get(index);  } else {
        return appProfilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public java.util.List<? extends com.google.bigtable.admin.v2.AppProfileOrBuilder> 
         getAppProfilesOrBuilderList() {
      if (appProfilesBuilder_ != null) {
        return appProfilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(appProfiles_);
      }
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile.Builder addAppProfilesBuilder() {
      return getAppProfilesFieldBuilder().addBuilder(
          com.google.bigtable.admin.v2.AppProfile.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile.Builder addAppProfilesBuilder(
        int index) {
      return getAppProfilesFieldBuilder().addBuilder(
          index, com.google.bigtable.admin.v2.AppProfile.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of requested app profiles.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
     */
    public java.util.List<com.google.bigtable.admin.v2.AppProfile.Builder> 
         getAppProfilesBuilderList() {
      return getAppProfilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder> 
        getAppProfilesFieldBuilder() {
      if (appProfilesBuilder_ == null) {
        appProfilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder>(
                appProfiles_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        appProfiles_ = null;
      }
      return appProfilesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Set if not all app profiles could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Set if not all app profiles could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Set if not all app profiles could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set if not all app profiles could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set if not all app profiles could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.ListAppProfilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.ListAppProfilesResponse)
  private static final com.google.bigtable.admin.v2.ListAppProfilesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.ListAppProfilesResponse();
  }

  public static com.google.bigtable.admin.v2.ListAppProfilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAppProfilesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAppProfilesResponse>() {
    public ListAppProfilesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAppProfilesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAppProfilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAppProfilesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.ListAppProfilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

