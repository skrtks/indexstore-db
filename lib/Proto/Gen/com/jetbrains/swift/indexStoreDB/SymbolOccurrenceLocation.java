// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Symbol.proto

package com.jetbrains.swift.indexStoreDB;

/**
 * Protobuf type {@code ProtoIndexStoreDB.SymbolOccurrenceLocation}
 */
public final class SymbolOccurrenceLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoIndexStoreDB.SymbolOccurrenceLocation)
    SymbolOccurrenceLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SymbolOccurrenceLocation.newBuilder() to construct.
  private SymbolOccurrenceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SymbolOccurrenceLocation() {
    path_ = "";
    moduleName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SymbolOccurrenceLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrenceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrenceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.class, com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.Builder.class);
  }

  private int bitField0_;
  public static final int PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <code>optional string path = 1;</code>
   * @return Whether the path field is set.
   */
  @java.lang.Override
  public boolean hasPath() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string path = 1;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        path_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string path = 1;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODULE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object moduleName_ = "";
  /**
   * <code>optional string module_name = 2;</code>
   * @return Whether the moduleName field is set.
   */
  @java.lang.Override
  public boolean hasModuleName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string module_name = 2;</code>
   * @return The moduleName.
   */
  @java.lang.Override
  public java.lang.String getModuleName() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        moduleName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string module_name = 2;</code>
   * @return The bytes for moduleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleNameBytes() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moduleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_FIELD_NUMBER = 3;
  private int line_ = 0;
  /**
   * <code>optional uint32 line = 3;</code>
   * @return Whether the line field is set.
   */
  @java.lang.Override
  public boolean hasLine() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 line = 3;</code>
   * @return The line.
   */
  @java.lang.Override
  public int getLine() {
    return line_;
  }

  public static final int COLUMN_FIELD_NUMBER = 4;
  private int column_ = 0;
  /**
   * <code>optional uint32 column = 4;</code>
   * @return Whether the column field is set.
   */
  @java.lang.Override
  public boolean hasColumn() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional uint32 column = 4;</code>
   * @return The column.
   */
  @java.lang.Override
  public int getColumn() {
    return column_;
  }

  public static final int IS_SYSTEM_FIELD_NUMBER = 5;
  private boolean isSystem_ = false;
  /**
   * <code>optional bool is_system = 5;</code>
   * @return Whether the isSystem field is set.
   */
  @java.lang.Override
  public boolean hasIsSystem() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional bool is_system = 5;</code>
   * @return The isSystem.
   */
  @java.lang.Override
  public boolean getIsSystem() {
    return isSystem_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, moduleName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, line_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, column_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBool(5, isSystem_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, moduleName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, line_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, column_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isSystem_);
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
    if (!(obj instanceof com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation)) {
      return super.equals(obj);
    }
    com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation other = (com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation) obj;

    if (hasPath() != other.hasPath()) return false;
    if (hasPath()) {
      if (!getPath()
          .equals(other.getPath())) return false;
    }
    if (hasModuleName() != other.hasModuleName()) return false;
    if (hasModuleName()) {
      if (!getModuleName()
          .equals(other.getModuleName())) return false;
    }
    if (hasLine() != other.hasLine()) return false;
    if (hasLine()) {
      if (getLine()
          != other.getLine()) return false;
    }
    if (hasColumn() != other.hasColumn()) return false;
    if (hasColumn()) {
      if (getColumn()
          != other.getColumn()) return false;
    }
    if (hasIsSystem() != other.hasIsSystem()) return false;
    if (hasIsSystem()) {
      if (getIsSystem()
          != other.getIsSystem()) return false;
    }
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
    if (hasPath()) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
    }
    if (hasModuleName()) {
      hash = (37 * hash) + MODULE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getModuleName().hashCode();
    }
    if (hasLine()) {
      hash = (37 * hash) + LINE_FIELD_NUMBER;
      hash = (53 * hash) + getLine();
    }
    if (hasColumn()) {
      hash = (37 * hash) + COLUMN_FIELD_NUMBER;
      hash = (53 * hash) + getColumn();
    }
    if (hasIsSystem()) {
      hash = (37 * hash) + IS_SYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSystem());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation parseFrom(
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
  public static Builder newBuilder(com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation prototype) {
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
   * Protobuf type {@code ProtoIndexStoreDB.SymbolOccurrenceLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoIndexStoreDB.SymbolOccurrenceLocation)
      com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrenceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrenceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.class, com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.Builder.class);
    }

    // Construct using com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.newBuilder()
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
      path_ = "";
      moduleName_ = "";
      line_ = 0;
      column_ = 0;
      isSystem_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_SymbolOccurrenceLocation_descriptor;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation getDefaultInstanceForType() {
      return com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation build() {
      com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation buildPartial() {
      com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation result = new com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.moduleName_ = moduleName_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.line_ = line_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.column_ = column_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.isSystem_ = isSystem_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation) {
        return mergeFrom((com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation other) {
      if (other == com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation.getDefaultInstance()) return this;
      if (other.hasPath()) {
        path_ = other.path_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasModuleName()) {
        moduleName_ = other.moduleName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLine()) {
        setLine(other.getLine());
      }
      if (other.hasColumn()) {
        setColumn(other.getColumn());
      }
      if (other.hasIsSystem()) {
        setIsSystem(other.getIsSystem());
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
              path_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              moduleName_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              line_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              column_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              isSystem_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object path_ = "";
    /**
     * <code>optional string path = 1;</code>
     * @return Whether the path field is set.
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string path = 1;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string path = 1;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string path = 1;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 1;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object moduleName_ = "";
    /**
     * <code>optional string module_name = 2;</code>
     * @return Whether the moduleName field is set.
     */
    public boolean hasModuleName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string module_name = 2;</code>
     * @return The moduleName.
     */
    public java.lang.String getModuleName() {
      java.lang.Object ref = moduleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          moduleName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string module_name = 2;</code>
     * @return The bytes for moduleName.
     */
    public com.google.protobuf.ByteString
        getModuleNameBytes() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moduleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string module_name = 2;</code>
     * @param value The moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      moduleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string module_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleName() {
      moduleName_ = getDefaultInstance().getModuleName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string module_name = 2;</code>
     * @param value The bytes for moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      moduleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int line_ ;
    /**
     * <code>optional uint32 line = 3;</code>
     * @return Whether the line field is set.
     */
    @java.lang.Override
    public boolean hasLine() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 line = 3;</code>
     * @return The line.
     */
    @java.lang.Override
    public int getLine() {
      return line_;
    }
    /**
     * <code>optional uint32 line = 3;</code>
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(int value) {
      
      line_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 line = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLine() {
      bitField0_ = (bitField0_ & ~0x00000004);
      line_ = 0;
      onChanged();
      return this;
    }

    private int column_ ;
    /**
     * <code>optional uint32 column = 4;</code>
     * @return Whether the column field is set.
     */
    @java.lang.Override
    public boolean hasColumn() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint32 column = 4;</code>
     * @return The column.
     */
    @java.lang.Override
    public int getColumn() {
      return column_;
    }
    /**
     * <code>optional uint32 column = 4;</code>
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(int value) {
      
      column_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 column = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      bitField0_ = (bitField0_ & ~0x00000008);
      column_ = 0;
      onChanged();
      return this;
    }

    private boolean isSystem_ ;
    /**
     * <code>optional bool is_system = 5;</code>
     * @return Whether the isSystem field is set.
     */
    @java.lang.Override
    public boolean hasIsSystem() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bool is_system = 5;</code>
     * @return The isSystem.
     */
    @java.lang.Override
    public boolean getIsSystem() {
      return isSystem_;
    }
    /**
     * <code>optional bool is_system = 5;</code>
     * @param value The isSystem to set.
     * @return This builder for chaining.
     */
    public Builder setIsSystem(boolean value) {
      
      isSystem_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_system = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSystem() {
      bitField0_ = (bitField0_ & ~0x00000010);
      isSystem_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ProtoIndexStoreDB.SymbolOccurrenceLocation)
  }

  // @@protoc_insertion_point(class_scope:ProtoIndexStoreDB.SymbolOccurrenceLocation)
  private static final com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation();
  }

  public static com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SymbolOccurrenceLocation>
      PARSER = new com.google.protobuf.AbstractParser<SymbolOccurrenceLocation>() {
    @java.lang.Override
    public SymbolOccurrenceLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<SymbolOccurrenceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SymbolOccurrenceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.SymbolOccurrenceLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

