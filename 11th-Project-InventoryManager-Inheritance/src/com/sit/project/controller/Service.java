package com.sit.project.controller;

public class Service extends Item {

	public String serviceCategory;
	public int serviceID;
	
	public Service(String s, int sid, String name, float price)
	{
		super(name, price);
		this.serviceCategory = s;
		this.serviceID = sid;
	}
	
	public String getserviceCategory()
	{
		return serviceCategory;
	}

	public int getServiceID() {
		return serviceID;
	}

	@Override
	public String toString() {
		return "Service [serviceCategory=" + serviceCategory + ", serviceID=" + serviceID + ", name=" + name
				+ ", price=" + price + "]";
	}
}
