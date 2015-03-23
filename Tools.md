## [CLOC](http://cloc.sourceforge.net/) ##
Count Lines of Code (CLOC) is a tool that allows the user to find the number of lines of code in a project that is implemented in a wide variety of programming languages.  Also, CLOC can provide more in-depth information about the code that it has reviewed.  For example, CLOC reports how many commented and uncommented lines of code are in the project.  This feature is useful when a developer is trying to remove unnecessary code from his or her project.


## [Cobertura](http://cobertura.sourceforge.net/) ##
Cobertura is a tool that calculates the percentage of code accessed by tests.  This helps developers determine how they can improve their test suites.  High code coverage increases developer confidence in the correctness of his or her code.


## [JavaNCSS](http://javancss.codehaus.org/) ##
JavaNCSS is a tool that measures the complexity of a software system written in the Java programming language.  Code complexity tends to increase throughout the software development project.  JavaNCSS allows developers to be more aware of how complex their system actually is and can help to reduce the rate of needless errors. This tool was only used to personally evaluate our test suite.  Our build system does not provide a command to run this tool.


## [Jumble](http://jumble.sourceforge.net/) ##
Jumble is tool that uses mutation testing to evaluate JUnit test suite quality.  After you compile your test cases, Jumble instruments the bytecode in order to systematically add faults to the program.  It then executes the test suite in order to determine how effective the test cases are at finding these seeded faults.  This tool was only used to personally evaluate our test suite.  Our build system does not provide a command to run this tool.