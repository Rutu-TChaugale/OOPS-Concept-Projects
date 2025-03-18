package com.project.Student;

public class Aaddharcard {

	private long addharNo; 

	public Aaddharcard(long addharNo) {
		
		this.addharNo = addharNo;
	}
	
	//Declared variable addharNo is private so getter and setter methods must be created to access that private variable
	
	public long getAdno()
	{
		return addharNo;
	}
	
	public void setAdcno(long adNo)
	{
		addharNo = adNo;
	}
	
	
}
