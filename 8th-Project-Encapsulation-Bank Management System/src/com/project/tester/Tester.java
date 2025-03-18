package com.project.tester;

import java.util.Scanner;

import com.project.BankAccount.BankAccount;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		BankAccount[] b = new BankAccount[10];
		
		int index = 0;
		
		b[index++] = new BankAccount(101, "Ram", 5000, "Saving");
		b[index++] = new BankAccount(102, "Shyam", 7000, "Current");
		b[index++] = new BankAccount(103, "Kartik", 4000, "Saving");
		b[index++] = new BankAccount(104, "Pratik", 9000, "Current");
		
		while(true)
		{
			System.out.println("******************* Welcome to Bank Management System *******************");
			System.out.println("\t 1. Add new Bank Account\n" + "\t 2. Display all accounts\n" + "\t 3. Find account by Account Number\n"
								+ "\t 4. Deposit\n" + "\t 5. Withdraw\n" + "\t 6. Check Balance\n" + "\t 7. Exit");
			System.out.println("_________________________________________________________________________");
			
			System.out.println("Enter your choice from above menu:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Account number, name, balance, type:");
				b[index++] = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
				System.out.println("Account created successfully!!");
				break;
				
			case 2:
				for(BankAccount obj : b)
				{
					if(obj != null)
					{
						System.out.println();
						System.out.println(obj.getAccNo());
						System.out.println(obj.getName());
						System.out.println(obj.getBalance());
						System.out.println(obj.getAccType());
						System.out.println("_________________________________________________________________________");
					}
				}
				break;
				
			case 3:
				System.out.println("Enter account number to find:");
				int accnum = sc.nextInt();
				
				for(BankAccount obj : b)
				{
					if(obj != null)
					{
						if(obj.getAccNo() == accnum)
						{
							System.out.println();
							System.out.println(obj.getAccNo());
							System.out.println(obj.getName());
							System.out.println(obj.getBalance());
							System.out.println(obj.getAccType());	
						}
						else
						{
							System.out.println("Account not found !!!");
						}
					}
					
				}
				break;
				
			case 4:
				System.out.println("Enter your account number:");
				int accNum = sc.nextInt();
				
				for(BankAccount obj : b)
				{
					if(obj != null)
					{
						if(obj.getAccNo() == accNum)
						{
							System.out.println("Enter amount to deposit:");
							obj.deposit(sc.nextDouble());
						}
					}
				}
				break;
				
			case 5:
				System.out.println("Enter your account number:");
				int accountnum = sc.nextInt();
				
				for(BankAccount obj : b)
				{
					if(obj != null)
					{
						if(obj.getAccNo() == accountnum)
						{
							System.out.println("Enter amount to withdraw:");
							obj.withdraw(sc.nextDouble());
						}
					}
				}
				break;
				
			case 6:
				System.out.println("Enter your account number:");
				int actnum = sc.nextInt();
				
				for(BankAccount obj : b)
				{
					if(obj != null)
					{
						if(obj.getAccNo() == actnum)
						{
							obj.checkBalance();
						}
					}
				}
				break;
				
			case 7:
				System.out.println("Thank you for using our banking system!!!");
				System.exit(0);
			
			}
		}
		
	}
}
