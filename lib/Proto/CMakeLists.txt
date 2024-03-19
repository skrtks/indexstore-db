find_package(Protobuf REQUIRED)
include_directories(${Protobuf_INCLUDE_DIRS})

add_library(Proto STATIC
        Gen/Symbol.pb.cc
        BufferedRequests.cpp)

target_include_directories(Proto PUBLIC ${PROJECT_SOURCE_DIR}/include)

target_link_libraries(Proto PRIVATE ${Protobuf_LIBRARIES})

if (NOT BUILD_SHARED_LIBS)
    set_property(GLOBAL APPEND PROPERTY IndexStoreDB_EXPORTS Proto)
endif ()
