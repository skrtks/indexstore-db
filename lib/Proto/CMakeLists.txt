set(Protobuf_LIBRARY ${PROJECT_SOURCE_DIR}/third_party/protobuf/lib/libprotobuf.a)
set(Protobuf_INCLUDE_DIRS ${PROJECT_SOURCE_DIR}/third_party/protobuf/include)

add_library(Proto STATIC
        Gen/Symbol.pb.cc
        BufferedRequests.cpp)

target_include_directories(Proto PUBLIC ${PROJECT_SOURCE_DIR}/include ${Protobuf_INCLUDE_DIRS})

target_link_libraries(Proto PRIVATE ${Protobuf_LIBRARY})

if (NOT BUILD_SHARED_LIBS)
    set_property(GLOBAL APPEND PROPERTY IndexStoreDB_EXPORTS Proto)
endif ()
