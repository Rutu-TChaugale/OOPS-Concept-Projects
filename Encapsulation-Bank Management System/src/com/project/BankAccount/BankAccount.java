package com.project.BankAccount;

public class BankAccount {
	
	private int accNo;
	private String name;
	private double balance;
	private String accType;
	
	public BankAccount(int accNo, String name, double balance, String accType) {
	
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.accType = accType;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println(amount + " credited to your account " + accNo + " successfully!!!!");
			System.out.println("After deposit your current balance is : "+balance);
		}
		else
		{
			System.out.println("Negative amount cannot be deposited!!!!");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount < balance)
		{
			balance = amount - balance;
			System.out.println(amount+ " debited from your account " + accNo + " successfull!!");
			System.out.println("After withdraw your current balance is: "+balance);
		}
		else
		{
			System.out.println("Insufficient balance!!!");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Your current balance is: "+balance);
	}
	
	

}
