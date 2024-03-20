// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Symbol.proto

package com.jetbrains.swift.indexStoreDB;

/**
 * Protobuf type {@code ProtoIndexStoreDB.LightOccurrences}
 */
public final class LightOccurrences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoIndexStoreDB.LightOccurrences)
    LightOccurrencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightOccurrences.newBuilder() to construct.
  private LightOccurrences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightOccurrences() {
    lightOccurrence_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LightOccurrences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_LightOccurrences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_LightOccurrences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jetbrains.swift.indexStoreDB.LightOccurrences.class, com.jetbrains.swift.indexStoreDB.LightOccurrences.Builder.class);
  }

  public static final int LIGHT_OCCURRENCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.jetbrains.swift.indexStoreDB.LightOccurrence> lightOccurrence_;
  /**
   * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.jetbrains.swift.indexStoreDB.LightOccurrence> getLightOccurrenceList() {
    return lightOccurrence_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder> 
      getLightOccurrenceOrBuilderList() {
    return lightOccurrence_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
   */
  @java.lang.Override
  public int getLightOccurrenceCount() {
    return lightOccurrence_.size();
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.LightOccurrence getLightOccurrence(int index) {
    return lightOccurrence_.get(index);
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder getLightOccurrenceOrBuilder(
      int index) {
    return lightOccurrence_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < lightOccurrence_.size(); i++) {
      output.writeMessage(1, lightOccurrence_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lightOccurrence_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lightOccurrence_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.jetbrains.swift.indexStoreDB.LightOccurrences)) {
      return super.equals(obj);
    }
    com.jetbrains.swift.indexStoreDB.LightOccurrences other = (com.jetbrains.swift.indexStoreDB.LightOccurrences) obj;

    if (!getLightOccurrenceList()
        .equals(other.getLightOccurrenceList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLightOccurrenceCount() > 0) {
      hash = (37 * hash) + LIGHT_OCCURRENCE_FIELD_NUMBER;
      hash = (53 * hash) + getLightOccurrenceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.LightOccurrences parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.jetbrains.swift.indexStoreDB.LightOccurrences prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ProtoIndexStoreDB.LightOccurrences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoIndexStoreDB.LightOccurrences)
      com.jetbrains.swift.indexStoreDB.LightOccurrencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_LightOccurrences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_LightOccurrences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jetbrains.swift.indexStoreDB.LightOccurrences.class, com.jetbrains.swift.indexStoreDB.LightOccurrences.Builder.class);
    }

    // Construct using com.jetbrains.swift.indexStoreDB.LightOccurrences.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (lightOccurrenceBuilder_ == null) {
        lightOccurrence_ = java.util.Collections.emptyList();
      } else {
        lightOccurrence_ = null;
        lightOccurrenceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_LightOccurrences_descriptor;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.LightOccurrences getDefaultInstanceForType() {
      return com.jetbrains.swift.indexStoreDB.LightOccurrences.getDefaultInstance();
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.LightOccurrences build() {
      com.jetbrains.swift.indexStoreDB.LightOccurrences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.LightOccurrences buildPartial() {
      com.jetbrains.swift.indexStoreDB.LightOccurrences result = new com.jetbrains.swift.indexStoreDB.LightOccurrences(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.jetbrains.swift.indexStoreDB.LightOccurrences result) {
      if (lightOccurrenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lightOccurrence_ = java.util.Collections.unmodifiableList(lightOccurrence_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lightOccurrence_ = lightOccurrence_;
      } else {
        result.lightOccurrence_ = lightOccurrenceBuilder_.build();
      }
    }

    private void buildPartial0(com.jetbrains.swift.indexStoreDB.LightOccurrences result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jetbrains.swift.indexStoreDB.LightOccurrences) {
        return mergeFrom((com.jetbrains.swift.indexStoreDB.LightOccurrences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jetbrains.swift.indexStoreDB.LightOccurrences other) {
      if (other == com.jetbrains.swift.indexStoreDB.LightOccurrences.getDefaultInstance()) return this;
      if (lightOccurrenceBuilder_ == null) {
        if (!other.lightOccurrence_.isEmpty()) {
          if (lightOccurrence_.isEmpty()) {
            lightOccurrence_ = other.lightOccurrence_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLightOccurrenceIsMutable();
            lightOccurrence_.addAll(other.lightOccurrence_);
          }
          onChanged();
        }
      } else {
        if (!other.lightOccurrence_.isEmpty()) {
          if (lightOccurrenceBuilder_.isEmpty()) {
            lightOccurrenceBuilder_.dispose();
            lightOccurrenceBuilder_ = null;
            lightOccurrence_ = other.lightOccurrence_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lightOccurrenceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLightOccurrenceFieldBuilder() : null;
          } else {
            lightOccurrenceBuilder_.addAllMessages(other.lightOccurrence_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.jetbrains.swift.indexStoreDB.LightOccurrence m =
                  input.readMessage(
                      com.jetbrains.swift.indexStoreDB.LightOccurrence.PARSER,
                      extensionRegistry);
              if (lightOccurrenceBuilder_ == null) {
                ensureLightOccurrenceIsMutable();
                lightOccurrence_.add(m);
              } else {
                lightOccurrenceBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.jetbrains.swift.indexStoreDB.LightOccurrence> lightOccurrence_ =
      java.util.Collections.emptyList();
    private void ensureLightOccurrenceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lightOccurrence_ = new java.util.ArrayList<com.jetbrains.swift.indexStoreDB.LightOccurrence>(lightOccurrence_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.LightOccurrence, com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder, com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder> lightOccurrenceBuilder_;

    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.LightOccurrence> getLightOccurrenceList() {
      if (lightOccurrenceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lightOccurrence_);
      } else {
        return lightOccurrenceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public int getLightOccurrenceCount() {
      if (lightOccurrenceBuilder_ == null) {
        return lightOccurrence_.size();
      } else {
        return lightOccurrenceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.LightOccurrence getLightOccurrence(int index) {
      if (lightOccurrenceBuilder_ == null) {
        return lightOccurrence_.get(index);
      } else {
        return lightOccurrenceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder setLightOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.LightOccurrence value) {
      if (lightOccurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.set(index, value);
        onChanged();
      } else {
        lightOccurrenceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder setLightOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder builderForValue) {
      if (lightOccurrenceBuilder_ == null) {
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.set(index, builderForValue.build());
        onChanged();
      } else {
        lightOccurrenceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder addLightOccurrence(com.jetbrains.swift.indexStoreDB.LightOccurrence value) {
      if (lightOccurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.add(value);
        onChanged();
      } else {
        lightOccurrenceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder addLightOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.LightOccurrence value) {
      if (lightOccurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.add(index, value);
        onChanged();
      } else {
        lightOccurrenceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder addLightOccurrence(
        com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder builderForValue) {
      if (lightOccurrenceBuilder_ == null) {
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.add(builderForValue.build());
        onChanged();
      } else {
        lightOccurrenceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder addLightOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder builderForValue) {
      if (lightOccurrenceBuilder_ == null) {
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.add(index, builderForValue.build());
        onChanged();
      } else {
        lightOccurrenceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder addAllLightOccurrence(
        java.lang.Iterable<? extends com.jetbrains.swift.indexStoreDB.LightOccurrence> values) {
      if (lightOccurrenceBuilder_ == null) {
        ensureLightOccurrenceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lightOccurrence_);
        onChanged();
      } else {
        lightOccurrenceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder clearLightOccurrence() {
      if (lightOccurrenceBuilder_ == null) {
        lightOccurrence_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lightOccurrenceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public Builder removeLightOccurrence(int index) {
      if (lightOccurrenceBuilder_ == null) {
        ensureLightOccurrenceIsMutable();
        lightOccurrence_.remove(index);
        onChanged();
      } else {
        lightOccurrenceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder getLightOccurrenceBuilder(
        int index) {
      return getLightOccurrenceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder getLightOccurrenceOrBuilder(
        int index) {
      if (lightOccurrenceBuilder_ == null) {
        return lightOccurrence_.get(index);  } else {
        return lightOccurrenceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public java.util.List<? extends com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder> 
         getLightOccurrenceOrBuilderList() {
      if (lightOccurrenceBuilder_ != null) {
        return lightOccurrenceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lightOccurrence_);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder addLightOccurrenceBuilder() {
      return getLightOccurrenceFieldBuilder().addBuilder(
          com.jetbrains.swift.indexStoreDB.LightOccurrence.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder addLightOccurrenceBuilder(
        int index) {
      return getLightOccurrenceFieldBuilder().addBuilder(
          index, com.jetbrains.swift.indexStoreDB.LightOccurrence.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.LightOccurrence light_occurrence = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder> 
         getLightOccurrenceBuilderList() {
      return getLightOccurrenceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.LightOccurrence, com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder, com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder> 
        getLightOccurrenceFieldBuilder() {
      if (lightOccurrenceBuilder_ == null) {
        lightOccurrenceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.jetbrains.swift.indexStoreDB.LightOccurrence, com.jetbrains.swift.indexStoreDB.LightOccurrence.Builder, com.jetbrains.swift.indexStoreDB.LightOccurrenceOrBuilder>(
                lightOccurrence_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lightOccurrence_ = null;
      }
      return lightOccurrenceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ProtoIndexStoreDB.LightOccurrences)
  }

  // @@protoc_insertion_point(class_scope:ProtoIndexStoreDB.LightOccurrences)
  private static final com.jetbrains.swift.indexStoreDB.LightOccurrences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jetbrains.swift.indexStoreDB.LightOccurrences();
  }

  public static com.jetbrains.swift.indexStoreDB.LightOccurrences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LightOccurrences>
      PARSER = new com.google.protobuf.AbstractParser<LightOccurrences>() {
    @java.lang.Override
    public LightOccurrences parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LightOccurrences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightOccurrences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.LightOccurrences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

