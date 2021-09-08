/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 7, 2021
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.HSStudentBusinessLogic;
import model.HighSchoolStudent;

public class TestStudentLogic2 {
	String studentName = "Tyler";
	HSStudentBusinessLogic studentBL = new HSStudentBusinessLogic();
	HighSchoolStudent student = new HighSchoolStudent("Lucy");
	@Before
	public void setUp() throws Exception {
	}
	//tried not equals for a practice test
	@Test //this test sees if the names are not equal
	public void testStudentNameIsNotEqual() {
		assertNotEquals(studentName, student.printStudentName());
	}
	@Test//this test tests to see if it is not last year
	public void isLastYearOfHStest() {
		student.setSchoolYear(3);
    	assertFalse(studentBL.isLastYearOfHS(student));
	}

}
