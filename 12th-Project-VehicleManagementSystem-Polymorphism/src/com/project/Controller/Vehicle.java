package com.project.Controller;

public class Vehicle {

	public String brand;
	public int speed;
	
	public Vehicle(String b, int s)
	{
		this.brand = b;
		this.speed = s;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", speed=" + speed + "]";
	}	
	
	public void start()
	{
		System.out.println("Vehicle is getting ready ton start.");
	}
}
