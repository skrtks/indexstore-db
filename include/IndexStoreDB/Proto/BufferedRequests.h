//
// Created by Sam Kortekaas on 12.03.24.
//

#ifndef INDEXSTOREDB_PROTOBASEDREQUESTS_H
#define INDEXSTOREDB_PROTOBASEDREQUESTS_H

#include <string>
#include "CIndexStoreDB/CIndexStoreDB_Internal.h"
#include "IndexStoreDB/Index/IndexSystem.h"

namespace Proto {
    typedef IndexStoreDB::internal::Object<std::shared_ptr<IndexStoreDB::index::IndexSystem>> Index;

    uint8_t *getOccurrencesForUsr(Index *index, const char *usr, uint64_t roles);

    uint8_t *getCanonicalSymbolOccurrencesByName(Index *occurrence, indexstoredb_llvm::StringRef name);

    uint8_t *getSymbolsInFilePath(Index *index, indexstoredb_llvm::StringRef path);

    uint8_t *getOccurrencesInFilePath(Index *occurrence, indexstoredb_llvm::StringRef path, uint64_t roles);

    uint8_t *getLightOccurrencesInFilePath(Index *occurrence, indexstoredb_llvm::StringRef path, uint64_t roles);
}

#endif //INDEXSTOREDB_PROTOBASEDREQUESTS_H
