package com.project.Main;

import java.util.Scanner;

import com.project.Student.Aaddharcard;
import com.project.Student.Address;
import com.project.Student.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student arr[] = new Student[10];
		
		int index = 0;
		
		//String student_Name, int student_Id, double student_Marks, Address addr, Aaddharcard adcard)
		//Address(String cityName, String stateName)
		//Aaddharcard(long addharNo)
		
		
		arr[index++] = new Student("Ram", 101, 96, new Address("Pune", "Maharashtra"), new Aaddharcard(459655946) );
		arr[index++] = new Student("Shyam", 102, 89, new Address("Amravati", "Maharashtra"), new Aaddharcard(456998723));
		arr[index++] = new Student("Kartik", 103, 77, new Address("Nagpur", "Maharashtra"), new Aaddharcard(989269496));
		arr[index++] = new Student("Lakhan", 104, 78, new Address("Yavatmal", "Maharashtra"), new Aaddharcard(986565234));
		
		while(true)
		{
			System.out.println("-------------- Welcome to Student Management System --------------");
			System.out.println("__________________________________________________________________");
			System.out.println("\t 1. Add  Student\n" + "\t 2. Show Details of Students\n" + "\t 3. Exit");
			System.out.println("__________________________________________________________________");
			
			System.out.println("Enter your choice from above menu: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				
				boolean duplicateId = false;
				
				for(int i = 0; i<arr.length; i++)
				{
					if(arr[i] != null)
					{
						if(arr[i].getId() == id)
						{
							System.out.println("Duplicate Id found!!");
							System.out.println();
							duplicateId = true;
							break;
						}
					}
				}
				
				if(!duplicateId)
				{
					if(index < arr.length)
					{
						System.out.println("Enter Name and Marks: ");
						String sname = sc.next();
						double marks = sc.nextDouble();
						
						System.out.println("Enter City and State name: ");
						String city = sc.next();
						String state = sc.next();
						
						System.out.println("Enter Aadharcard no: ");
						long adno = sc.nextLong();
						
						arr[index++] = new Student(sname, id, marks, new Address(city, state), new Aaddharcard(adno));
						System.out.println("Student added successfully!!");
					}
				}
				break;
				
			case 2:
				System.out.println("Student details are: ");
				for(Student obj : arr)
				{
					if(obj != null)
					{
						System.out.println();
						System.out.println("Id: "+obj.getId());
						System.out.println("Name: "+obj.student_Name);
						System.out.println("Marks: "+obj.student_Marks);
						System.out.println("Address: ");
						System.out.println("City: "+obj.getAd().cityName);
						System.out.println("State: "+obj.getAd().stateName);
						System.out.println("Aaddhar Number: "+obj.getAdcard().getAdno());
						System.out.println("__________________________________________");	
					}
				}
				break;
				
			case 3:
				System.out.println("Thank you!!");
				System.exit(0);
			}
					
		}		
	}
}
