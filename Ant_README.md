# Introduction #
The Apache Ant build system will work on any platform, as long as you have it downloaded.  If you have not already downloaded Apache Ant, go [here](http://ant.apache.org/bindownload.cgi) and download the latest version.

After you have downloaded Apache Ant, you are ready to use razza.  In the terminal window, navigate to the root directory of the project.

Here is a list of targets that are included in the ant build system, along with a description of what each of the targets does.  To run the target, just type it into the command line from the root directory.  For example, type "ant clean" to remove the build directory.


# Razza Ant Targets #

`ant clean` - Removes the build directory which contains all of the bytecode for the algorithms and the test suites.

`ant compile` - Creates the build directory.  Then compiles all the source code in the "src" directory and moves the resulting bytecode to the "build" directory.  This command will also set the CLASSPATH environment variable to the correct value.

`ant jar` - Creates a jar file called SAT.jar in the razza root directory.  This archive contains all of the bytecode for the algorithms and test suites.

`ant test` - By default, this target runs all of the JUnit test suites.  In order to run a subset of the test suites, you must add the parameter "-DtestSuiteSubset=testSuites", where "testSuites" is a space-delimited list of the test suites that you wish to run.  Any number of test suites may be entered in the parameter.  For example:
`ant test -DtestSuiteSubset="BubbleSortTest ShellSortTest"`
will only execute the test suites for BubbleSort and ShellSort.

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

`ant cloc` - Runs the Count Lines of Code (CLOC) tool on both the "algorithms" and "tests" directories.  This tool reports the number of blank, commented, and source code lines in each directory.

# Cobertura Tasks - Targets to Run the Cobertura Tool #

`ant cobertura` - Runs all of the commands necessary to create a Cobertura test coverage report for all the test suites associated with the razza project.  This may take up to several hours to complete.  If you choose this target, there is no need to run any of the below Cobertura targets.  They are all included in this single target.

`ant cobertura-clean` - Removes the files and directories created by running the Cobertura tool.

`ant cobertura-instrument` - First in a list of tasks necessary to generate a Cobertura test coverage report.  This task separates the instrumented classes and puts them in the build/instrumented/ directory.

`ant cobertura-run` - Runs all of the test suites in order to produce a coverage report.

`ant cobertura-run-bubble` - Runs just BubbleSortTest in order to create a coverage report for the BubbleSortTest test suite.

`ant cobertura-report` - Creates the coverage report for the appropriate test suite(s).  The file that is created in called index.html.

`ant cobertura-display` - Opens the coverage report index.html in the Firefox web browser (if installed).