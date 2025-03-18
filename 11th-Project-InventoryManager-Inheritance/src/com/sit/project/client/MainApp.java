package com.sit.project.client;

import com.sit.project.controller.Item;
import com.sit.project.controller.Product;
import com.sit.project.controller.Service;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Item arr[] = new Item[10];
		
		int index = 0;
		
		//public Product(int pcode, String name, float price)
		arr[index++] = new Product(101, "Laptop", 56000);
		arr[index++] = new Product(102, "Mobile", 25000);
		
		//public Service(String s, int sid, String name, float price)
		arr[index++] = new Service("Transport Service", 1, "JCB", 10000);
		arr[index++] = new Service("Tutoring Service", 2, "EduSmart", 800);
		
		while(true)
		{
			System.out.println();
			System.out.println("________________WELCOME TO INVENTORY MANAGER SYSTEM________________");
			System.out.println("___________________________________________________________________");
			System.out.println("\t 1. Add Item \n" + "\t 2. Search Item by Name \n"
								+ "\t 3. Display All Products \n" + "\t 4. Display All Services \n" + "\t 5. Exit");
			System.out.println("___________________________________________________________________");
			System.out.println("Enter a choice from above menu: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println(">> Press 1 to add Product \n" + ">> Press 2 to add Add Service");
				int input = sc.nextInt();
				
				if(input == 1)
				{
					System.out.println("Enter Product code: ");
					int pcode = sc.nextInt();
					
					boolean found = false;
					for(Item obj : arr)
					{
						if(obj != null && obj instanceof Product)
						{
							Product p = (Product) obj;
							
							if(p.getproductCode() == pcode)
							{
								System.err.println("Duplicate Product code found!!!!!");
								System.out.println("___________________________________________________________________");
								found = true;
								break;
							}
						}
					}
					if(!found)
					{
						if(index <= arr.length)
						{
							System.out.println("Enter Product name and price: ");
							arr[index++] = new Product(pcode, sc.next(), sc.nextFloat());
							System.out.println("Product added successfully!!!");
							System.out.println("___________________________________________________________________");
						}
						else
						{
							System.err.println("Cannot be added !! Array is full.");
						}
					}
				}
				else if(input == 2)
				{
					System.out.println("Enter Service Category ID: ");
					int sID = sc.nextInt();
					
					boolean sfound = false;
					for(Item obj : arr)
					{
						if(obj != null && obj instanceof Service)
						{
							Service s = (Service) obj;
							
							if(s.getServiceID() ==  sID)
							{
								System.err.println("Duplicate ID found !!");
								System.out.println("___________________________________________________________________");
								sfound = true;
								break;
							}
						}
					}
					
					if(!sfound)
					{
						if(index < arr.length)
						{
							System.out.println("Enter Service category name, Service name and price: ");
							arr[index++] = new Service(sc.next(), sID, sc.next(), sc.nextFloat());
							System.out.println("Service added successfully !!!!");
							System.out.println("___________________________________________________________________");
						}
						else
						{
							System.err.println("Cannot be added !! Array is full.");
						}
						
					}
				}
				break;
				
			case 2: 
				System.out.println("Enter name of an Item: ");
				String iname = sc.next();
				
				boolean ifound = false;
				for(Item obj : arr)
				{
					if(obj != null && obj.getName().equalsIgnoreCase(iname))
					{
						System.out.println("Item details: ");
						System.out.println(obj.toString());
						System.out.println("--------------------------------------------------------------------------------");
						ifound = true;
						break;
					}
				}
				if(!ifound)
				{
					System.err.println("Item not found with item name: "+iname);
					System.out.println("________________________________________________________________________________");
				}
				break;
				
			case 3: 
				System.out.println("Product details are: ");
				System.out.println();
				
				for(Item obj : arr)
				{
					if(obj != null && obj instanceof Product)
					{
						System.out.println(obj.toString());
						System.out.println("--------------------------------------------------------------------------------");
					}
					
				}
				break;
				
			case 4:
				System.out.println("Services details are: ");
				System.out.println();
				
				for(Item obj : arr)
				{
					if(obj != null && obj instanceof Service)
					{
						System.out.println(obj.toString());
						System.out.println("___________________________________________________________________");
					}
				}
				break;
				
			case 5:
				System.out.println("Thank you!!!!");
				System.exit(0);
				break;
				
			default:
				System.err.println("Invalid choice!! Please try again.");
				System.out.println("___________________________________________________________________");
				
			}
			
		}
	}
}
