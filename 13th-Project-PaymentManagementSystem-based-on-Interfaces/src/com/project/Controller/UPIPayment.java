package com.project.Controller;

public class UPIPayment implements Payment {

	public void processPayment(double amount)
	{
		System.out.println(amount + " amount is processed successfully via UPI Payment!!");
	}
	
}
