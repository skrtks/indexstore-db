// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Symbol.proto

package com.jetbrains.swift.indexStoreDB;

/**
 * Protobuf type {@code ProtoIndexStoreDB.Symbols}
 */
public final class Symbols extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoIndexStoreDB.Symbols)
    SymbolsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Symbols.newBuilder() to construct.
  private Symbols(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Symbols() {
    symbol_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Symbols();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_Symbols_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_Symbols_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jetbrains.swift.indexStoreDB.Symbols.class, com.jetbrains.swift.indexStoreDB.Symbols.Builder.class);
  }

  public static final int SYMBOL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.jetbrains.swift.indexStoreDB.Symbol> symbol_;
  /**
   * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.jetbrains.swift.indexStoreDB.Symbol> getSymbolList() {
    return symbol_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.jetbrains.swift.indexStoreDB.SymbolOrBuilder> 
      getSymbolOrBuilderList() {
    return symbol_;
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
   */
  @java.lang.Override
  public int getSymbolCount() {
    return symbol_.size();
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.Symbol getSymbol(int index) {
    return symbol_.get(index);
  }
  /**
   * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
   */
  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.SymbolOrBuilder getSymbolOrBuilder(
      int index) {
    return symbol_.get(index);
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
    for (int i = 0; i < symbol_.size(); i++) {
      output.writeMessage(1, symbol_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < symbol_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, symbol_.get(i));
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
    if (!(obj instanceof com.jetbrains.swift.indexStoreDB.Symbols)) {
      return super.equals(obj);
    }
    com.jetbrains.swift.indexStoreDB.Symbols other = (com.jetbrains.swift.indexStoreDB.Symbols) obj;

    if (!getSymbolList()
        .equals(other.getSymbolList())) return false;
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
    if (getSymbolCount() > 0) {
      hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
      hash = (53 * hash) + getSymbolList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jetbrains.swift.indexStoreDB.Symbols parseFrom(
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
  public static Builder newBuilder(com.jetbrains.swift.indexStoreDB.Symbols prototype) {
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
   * Protobuf type {@code ProtoIndexStoreDB.Symbols}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoIndexStoreDB.Symbols)
      com.jetbrains.swift.indexStoreDB.SymbolsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_Symbols_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_Symbols_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jetbrains.swift.indexStoreDB.Symbols.class, com.jetbrains.swift.indexStoreDB.Symbols.Builder.class);
    }

    // Construct using com.jetbrains.swift.indexStoreDB.Symbols.newBuilder()
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
      if (symbolBuilder_ == null) {
        symbol_ = java.util.Collections.emptyList();
      } else {
        symbol_ = null;
        symbolBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jetbrains.swift.indexStoreDB.IndexStoreDBProto.internal_static_ProtoIndexStoreDB_Symbols_descriptor;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.Symbols getDefaultInstanceForType() {
      return com.jetbrains.swift.indexStoreDB.Symbols.getDefaultInstance();
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.Symbols build() {
      com.jetbrains.swift.indexStoreDB.Symbols result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jetbrains.swift.indexStoreDB.Symbols buildPartial() {
      com.jetbrains.swift.indexStoreDB.Symbols result = new com.jetbrains.swift.indexStoreDB.Symbols(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.jetbrains.swift.indexStoreDB.Symbols result) {
      if (symbolBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          symbol_ = java.util.Collections.unmodifiableList(symbol_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.symbol_ = symbol_;
      } else {
        result.symbol_ = symbolBuilder_.build();
      }
    }

    private void buildPartial0(com.jetbrains.swift.indexStoreDB.Symbols result) {
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
      if (other instanceof com.jetbrains.swift.indexStoreDB.Symbols) {
        return mergeFrom((com.jetbrains.swift.indexStoreDB.Symbols)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jetbrains.swift.indexStoreDB.Symbols other) {
      if (other == com.jetbrains.swift.indexStoreDB.Symbols.getDefaultInstance()) return this;
      if (symbolBuilder_ == null) {
        if (!other.symbol_.isEmpty()) {
          if (symbol_.isEmpty()) {
            symbol_ = other.symbol_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSymbolIsMutable();
            symbol_.addAll(other.symbol_);
          }
          onChanged();
        }
      } else {
        if (!other.symbol_.isEmpty()) {
          if (symbolBuilder_.isEmpty()) {
            symbolBuilder_.dispose();
            symbolBuilder_ = null;
            symbol_ = other.symbol_;
            bitField0_ = (bitField0_ & ~0x00000001);
            symbolBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSymbolFieldBuilder() : null;
          } else {
            symbolBuilder_.addAllMessages(other.symbol_);
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
              com.jetbrains.swift.indexStoreDB.Symbol m =
                  input.readMessage(
                      com.jetbrains.swift.indexStoreDB.Symbol.PARSER,
                      extensionRegistry);
              if (symbolBuilder_ == null) {
                ensureSymbolIsMutable();
                symbol_.add(m);
              } else {
                symbolBuilder_.addMessage(m);
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

    private java.util.List<com.jetbrains.swift.indexStoreDB.Symbol> symbol_ =
      java.util.Collections.emptyList();
    private void ensureSymbolIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        symbol_ = new java.util.ArrayList<com.jetbrains.swift.indexStoreDB.Symbol>(symbol_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.Symbol, com.jetbrains.swift.indexStoreDB.Symbol.Builder, com.jetbrains.swift.indexStoreDB.SymbolOrBuilder> symbolBuilder_;

    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.Symbol> getSymbolList() {
      if (symbolBuilder_ == null) {
        return java.util.Collections.unmodifiableList(symbol_);
      } else {
        return symbolBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public int getSymbolCount() {
      if (symbolBuilder_ == null) {
        return symbol_.size();
      } else {
        return symbolBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.Symbol getSymbol(int index) {
      if (symbolBuilder_ == null) {
        return symbol_.get(index);
      } else {
        return symbolBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder setSymbol(
        int index, com.jetbrains.swift.indexStoreDB.Symbol value) {
      if (symbolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSymbolIsMutable();
        symbol_.set(index, value);
        onChanged();
      } else {
        symbolBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder setSymbol(
        int index, com.jetbrains.swift.indexStoreDB.Symbol.Builder builderForValue) {
      if (symbolBuilder_ == null) {
        ensureSymbolIsMutable();
        symbol_.set(index, builderForValue.build());
        onChanged();
      } else {
        symbolBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder addSymbol(com.jetbrains.swift.indexStoreDB.Symbol value) {
      if (symbolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSymbolIsMutable();
        symbol_.add(value);
        onChanged();
      } else {
        symbolBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder addSymbol(
        int index, com.jetbrains.swift.indexStoreDB.Symbol value) {
      if (symbolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSymbolIsMutable();
        symbol_.add(index, value);
        onChanged();
      } else {
        symbolBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder addSymbol(
        com.jetbrains.swift.indexStoreDB.Symbol.Builder builderForValue) {
      if (symbolBuilder_ == null) {
        ensureSymbolIsMutable();
        symbol_.add(builderForValue.build());
        onChanged();
      } else {
        symbolBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder addSymbol(
        int index, com.jetbrains.swift.indexStoreDB.Symbol.Builder builderForValue) {
      if (symbolBuilder_ == null) {
        ensureSymbolIsMutable();
        symbol_.add(index, builderForValue.build());
        onChanged();
      } else {
        symbolBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder addAllSymbol(
        java.lang.Iterable<? extends com.jetbrains.swift.indexStoreDB.Symbol> values) {
      if (symbolBuilder_ == null) {
        ensureSymbolIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, symbol_);
        onChanged();
      } else {
        symbolBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder clearSymbol() {
      if (symbolBuilder_ == null) {
        symbol_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        symbolBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public Builder removeSymbol(int index) {
      if (symbolBuilder_ == null) {
        ensureSymbolIsMutable();
        symbol_.remove(index);
        onChanged();
      } else {
        symbolBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.Symbol.Builder getSymbolBuilder(
        int index) {
      return getSymbolFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.SymbolOrBuilder getSymbolOrBuilder(
        int index) {
      if (symbolBuilder_ == null) {
        return symbol_.get(index);  } else {
        return symbolBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public java.util.List<? extends com.jetbrains.swift.indexStoreDB.SymbolOrBuilder> 
         getSymbolOrBuilderList() {
      if (symbolBuilder_ != null) {
        return symbolBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(symbol_);
      }
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.Symbol.Builder addSymbolBuilder() {
      return getSymbolFieldBuilder().addBuilder(
          com.jetbrains.swift.indexStoreDB.Symbol.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public com.jetbrains.swift.indexStoreDB.Symbol.Builder addSymbolBuilder(
        int index) {
      return getSymbolFieldBuilder().addBuilder(
          index, com.jetbrains.swift.indexStoreDB.Symbol.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoIndexStoreDB.Symbol symbol = 1;</code>
     */
    public java.util.List<com.jetbrains.swift.indexStoreDB.Symbol.Builder> 
         getSymbolBuilderList() {
      return getSymbolFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jetbrains.swift.indexStoreDB.Symbol, com.jetbrains.swift.indexStoreDB.Symbol.Builder, com.jetbrains.swift.indexStoreDB.SymbolOrBuilder> 
        getSymbolFieldBuilder() {
      if (symbolBuilder_ == null) {
        symbolBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.jetbrains.swift.indexStoreDB.Symbol, com.jetbrains.swift.indexStoreDB.Symbol.Builder, com.jetbrains.swift.indexStoreDB.SymbolOrBuilder>(
                symbol_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        symbol_ = null;
      }
      return symbolBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ProtoIndexStoreDB.Symbols)
  }

  // @@protoc_insertion_point(class_scope:ProtoIndexStoreDB.Symbols)
  private static final com.jetbrains.swift.indexStoreDB.Symbols DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jetbrains.swift.indexStoreDB.Symbols();
  }

  public static com.jetbrains.swift.indexStoreDB.Symbols getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Symbols>
      PARSER = new com.google.protobuf.AbstractParser<Symbols>() {
    @java.lang.Override
    public Symbols parsePartialFrom(
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

  public static com.google.protobuf.Parser<Symbols> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Symbols> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jetbrains.swift.indexStoreDB.Symbols getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

