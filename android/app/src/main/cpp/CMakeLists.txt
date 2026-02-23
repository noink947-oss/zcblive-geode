# CMakeLists.txt for native code

# Set the minimum version of CMake required
cmake_minimum_required(VERSION 3.4.1)

# Specify the library that you want to build
add_library( # Sets the name of the library.
        native-lib
        # Sets the library as a shared library.
        SHARED
        # Provides a relative path to your source file(s).
        native-lib.cpp )

# Include the libraries needed for your build
find_library( # Sets the name of the path variable.
        log-lib
        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log )

# Link the library to log library
target_link_libraries( # Specifies the target library.
        native-lib
        # Links the target library to the log library
        ${log-lib} )