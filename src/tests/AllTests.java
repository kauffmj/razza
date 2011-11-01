/**
  * This file is part of Razza.
  *
  * Razza is free software: you can redistribute it and/or modify it under
  * the terms of the GNU Lesser Public License as published by the Free
  * Software Foundation, either version 2 of the License, or (at your option)
  * any later version.
  *
  * Razza is distributed in the hope that it will be useful, but WITHOUT
  * WARRANTY; without even the implied warranty of MERCHANTABILITY or
  * FITNESS FOR A PARTICULAR PURPOSE.  Se the GNU Lesser Public License for
  * more details.
  *
  * You should have received a copy of the GNU Lesser Public License along
  * with Razza.  If not, see <http://www.gnu.org/licenses/>.
**/

package tests;

import algorithms.*;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.*;
import java.util.ArrayList;

public class AllTests 
{
    public static Test suite(String testSuiteList) 
    {
	    TestSuite suite = new TestSuite("SortingAlgorithms");

        //for(String testSuite : testSuiteList)
        //{
        //    suite.addTestSuite(Class.forName(testSuite));
        //}

        if(testSuiteList.contains("BubbleSortTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.BubbleSortTest.class);
        if(testSuiteList.contains("EQSortAlgorithmTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.EQSortAlgorithmTest.class);
        if(testSuiteList.contains("CountingSortAlgorithmTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.CountingSortAlgorithmTest.class);
        if(testSuiteList.contains("InsertionSortAlgorithmTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.InsertionSortAlgorithmTest.class);
        if(testSuiteList.contains("QuickSortTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.QuickSortTest.class);
        if(testSuiteList.contains("GnomeSortAlgorithmTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.GnomeSortAlgorithmTest.class);
        if(testSuiteList.contains("MergeSortTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.MergeSortTest.class);
        if(testSuiteList.contains("RadixSortAlgorithmTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.RadixSortAlgorithmTest.class);
        if(testSuiteList.contains("ShellSortTest") || testSuiteList.length() == 0)
            suite.addTestSuite(tests.ShellSortTest.class);

        /*if(testSuiteList.length() == 0)
        {
	        suite.addTestSuite(tests.BubbleSortTest.class);
	        suite.addTestSuite(tests.EQSortAlgorithmTest.class);
	        suite.addTestSuite(tests.CountingSortAlgorithmTest.class);
	        suite.addTestSuite(tests.InsertionSortAlgorithmTest.class);
	        suite.addTestSuite(tests.QuickSortTest.class);
	        suite.addTestSuite(tests.GnomeSortAlgorithmTest.class);
	        suite.addTestSuite(tests.MergeSortTest.class);
	        suite.addTestSuite(tests.RadixSortAlgorithmTest.class);
	        suite.addTestSuite(tests.ShellSortTest.class);
        }*/

	    return suite;
    }
    
    public static void main(String[] args)
    {
        String testSuiteList = "";
        for(int i=0;i<args.length;i++)
            if(!args[i].equals(""))
            testSuiteList += (args[i] + " ");
	    junit.textui.TestRunner.run(suite(testSuiteList));
    }
}
