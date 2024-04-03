//
// Created by Sam Kortekaas on 12.03.24.
//

#ifndef INDEXSTOREDB_PROTOBASEDREQUESTS_H
#define INDEXSTOREDB_PROTOBASEDREQUESTS_H

#include "IndexStoreDB/Support/LLVM.h"
#include <memory>
#include "CIndexStoreDB/CIndexStoreDB_Internal.h"
#include "IndexStoreDB/Index/IndexSystem.h"

namespace Proto {
    using Index = IndexStoreDB::internal::Object<std::shared_ptr<IndexStoreDB::index::IndexSystem>>;
    using ProtobufByteArray = std::unique_ptr<uint8_t[]>;
    using StringRef = indexstoredb_llvm::StringRef;

    ProtobufByteArray getOccurrencesForUsr(Index *index, StringRef usr, uint64_t roles);

    ProtobufByteArray getCanonicalSymbolOccurrencesByName(Index *index, StringRef name);

    ProtobufByteArray getSymbolsInFilePath(Index *index, StringRef path);

    ProtobufByteArray getOccurrencesInFilePath(Index *index, StringRef path, uint64_t roles);

    ProtobufByteArray getLightOccurrencesInFilePath(Index *index, StringRef path, uint64_t roles);
}

#endif //INDEXSTOREDB_PROTOBASEDREQUESTS_H
