# CS 290 Lab Six

#
# This file is part of Razza.
#
# Razza is free software: you can redistribute it and/or modify it under
# the terms of the GNU Lesser Public License as published by the Free
# Software Foundation, either version 2 of the License, or (at your option)
# any later version.
#
# Razza is distributed in the hope that it will be useful, but WITHOUT
# WARRANTY; without even the implied warranty of MERCHANTABILITY or
# FITNESS FOR A PARTICULAR PURPOSE.  Se the GNU Lesser Public License for
# more details.
#
# You should have received a copy of the GNU Lesser Public License along
# with Razza.  If not, see <http://www.gnu.org/licenses/>.

JFLAGS = -g
JC = javac
# Specifies the individual test suites to run - execute all of them by default.
TESTSUITESUBSET=""
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

# Java classes to be compiled.
CLASSES = \
	src/algorithms/BubbleSort.java \
	src/algorithms/BubbleSortCompCount.java \
	src/tests/BubbleSortTest.java \
	src/algorithms/CountingSortAlgorithm.java \
	src/tests/CountingSortAlgorithmTest.java \
	src/algorithms/EQSortAlgorithm.java \
	src/tests/EQSortAlgorithmTest.java \
	src/algorithms/GnomeSortAlgorithm.java \
	src/tests/GnomeSortAlgorithmTest.java \
	src/algorithms/InsertionSortAlgorithm.java \
	src/tests/InsertionSortAlgorithmTest.java \
	src/algorithms/intNode.java \
	src/algorithms/LinkedQueue.java \
	src/algorithms/MergeSortComp.java \
	src/algorithms/MergeSort.java \
	src/tests/MergeSortTest.java \
	src/algorithms/QuickSortCount.java \
	src/algorithms/QuickSort.java \
	src/tests/QuickSortTest.java \
	src/algorithms/RadixSortAlgorithm.java \
	src/tests/RadixSortAlgorithmTest.java \
	src/tests/Sati.java \
	src/algorithms/ShellSortAlgorithm.java \
	src/tests/ShellSortTest.java \
	src/algorithms/SortAlgorithm.java \
	src/algorithms/SortItem.java \
	src/tests/AllTests.java 

# Remove all bytecode and the jar file.
clean:
	$(RM) -r build/classes/algorithms/
	$(RM) -r build/classes/tests/
	$(RM) SAT.jar

# Run the JUnit test suite.
test:
	@java -classpath ./build/classes/:./lib/junit-4.9.jar:./lib/hamcrest-all-1.3.0RC2.jar:. tests.AllTests $(TESTSUITESUBSET)

# Compile all of the source code.
compile:
	mkdir build/classes/algorithms/
	mkdir build/classes/tests/
	@javac -classpath ./lib/junit-4.9.jar:./lib/hamcrest-all-1.3.0RC2.jar:./src/:./build/:. -d ./build/classes ./src/algorithms/*.java ./src/tests/*.java

# Create a jar file containing all of the bytecode.
jar:
	@jar cvf SAT.jar ./build/classes

# Run the CLOC tool in order to gather program information.
cloc:
	@tools/cloc_script.txt

# Run Cobertura in order to collect coverage information.
cobertura:
	@bash ./tools/cobertura-1.9.4.1/cobertura-instrument.sh --destination ./build/instrumented ./build/classes
	@java -cp ./tools/cobertura-1.9.4.1/cobertura.jar:./build/instrumented:./build/classes:./lib/junit-4.9.jar:./lib/hamcrest-all-1.3.0RC2.jar:. -Dnet.sourceforge.cobertura.datafile=./cobertura.ser tests.AllTests
	@bash ./tools/cobertura-1.9.4.1/cobertura-report.sh --format html --datafile ./cobertura.ser --destination ./reports/cobertura ./src
