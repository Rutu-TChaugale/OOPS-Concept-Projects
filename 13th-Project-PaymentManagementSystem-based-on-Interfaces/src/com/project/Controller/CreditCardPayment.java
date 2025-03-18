package com.project.Controller;

public class CreditCardPayment implements Payment {

	public void processPayment(double amount)
	{
		System.out.println(amount + " amount is proecessed successfully via CreditCard Payment!!");
	}
}
