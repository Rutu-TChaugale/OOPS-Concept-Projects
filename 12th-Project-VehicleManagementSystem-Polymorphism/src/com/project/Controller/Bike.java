package com.project.Controller;

public class Bike extends Vehicle {

	public boolean hasGear;

	public Bike(String brand, int speed, boolean hasGear) {
		
		super(brand, speed);
		
		this.hasGear = hasGear;
	}
	
	@Override
	public String toString()
	{
		return "Bike [ Brand = "+ brand + ", Speed = " + speed + ", HasGear = " + hasGear + "]";
	}
	
	@Override
	public void start()
	{
		System.out.println("Bike is getting ready to start.");
	}
	
}
