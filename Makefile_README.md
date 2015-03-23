# Introduction #

As is the nature of a makefile, it can only be used on Unix based systems, such as Mac OS X and Linux.  There is no need to download anything extra to use a makefile on these systems.

In the terminal window, navigate to the root directory of the project.

Here is a list of commands that are included in the makefile, along with a description of what each of the commands does.  To run the command, just type it into the command line from the root directory.  For example, type `make clean` to remove all the bytecode and the jar file.

# Razza Makefile Commands #

`make compile` - Sets the CLASSPATH variable to the value needed to run the test suite.  It will include the JUnit jar file, Hamcrest jar file, src directory, and build directory.  It runs `javac` on all the code in src/algorithms and src/tests.

`make jar` - Saves the .class files to a jar file in the razza root directory called SAT.jar.  It is in this directory so the user can easily find the executable.

`make test` - By default, runs all of the tests.  In order to choose specific tests to run, follow the `make test` command with this parameter: `TESTSUITESUBSET="testsuite1 testsuite2 …"`.
For example, if you wished to test just QuickSort and CountingSort, you would type this into the command line:
`make test TESTSUITESUBSET="QuickSortTest CountingSortAlgorithmTest"`.

The test suites that can be included in this subset can be any of the following:
  * BubbleSortTest
  * CountingSortAlgorithmTest
  * EQSortAlgorithmTest
  * GnomeSortAlgorithmTest
  * InsertionSortAlgorithmTest
  * RadixSortAlgorithmTest
  * MergeSortTest
  * QuickSortTest
  * ShellSortTest

`make cloc` - Runs the CLOC (Count Lines Of Code) tool via a script and delivers the output to the terminal window.

`make cobertura` - Runs the commands necessary to produce a Cobertura coverage report of the system.  Includes instrumentation, running the tests, and creating a coverage report.  This may take up to several hours to complete.  To view the report, open the index.html file in a web browser. WARNING: This command will not work without first running `make compile`.

`make clean` - removes the bytecode from build/classes/algorithms and build/classes/tests/ and also removes the jar file that contains all the .class (bytecode) files.