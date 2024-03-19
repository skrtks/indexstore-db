// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Symbol.proto

package com.jetbrains.swift.indexStoreDB;

/**
 * Protobuf type {@code ProtoIndexStoreDB.SymbolOccurrences}
 */
public final class SymbolOccurrences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoIndexStoreDB.SymbolOccurrences)
    SymbolOccurrencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SymbolOccurrences.newBuilder() to construct.
  private SymbolOccurrences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SymbolOccurrences() {
    occurrence_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SymbolOccurrences();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jetbrains.swift.indexStoreDB.SymbolOccurrences.class, com.jetbrains.swift.indexStoreDB.SymbolOccurrences.Builder.class);
  }

  public static final int OCCURRENCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.jetbrains.swift.indexStoreDB.SymbolOccurrence> occurrence_;
  /**
   * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.jetbrains.swift.indexStoreDB.SymbolOccurrence> getOccurrenceList() {
    return occurrence_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder> 
      getOccurrenceOrBuilderList() {
    return occurrence_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
   */
  @java.lang.Override
  public int getOccurrenceCount() {
    return occurrence_.size();
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.SymbolOccurrence getOccurrence(int index) {
    return occurrence_.get(index);
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder getOccurrenceOrBuilder(
      int index) {
    return occurrence_.get(index);
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
    for (int i = 0; i < occurrence_.size(); i++) {
      output.writeMessage(1, occurrence_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < occurrence_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, occurrence_.get(i));
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
    if (!(obj instanceof com.jetbrains.swift.indexStoreDB.SymbolOccurrences)) {
      return super.equals(obj);
    }
    com.jetbrains.swift.indexStoreDB.SymbolOccurrences other = (com.jetbrains.swift.indexStoreDB.SymbolOccurrences) obj;

    if (!getOccurrenceList()
        .equals(other.getOccurrenceList())) return false;
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
    if (getOccurrenceCount() > 0) {
      hash = (37 * hash) + OCCURRENCE_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrenceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences parseFrom(
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
  public static Builder newBuilder(com.jetbrains.swift.indexStoreDB.SymbolOccurrences prototype) {
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
   * Protobuf type {@code ProtoIndexStoreDB.SymbolOccurrences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoIndexStoreDB.SymbolOccurrences)
      com.jetbrains.swift.indexStoreDB.SymbolOccurrencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jetbrains.swift.indexStoreDB.SymbolOccurrences.class, com.jetbrains.swift.indexStoreDB.SymbolOccurrences.Builder.class);
    }

    // Construct using com.jetbrains.swift.indexStoreDB.SymbolOccurrences.newBuilder()
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
      if (occurrenceBuilder_ == null) {
        occurrence_ = java.util.Collections.emptyList();
      } else {
        occurrence_ = null;
        occurrenceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrences_descriptor;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrences getDefaultInstanceForType() {
      return com.jetbrains.swift.indexStoreDB.SymbolOccurrences.getDefaultInstance();
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrences build() {
      com.jetbrains.swift.indexStoreDB.SymbolOccurrences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrences buildPartial() {
      com.jetbrains.swift.indexStoreDB.SymbolOccurrences result = new com.jetbrains.swift.indexStoreDB.SymbolOccurrences(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.jetbrains.swift.indexStoreDB.SymbolOccurrences result) {
      if (occurrenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          occurrence_ = java.util.Collections.unmodifiableList(occurrence_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.occurrence_ = occurrence_;
      } else {
        result.occurrence_ = occurrenceBuilder_.build();
      }
    }

    private void buildPartial0(com.jetbrains.swift.indexStoreDB.SymbolOccurrences result) {
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
      if (other instanceof com.jetbrains.swift.indexStoreDB.SymbolOccurrences) {
        return mergeFrom((com.jetbrains.swift.indexStoreDB.SymbolOccurrences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jetbrains.swift.indexStoreDB.SymbolOccurrences other) {
      if (other == com.jetbrains.swift.indexStoreDB.SymbolOccurrences.getDefaultInstance()) return this;
      if (occurrenceBuilder_ == null) {
        if (!other.occurrence_.isEmpty()) {
          if (occurrence_.isEmpty()) {
            occurrence_ = other.occurrence_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOccurrenceIsMutable();
            occurrence_.addAll(other.occurrence_);
          }
          onChanged();
        }
      } else {
        if (!other.occurrence_.isEmpty()) {
          if (occurrenceBuilder_.isEmpty()) {
            occurrenceBuilder_.dispose();
            occurrenceBuilder_ = null;
            occurrence_ = other.occurrence_;
            bitField0_ = (bitField0_ & ~0x00000001);
            occurrenceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOccurrenceFieldBuilder() : null;
          } else {
            occurrenceBuilder_.addAllMessages(other.occurrence_);
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
              com.jetbrains.swift.indexStoreDB.SymbolOccurrence m =
                  input.readMessage(
                      com.jetbrains.swift.indexStoreDB.SymbolOccurrence.PARSER,
                      extensionRegistry);
              if (occurrenceBuilder_ == null) {
                ensureOccurrenceIsMutable();
                occurrence_.add(m);
              } else {
                occurrenceBuilder_.addMessage(m);
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

    private java.util.List<com.jetbrains.swift.indexStoreDB.SymbolOccurrence> occurrence_ =
      java.util.Collections.emptyList();
    private void ensureOccurrenceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        occurrence_ = new java.util.ArrayList<com.jetbrains.swift.indexStoreDB.SymbolOccurrence>(occurrence_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.SymbolOccurrence, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder, com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder> occurrenceBuilder_;

    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.SymbolOccurrence> getOccurrenceList() {
      if (occurrenceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(occurrence_);
      } else {
        return occurrenceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public int getOccurrenceCount() {
      if (occurrenceBuilder_ == null) {
        return occurrence_.size();
      } else {
        return occurrenceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrence getOccurrence(int index) {
      if (occurrenceBuilder_ == null) {
        return occurrence_.get(index);
      } else {
        return occurrenceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder setOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.SymbolOccurrence value) {
      if (occurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrenceIsMutable();
        occurrence_.set(index, value);
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder setOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder builderForValue) {
      if (occurrenceBuilder_ == null) {
        ensureOccurrenceIsMutable();
        occurrence_.set(index, builderForValue.build());
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder addOccurrence(com.jetbrains.swift.indexStoreDB.SymbolOccurrence value) {
      if (occurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrenceIsMutable();
        occurrence_.add(value);
        onChanged();
      } else {
        occurrenceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder addOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.SymbolOccurrence value) {
      if (occurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrenceIsMutable();
        occurrence_.add(index, value);
        onChanged();
      } else {
        occurrenceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder addOccurrence(
        com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder builderForValue) {
      if (occurrenceBuilder_ == null) {
        ensureOccurrenceIsMutable();
        occurrence_.add(builderForValue.build());
        onChanged();
      } else {
        occurrenceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder addOccurrence(
        int index, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder builderForValue) {
      if (occurrenceBuilder_ == null) {
        ensureOccurrenceIsMutable();
        occurrence_.add(index, builderForValue.build());
        onChanged();
      } else {
        occurrenceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder addAllOccurrence(
        java.lang.Iterable<? extends com.jetbrains.swift.indexStoreDB.SymbolOccurrence> values) {
      if (occurrenceBuilder_ == null) {
        ensureOccurrenceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, occurrence_);
        onChanged();
      } else {
        occurrenceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder clearOccurrence() {
      if (occurrenceBuilder_ == null) {
        occurrence_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        occurrenceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public Builder removeOccurrence(int index) {
      if (occurrenceBuilder_ == null) {
        ensureOccurrenceIsMutable();
        occurrence_.remove(index);
        onChanged();
      } else {
        occurrenceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder getOccurrenceBuilder(
        int index) {
      return getOccurrenceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder getOccurrenceOrBuilder(
        int index) {
      if (occurrenceBuilder_ == null) {
        return occurrence_.get(index);  } else {
        return occurrenceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public java.util.List<? extends com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder> 
         getOccurrenceOrBuilderList() {
      if (occurrenceBuilder_ != null) {
        return occurrenceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(occurrence_);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder addOccurrenceBuilder() {
      return getOccurrenceFieldBuilder().addBuilder(
          com.jetbrains.swift.indexStoreDB.SymbolOccurrence.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder addOccurrenceBuilder(
        int index) {
      return getOccurrenceFieldBuilder().addBuilder(
          index, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.SymbolOccurrence occurrence = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder> 
         getOccurrenceBuilderList() {
      return getOccurrenceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.SymbolOccurrence, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder, com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder> 
        getOccurrenceFieldBuilder() {
      if (occurrenceBuilder_ == null) {
        occurrenceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.jetbrains.swift.indexStoreDB.SymbolOccurrence, com.jetbrains.swift.indexStoreDB.SymbolOccurrence.Builder, com.jetbrains.swift.indexStoreDB.SymbolOccurrenceOrBuilder>(
                occurrence_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        occurrence_ = null;
      }
      return occurrenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ProtoIndexStoreDB.SymbolOccurrences)
  }

  // @@protoc_insertion_point(class_scope:ProtoIndexStoreDB.SymbolOccurrences)
  private static final com.jetbrains.swift.indexStoreDB.SymbolOccurrences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jetbrains.swift.indexStoreDB.SymbolOccurrences();
  }

  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SymbolOccurrences>
      PARSER = new com.google.protobuf.AbstractParser<SymbolOccurrences>() {
    @java.lang.Override
    public SymbolOccurrences parsePartialFrom(
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

  public static com.google.protobuf.Parser<SymbolOccurrences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SymbolOccurrences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.SymbolOccurrences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
