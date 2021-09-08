package model;
/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 7, 2021
 */
//added this class for practicing testing two seperate class files
public class HSStudentBusinessLogic {
	
	//setting up method to test
	//test if last year of high school or not
	public char gpaLetterGradeEquivalent(HighSchoolStudent highschoolStudent) {
		char gpaLetterGradeEquivalent = 'F';
		if (highschoolStudent.getGpa() >= 3.5) { //letter grade equivalent range based off scale found on internet
			gpaLetterGradeEquivalent = 'A';      //actual scale may vary   
		}
		else if(highschoolStudent.getGpa() >= 2.5 && highschoolStudent.getGpa() < 3.5) {
			gpaLetterGradeEquivalent = 'B';
		}
		else if(highschoolStudent.getGpa() >= 1.6 && highschoolStudent.getGpa() < 2.5) {
			gpaLetterGradeEquivalent = 'C';
		}
		else if(highschoolStudent.getGpa() >= 1 && highschoolStudent.getGpa() < 1.6) {
			gpaLetterGradeEquivalent = 'D';
		}
		return gpaLetterGradeEquivalent;
	}
	public boolean isLastYearOfHS(HighSchoolStudent highschoolStudent) {
		boolean isLastYearOfHS = false;
		if(highschoolStudent.getSchoolYear() >= 4) {
			isLastYearOfHS = true;
		}
		return isLastYearOfHS;
	}
}
