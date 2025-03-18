package com.project.Controller;

public class DebitCardPayment implements Payment {

	public void processPayment(double amount)
	{
		System.out.println(amount + " amount is processed successfully via DebitCard Payment!!");
	}
}
