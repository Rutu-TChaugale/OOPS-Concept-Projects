package com.sit.project.controller;

public class Item {

	public String name;
	public float price;
	
	public Item(String n, float pr)
	{
		this.name = n;
		this.price = pr;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getPrice()
	{
		return price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
