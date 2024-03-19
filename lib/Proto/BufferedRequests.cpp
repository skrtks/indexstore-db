//
// Created by Sam Kortekaas on 12.03.24.
//

#include "IndexStoreDB/Proto/BufferedRequests.h"
#include "IndexStoreDB/Core/Symbol.h"
#include "Gen/Symbol.pb.h"

namespace {
    void buildSymbolInfo(ProtoIndexStoreDB::SymbolInfo *dstSymbolInfo, const IndexStoreDB::SymbolInfo &symbolInfo) {
        dstSymbolInfo->set_kind(static_cast<ProtoIndexStoreDB::SymbolInfo_Kind>(symbolInfo.Kind));
        dstSymbolInfo->set_sub_kind(static_cast<ProtoIndexStoreDB::SymbolInfo_SubKind>(symbolInfo.SubKind));
        dstSymbolInfo->set_properties(symbolInfo.Properties.toRaw());
        dstSymbolInfo->set_language(static_cast<ProtoIndexStoreDB::SymbolInfo_Language>(symbolInfo.Lang));
    }

    template<typename PointerType>
    void buildSymbol(ProtoIndexStoreDB::Symbol *dstSymbol, PointerType symbol) {
        if (!symbol) return;

        auto *symInfo{new ProtoIndexStoreDB::SymbolInfo};
        buildSymbolInfo(symInfo, symbol->getSymbolInfo());
        dstSymbol->set_allocated_info(symInfo);

        dstSymbol->set_usr(symbol->getUSR());
        dstSymbol->set_name(symbol->getName());
    }

    void buildSymbolOccurrenceLocation(ProtoIndexStoreDB::SymbolOccurrenceLocation *dstLocation,
                                       const IndexStoreDB::SymbolLocation &location) {
        dstLocation->set_path(location.getPath().getPathString());
        dstLocation->set_module_name(location.getPath().getModuleName());
        dstLocation->set_line(location.getLine());
        dstLocation->set_column(location.getColumn());
        dstLocation->set_is_system(location.isSystem());
    }

    void
    buildSymbolRelation(ProtoIndexStoreDB::SymbolRelation *dstRelation, const IndexStoreDB::SymbolRelation &relation) {
        dstRelation->set_roles(relation.getRoles().toRaw());

        auto *symbol{new ProtoIndexStoreDB::Symbol};
        buildSymbol(symbol, relation.getSymbol());
        dstRelation->set_allocated_symbol(symbol);
    }

    void buildSymbolOccurrence(ProtoIndexStoreDB::SymbolOccurrence *dstOccurrence,
                               IndexStoreDB::SymbolOccurrence *occurrence) {
        if (!occurrence) return;

        auto *symbol{new ProtoIndexStoreDB::Symbol};
        buildSymbol(symbol, occurrence->getSymbol());
        dstOccurrence->set_allocated_symbol(symbol);

        dstOccurrence->set_roles(occurrence->getRoles().toRaw());

        auto *symLoc{new ProtoIndexStoreDB::SymbolOccurrenceLocation};
        buildSymbolOccurrenceLocation(symLoc, occurrence->getLocation());
        dstOccurrence->set_allocated_location(symLoc);

        dstOccurrence->set_provider_kind(
                static_cast<ProtoIndexStoreDB::SymbolOccurrence_ProviderKind>(occurrence->getSymbolProviderKind()));
        dstOccurrence->set_target(occurrence->getTarget());

        for (auto &relation: occurrence->getRelations()) {
            buildSymbolRelation(dstOccurrence->add_relations(), relation);
        }
    }

    template<typename T>
    uint8_t *convertToByteArray(const T &messageContent) {
        const int messageSize{static_cast<int>(messageContent.ByteSizeLong())};
        const size_t bufferSize{sizeof(messageSize) + messageSize};
        uint8_t *buffer{static_cast<uint8_t *>(std::malloc(bufferSize))};
        if (!buffer) return nullptr;

        std::memcpy(buffer, &messageSize, sizeof(messageSize));
        if (!messageContent.SerializeToArray(buffer + sizeof(messageSize), messageSize)) {
            free(buffer);
            return nullptr;
        }

        return buffer;
    }
}

namespace Proto {
    uint8_t *getOccurrencesForUsr(Index *index, const char *usr, uint64_t roles) {
        GOOGLE_PROTOBUF_VERIFY_VERSION;

        ProtoIndexStoreDB::SymbolOccurrences occurrences;
        index->value->foreachSymbolOccurrenceByUSR(usr, static_cast<IndexStoreDB::SymbolRoleSet>(roles),
                                                   [&](IndexStoreDB::SymbolOccurrenceRef occurrence) -> bool {
                                                       IndexStoreDB::SymbolOccurrence *symbolOccurrence{occurrence.get()};
                                                       if (symbolOccurrence) {
                                                           buildSymbolOccurrence(occurrences.add_occurrence(),
                                                                                 symbolOccurrence);
                                                       }
                                                       return true;
                                                   });

        return convertToByteArray(occurrences);
    }

    uint8_t *getCanonicalSymbolOccurrencesByName(Index *index, indexstoredb_llvm::StringRef name) {
        GOOGLE_PROTOBUF_VERIFY_VERSION;

        ProtoIndexStoreDB::SymbolOccurrences occurrences;
        index->value->foreachCanonicalSymbolOccurrenceByName(name,
                                                             [&](IndexStoreDB::SymbolOccurrenceRef occurrence) -> bool {
                                                                 IndexStoreDB::SymbolOccurrence *symbolOccurrence{occurrence.get()};
                                                                 if (symbolOccurrence) {
                                                                     buildSymbolOccurrence(occurrences.add_occurrence(),
                                                                                           symbolOccurrence);
                                                                 }
                                                                 return true;
                                                             });

        return convertToByteArray(occurrences);
    }

    uint8_t *getSymbolsInFilePath(Index *index, indexstoredb_llvm::StringRef path) {
        GOOGLE_PROTOBUF_VERIFY_VERSION;

        ProtoIndexStoreDB::Symbols symbols;
        index->value->foreachSymbolInFilePath(path,
                                              [&](IndexStoreDB::SymbolRef symbolRef) -> bool {
                                                  IndexStoreDB::Symbol *symbol{symbolRef.get()};
                                                  if (symbol) {
                                                      buildSymbol(symbols.add_symbol(), symbol);
                                                  }
                                                  return true;
                                              });

        return convertToByteArray(symbols);
    }

    uint8_t *getOccurrencesInFilePath(Index *index, indexstoredb_llvm::StringRef path, uint64_t roles) {
        GOOGLE_PROTOBUF_VERIFY_VERSION;

        ProtoIndexStoreDB::SymbolOccurrences occurrences;
        index->value->foreachOccurrenceInFilePath(path, static_cast<IndexStoreDB::SymbolRoleSet>(roles),
                                                  [&](IndexStoreDB::SymbolOccurrenceRef occurrence) -> bool {
                                                      IndexStoreDB::SymbolOccurrence *symbolOccurrence{occurrence.get()};
                                                      if (symbolOccurrence) {
                                                          buildSymbolOccurrence(occurrences.add_occurrence(),
                                                                                symbolOccurrence);
                                                      }
                                                      return true;
                                                  });

        return convertToByteArray(occurrences);
    }
}