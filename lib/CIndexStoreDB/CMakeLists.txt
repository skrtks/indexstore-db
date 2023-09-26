add_library(CIndexStoreDB STATIC
  CIndexStoreDB.cpp)
target_compile_options(CIndexStoreDB PRIVATE
  -fblocks)
target_include_directories(CIndexStoreDB PUBLIC
  ${PROJECT_SOURCE_DIR}/include/CIndexStoreDB)
target_link_libraries(CIndexStoreDB PRIVATE
  LLVMSupport)
target_link_libraries(CIndexStoreDB PUBLIC
  Index)
if(NOT CMAKE_SYSTEM_NAME STREQUAL Darwin)
  target_link_libraries(CIndexStoreDB PRIVATE
    dispatch)
endif()

if(NOT BUILD_SHARED_LIBS)
  set_property(GLOBAL APPEND PROPERTY IndexStoreDB_EXPORTS CIndexStoreDB)
endif()

add_library(IndexStoreDB SHARED CIndexStoreDB.cpp)
target_compile_options(IndexStoreDB PRIVATE -fblocks)
target_link_libraries(IndexStoreDB
        ${CORESERVICES_FRAMEWORK}
        ${FOUNDATION_FRAMEWORK}
        Index
)
