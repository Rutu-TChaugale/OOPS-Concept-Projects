package com.project.Client;

import java.util.Scanner;

import com.project.Controller.CreditCardPayment;
import com.project.Controller.DebitCardPayment;
import com.project.Controller.Payment;
import com.project.Controller.UPIPayment;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Payment obj = new CreditCardPayment();
//		obj.processPayment(5000d);
//		
//		Payment obj1 = new DebitCardPayment();
//		obj1.processPayment(3000d);
//		
//		Payment obj2 = new UPIPayment();
//		obj2.processPayment(2000d);
		
		/* this is also possible but making reference of Interface is a traditional way
		 * CreditCardPayment c = new CreditCardPayment(); 
		 * c.processPayment(5000);
		 */
		
		
		Payment obj =null; // we can not create object of interface but we can create reference of it
		//obj=new CreditCardPayment();
		
		while(true)
		{
			System.out.println("---------WELCOME TO PAYMENT MANAGEMENT SYSTEM---------");
			System.out.println("_______________________________________________________");
			System.out.println("Menus:-\n \t 1. Pay using Credit Card\n" + "\t 2. Pay using Debit Card\n" +
								"\t 3. Pay using UPI\n" + "\t 4. Exit");
			System.out.println("__________________________________________________________________");
			System.out.println("Enter your choice from above menu: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				try
				{
					System.out.println("Enter amount: ");
					double input = sc.nextDouble();
					
					if(input <= 0)
					{
						throw new NegativeInputException("Negative input is not allowed !!");
					}
					else
					{
						obj = new CreditCardPayment();
						obj.processPayment(input);	
					}
					System.out.println("__________________________________________________________________");
				}
				catch(NegativeInputException e)
				{
					e.printStackTrace();
					System.out.println("__________________________________________________________________");
				}
				
				break;

			
			case 2: 
				try
				{
					System.out.println("Enter amount: ");
					double input1 = sc.nextDouble();
					
					if(input1 <= 0)
					{
						throw new NegativeInputException("Negative input is not allowed !!");
					}
					else
					{
						obj = new DebitCardPayment();
						obj.processPayment(input1);	
					}
					System.out.println("__________________________________________________________________");
				}
				catch(NegativeInputException e)
				{
					e.printStackTrace();
					System.out.println("__________________________________________________________________");
				}
				
				break;
				
			case 3:
				try
				{
					System.out.println("Enter amount: ");
					double input2 = sc.nextDouble();
					
					if(input2 <= 0)
					{
						throw new NegativeInputException("Negative input is not allowed !!");
					}
					else
					{
						obj = new UPIPayment();
						obj.processPayment(input2);	
					}
					System.out.println("__________________________________________________________________");
				}
				catch (Exception e) {
					e.printStackTrace();
					System.out.println("__________________________________________________________________");
				}
				
				break;
				
			case 4:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				
			default:
				System.err.println("Invalid choice!!");
				System.out.println("__________________________________________________________________");
				break;
			}
			
		}
	}
}
