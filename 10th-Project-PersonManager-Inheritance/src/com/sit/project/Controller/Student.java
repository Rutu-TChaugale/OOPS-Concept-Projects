package com.sit.project.Controller;

public class Student extends Person {

	int studentID;
	
	public Student(String name, int age, String gender, int sid)
	{
		super(name, age, gender);
		this.studentID = sid;
	}

	public int getStudentID() {
		return studentID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
