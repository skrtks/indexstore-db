#!/bin/sh

# Determine the architecture to use the correct protoc
case "$(uname -s)" in
  Darwin)
    case "$(uname -m)" in
      arm64)   PROTOC_OS_NAME="osx-aarch_64" ;;
      x86_64)  PROTOC_OS_NAME="osx-x86_64" ;;
      *)       echo "unrecognized macOS architecture"; exit 1 ;;
    esac;;
  *)       echo "unrecognized os"; exit 1 ;;
esac

# Get the absolute path of Proto directory
PROTO_DIR=$(git rev-parse --show-toplevel)/lib/Proto

# Load versions configuration
. "$PROTO_DIR/versions.config"

# Define directories for protoc binaries and caches
PROTOC_BIN_DIR="${PROTOC_BIN_DIR:-$(git rev-parse --show-toplevel)/third_party/protobuf/bin}"
PROTOC_CACHE_DIR="${PROTOC_CACHE_DIR:-$(dirname "$PROTOC_BIN_DIR")/cache}"

# Ensure these directories exist
mkdir -p "$PROTOC_BIN_DIR"
mkdir -p "$PROTOC_CACHE_DIR"

# Function to download and unzip the protoc version for the specific OS
getProtoc() {
  _protoc_version=$1
  _protoc_zip_name="protoc-$_protoc_version-$PROTOC_OS_NAME.zip"
  test -f "$PROTOC_CACHE_DIR/$_protoc_zip_name" || \
  wget -O "$PROTOC_CACHE_DIR/$_protoc_zip_name" \
    "https://github.com/protocolbuffers/protobuf/releases/download/v$_protoc_version/$_protoc_zip_name"

  _protoc_dir="$PROTOC_BIN_DIR/$_protoc_version"
  mkdir -p "$_protoc_dir"

  # Unzip the protoc distribution into the version specific sub-directory:
  unzip -j "$PROTOC_CACHE_DIR/$_protoc_zip_name" -d "$_protoc_dir" bin/protoc || (
    rm -f "$PROTOC_CACHE_DIR/$_protoc_zip_name" # Delete corrupted download
    exit 1
  )
}

# Run getProtoc for each Protobuf version (JAVA and CPP)
for version in $JAVA_PROTOC_VERSION $CPP_PROTOC_VERSION
do
  getProtoc "$version"
done

# Use the downloaded protoc to generate the necessary code from .proto files
"$PROTOC_BIN_DIR/$CPP_PROTOC_VERSION/protoc" -I="$PROTO_DIR"/Gen --cpp_out="$PROTO_DIR"/Gen "$PROTO_DIR"/Gen/Symbol.proto
"$PROTOC_BIN_DIR/$JAVA_PROTOC_VERSION/protoc" -I="$PROTO_DIR"/Gen --java_out="$PROTO_DIR"/Gen "$PROTO_DIR"/Gen/Symbol.proto
