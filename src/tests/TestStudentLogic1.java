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

public class TestStudentLogic1 {
	String studentName = "Kyle";
	
	HighSchoolStudent student = new HighSchoolStudent("Kyle");
	HighSchoolStudent student1 = new HighSchoolStudent("Richard",3.4,2);
	HSStudentBusinessLogic studentBL = new HSStudentBusinessLogic();
	@Before
	public void setUp() throws Exception {
	}
	@Test//test to see if name is equal
	public void testStudentNameIsEqual() {
		assertEquals(studentName, student.printStudentName());
	}

	@Test//test to see if final year is true
	public void isLastYearOfHSTruetest() {
		student.setSchoolYear(4);
    	assertTrue(studentBL.isLastYearOfHS(student));
	}
	@Test//test to see if student info works
	public void testPrintStudentInfo() {
			String printMessage = "Hello Richard! Your current school year is 2. Your gpa is 3.4";
			assertEquals(printMessage, student1.printStudentInfo());
		
	}
	@Test
	public void testGpaLetterGradeEquivelantTrue() {
	   student.setGpa(2.4);
	   char gpaGradeEquiv = studentBL.gpaLetterGradeEquivalent(student);
	   assertEquals('C',gpaGradeEquiv);
	}
}
