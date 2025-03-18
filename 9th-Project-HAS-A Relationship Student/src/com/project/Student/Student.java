package com.project.Student;

public class Student {

	public String student_Name;
	private int student_Id;
	public double student_Marks;
	
	private Address addr;
	private Aaddharcard adcard;
	
	public Student(String student_Name, int student_Id, double student_Marks, Address addr, Aaddharcard adcard) {
		
		this.student_Name = student_Name;
		this.student_Id = student_Id;
		this.student_Marks = student_Marks;
		this.addr = addr;
		this.adcard = adcard;
	}

	public int getId()
	{
		return student_Id;
	}
	
	public void setId(int id)
	{
		this.student_Id = id;
	}

	public Address getAd()
	{
		return addr;
	}
	
	public void setAd(Address address)
	{
		this.addr = address;
	}
	
	public Aaddharcard  getAdcard()
	{
		return adcard;
	}
	
	public void setAdcard(Aaddharcard adcard)
	{
		this.adcard = adcard;
	}
	
	
}
