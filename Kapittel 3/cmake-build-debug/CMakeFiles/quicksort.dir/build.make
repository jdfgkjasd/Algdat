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
CMAKE_SOURCE_DIR = "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/quicksort.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/quicksort.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/quicksort.dir/flags.make

CMakeFiles/quicksort.dir/quicksort.cpp.o: CMakeFiles/quicksort.dir/flags.make
CMakeFiles/quicksort.dir/quicksort.cpp.o: ../quicksort.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/quicksort.dir/quicksort.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/quicksort.dir/quicksort.cpp.o -c "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/quicksort.cpp"

CMakeFiles/quicksort.dir/quicksort.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/quicksort.dir/quicksort.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/quicksort.cpp" > CMakeFiles/quicksort.dir/quicksort.cpp.i

CMakeFiles/quicksort.dir/quicksort.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/quicksort.dir/quicksort.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/quicksort.cpp" -o CMakeFiles/quicksort.dir/quicksort.cpp.s

# Object files for target quicksort
quicksort_OBJECTS = \
"CMakeFiles/quicksort.dir/quicksort.cpp.o"

# External object files for target quicksort
quicksort_EXTERNAL_OBJECTS =

quicksort: CMakeFiles/quicksort.dir/quicksort.cpp.o
quicksort: CMakeFiles/quicksort.dir/build.make
quicksort: CMakeFiles/quicksort.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable quicksort"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/quicksort.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/quicksort.dir/build: quicksort

.PHONY : CMakeFiles/quicksort.dir/build

CMakeFiles/quicksort.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/quicksort.dir/cmake_clean.cmake
.PHONY : CMakeFiles/quicksort.dir/clean

CMakeFiles/quicksort.dir/depend:
	cd "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug" "/home/ingebrigt/Documents/uni - 2/Algoritmer og datastrukturer/Kapittel 3/cmake-build-debug/CMakeFiles/quicksort.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/quicksort.dir/depend

