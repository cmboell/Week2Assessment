/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 7, 2021
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    //class that tests our J Unit tests
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//result that tests both test cases
		Result result = JUnitCore.runClasses(TestStudentLogic1.class, TestStudentLogic2.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString()); //if tests fail this will print out
		}
		System.out.println(result.wasSuccessful());//if tests pass this will print out
	}

}
