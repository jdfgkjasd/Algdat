# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /opt/clion-2020.2/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /opt/clion-2020.2/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Oeving2doublepivor.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Oeving2doublepivor.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Oeving2doublepivor.dir/flags.make

CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o: CMakeFiles/Oeving2doublepivor.dir/flags.make
CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o: ../DualPivotQuicksort.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o -c "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/DualPivotQuicksort.cpp"

CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/DualPivotQuicksort.cpp" > CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.i

CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/DualPivotQuicksort.cpp" -o CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.s

# Object files for target Oeving2doublepivor
Oeving2doublepivor_OBJECTS = \
"CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o"

# External object files for target Oeving2doublepivor
Oeving2doublepivor_EXTERNAL_OBJECTS =

Oeving2doublepivor: CMakeFiles/Oeving2doublepivor.dir/DualPivotQuicksort.cpp.o
Oeving2doublepivor: CMakeFiles/Oeving2doublepivor.dir/build.make
Oeving2doublepivor: CMakeFiles/Oeving2doublepivor.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Oeving2doublepivor"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Oeving2doublepivor.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Oeving2doublepivor.dir/build: Oeving2doublepivor

.PHONY : CMakeFiles/Oeving2doublepivor.dir/build

CMakeFiles/Oeving2doublepivor.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Oeving2doublepivor.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Oeving2doublepivor.dir/clean

CMakeFiles/Oeving2doublepivor.dir/depend:
	cd "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Oeving2/cmake-build-debug/CMakeFiles/Oeving2doublepivor.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Oeving2doublepivor.dir/depend
