package com.sit.project.Client;

import java.util.Scanner;

import com.sit.project.Controller.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person arr[] = new Person[10];
		
		int index = 0;
		
		arr[index++] = new Student("John", 14, "Male", 101);
		arr[index++] = new Student("Alice", 13, "Female", 102);
		
		arr[index++] = new Employee("Taylor",28, "Female", 1);
		arr[index++] = new Employee("Alex", 29, "Male", 2);
		
		
		while(true)
		{
			System.out.println("------------ Welcome to People Management System ------------");
			System.out.println("\t 1. Add Person \n" + "\t 2. Search Person by name \n"
								+ "\t 3. Display Students \n" + "\t 4. Display Employees \n"
								+ "\t 5. Exit");
			System.out.println("_______________________________________________________________");
			System.out.println("Enter your choice from above menu: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("___________________________________________________________");
				System.out.println("Press 1 to add student \n" + "Press 2 to add employee");
				int input1 = sc.nextInt();
				
				
				if(input1 == 1)
				{
					System.out.println("Enter student details: ");
					System.out.println("Enter student id: ");
					int studid = sc.nextInt();
					
					boolean found1 = false;
					for(Person obj : arr)
					{
						if(obj != null && obj instanceof Student)
						{
							Student s = (Student)obj; //downcasting Person to Student 
							//Because array is in Person class so to check id from array which is present or not in array downcasting is imp
				
							if(s.getStudentID() == studid)
							{
								System.out.println("Duplicate id found!!!");
								System.out.println("_______________________________________________________________");
								found1 = true;
								break;
							}
						}
					}
					if(!found1)
					{
						System.out.println("Enter name, age, and gender");
						String name = sc.nextLine();
						int age = sc.nextInt();
						String gender = sc.next();
						
						arr[index++] = new Student(name, age, gender, studid);
						System.out.println("Student added successfully!!!");
						System.out.println("_______________________________________________________________");
						break;
					}
					
				}
				else if(input1 == 2)
				{
					System.out.println("Enter employee id:");
					int empid = sc.nextInt();
					
					boolean found2 = false;
					for(Person obj : arr)
					{
						if(obj != null && obj instanceof Employee)
						{
							Employee e = (Employee) obj;
							
							if(e.getEmpID() == empid)
							{
								System.out.println("Duplicate ID found!!!!");
								System.out.println("_______________________________________________________________");
								found2 = true;
								break;
							}
						}
					}
					if(!found2)
					{
						System.out.println("Enter employee details: ");
						System.out.println("Enter name, age, and gender:");
						String name = sc.next();
						int age = sc.nextInt();
						String gender = sc.next();
						
						arr[index++] = new Employee(name, age, gender, empid);
						System.out.println("Employee added successfully!!!");
						System.out.println("_______________________________________________________________");
						break;

					}
					
				}
				break;
				
			case 2:
				System.out.println("Enter Person name: ");
				String pname = sc.next();
				
				boolean found = false;
				for(Person obj : arr)
				{
					if(obj != null)
					{
						if(obj.getName().equalsIgnoreCase(pname))
						{
							System.out.println("Person Details are: ");
							System.out.println(obj.toString());
							System.out.println("_______________________________________________________________");
							found = true;
							break;
				
						}
						
					}	
				}
				if(!found)
				{
					System.out.println("Person not found");
					System.out.println("_______________________________________________________________");
					break;
				}
				break;
				
			case 3:
				System.out.println("Student details are: ");
				System.out.println();
				for(Person obj : arr)
				{
					if(obj != null)
					{
						if(obj instanceof Student)
						{
							System.out.println(obj.toString());
							System.out.println("_______________________________________________________________");
							
							//If we do not want to use toString method then below downcasting is the way to access Student class variables & method
							
							/*Student s=(Student)obj;
							System.out.println("Student id: "+s.getStudentID());
							System.out.println();*/
						}
					}
				}
				break;
				
			case 4:
				System.out.println("Employee details are: ");
				System.out.println();
				for(Person obj : arr)
				{
					if(obj != null)
					{
						if(obj instanceof Employee)
						{
							System.out.println(obj.toString());
							
							
							//If we do not want to use toString method then below downcasting is the way to access Student class variables & method

							/*Employee e=(Employee)obj;
							System.out.println("Employee id: "+e.getEmpID());
							System.out.println();*/
							
							System.out.println("_______________________________________________________________");
						}
					}
				}
				break;
				
			case 5:
				System.out.println("Thank you!!!!");
				System.exit(0);
				
			default:
                System.out.println("Invalid choice! Please try again.");
                System.out.println("_______________________________________________________________");
					
			}
			
		}
	}
}
