package com.sit.project.Controller;

public class Person {

	String name;
	int age;
	String gender;
	
	
	public Person(String n, int a, String g)
	{
		this.name = n;
		this.age = a;
		this.gender = g;	
	}

	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
