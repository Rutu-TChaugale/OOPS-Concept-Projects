package com.project.Controller;

public class Car extends Vehicle {

	public int NumOfDoors;
	
	public Car(String brand, int speed, int numofdoors)
	{
		super(brand, speed);
		
		this.NumOfDoors = numofdoors;
	}

	@Override
	public String toString() {
		return "Car [ Brand=" + brand + ", Speed=" + speed + ", NumOfDoors=" + NumOfDoors + "]";
	}
	
	@Override
	public void start()
	{
		System.out.println("Car is getting ready to start.");
	}
}
