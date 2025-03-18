package com.sit.project.controller;

public class Product extends Item {

	public int productCode;
	
	public Product(int pcode, String name, float price)
	{
		super(name, price);
		this.productCode = pcode;
	}
	
	public int getproductCode()
	{
		return productCode;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", price=" + price + "]";
	}
}
