package com.project.Controller;

import java.util.Scanner;



public class VehicleManager {
	

	Scanner sc = new Scanner(System.in);
	
	Vehicle arr[] = new Vehicle[10];
	
	int index = 0;
	
	/* This is not allowed
	 * arr[index++] = new Car("BMW", 250, 4); 
	 * arr[index++] = new Bike("Hero", 100,false);
	 */
	
	
	//adding initial data to index in with the help of constructor
	//because business logic cannot be written in class. It can be only written in methods or contructs or any block
	public VehicleManager()
	{
		arr[index++] = new Car("BMW", 250, 4);
		arr[index++] = new Bike("Hero", 100, false);
	}
	
	public static int Vehicle;
	
	
	public void addVehicle(int choice)
	{

		if(choice == 1)
		{
			System.out.println("1. Add Car \n2. Add Bike");
			int ch1 = sc.nextInt();
			
			if(ch1 == 1)
			{
					//Car(String brand, int speed, int numofdoors)
					System.out.println("Car Details: ");
				
	
					System.out.println("Enter brand name: ");
					String bname = sc.next();
					
					boolean found = false;
					
					for(Vehicle obj : arr)
					{
						try 
						{
							if(obj != null && obj instanceof Car)
							{
								if(obj.brand.equalsIgnoreCase(bname))
								{
									found = true;
									throw new DuplicateVehicleFoundException("Same Vehicle already exists !");
								}
							}
						}
						catch(DuplicateVehicleFoundException e)
						{
							e.printStackTrace();
						}
					}
					if(!found)
					{
						System.out.println("speed and number of doors: ");
						int s = sc.nextInt();
						int numdoors = sc.nextInt();
						
						arr[index++] = new Car(bname, s, numdoors);
						System.out.println("Car added successfully!!");
					}
			}
				
			else if(ch1 == 2)
			{
				//Bike(String brand, int speed, boolean hasGear)
				System.out.println("Bike Details: ");

				System.out.println("Enter brand name: ");
				String bname = sc.next();
				
				boolean found = false;
				
				for(Vehicle obj : arr)
				{
					try
					{
						if(obj != null && obj instanceof Bike ) 
						{
							if(obj.brand.equalsIgnoreCase(bname))
							{
								found = true;
								throw new DuplicateVehicleFoundException("Same Vehicle already exists!");
							}
						}
					}
					catch(DuplicateVehicleFoundException e)
					{
						e.printStackTrace();
					}
				}
				if(!found)
				{
					System.out.println("speed and hasGear: ");
						
					int s = sc.nextInt();
					boolean hgear = sc.nextBoolean();
						
					arr[index++] = new Bike(bname, s, hgear);
					System.out.println("Bike added successfully!!");
				}			
			}
			else
			{
				System.out.println("Invalid choice!");
			}
			
		}
	}
	
	public void displayVehicle()
	{
		for(Vehicle obj : arr)
		{
			if(obj != null)
			{
				System.out.println(obj.toString());
			}
		}
	}
	
	public void startVehicle()
	{
		System.out.println("Which vehicle you want to start ?");
		System.out.println("1. Car \n" + "2. Bike");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Car is starting !");
		}
		else if(choice == 2)
		{
			System.out.println("Bike is starting !");
		}
		else
		{
			System.out.println("Invalid choice!");
		}
	}
	
	
}
