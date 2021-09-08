package model;
/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 7, 2021
 */
public class HighSchoolStudent {
	//attributes
	private String name;
	private double gpa;
	private int schoolYear;
	//constructors
	public HighSchoolStudent() {}
	public HighSchoolStudent(String name) {
		this.name = name;
	}
	public HighSchoolStudent(String name, double gpa, int schoolYear) {
		this.name = name;
		this.gpa = gpa;
		this.schoolYear = schoolYear;
	}
	//getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the schoolYear
	 */
	public int getSchoolYear() {
		return schoolYear;
	}
	/**
	 * @param schoolYear the schoolYear to set
	 */
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	//methods
	//added some methods in here to test from this class file
	public String printStudentName() {
		return this.name;
	}
	public String printStudentInfo() {
		return "Hello " + name + "! Your current school year is " + schoolYear + ". Your gpa is " + gpa;
	}
	
}
