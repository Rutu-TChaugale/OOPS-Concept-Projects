package com.project.Client;

import java.util.Scanner;

import com.project.Controller.VehicleManager;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		VehicleManager obj = new VehicleManager();
		
		while(true)
		{
			System.out.println("--------------------------------------------------");
			System.out.println("\t WELCOME TON VEHICLE MANAGEMENT SYSTEM");
			System.out.println("--------------------------------------------------");
			System.out.println("Menus: \n \t 1. Add Vehicle \n" + "\t 2. Display Vehicles \n" 
								+ "\t 3. Start Vehicles \n" + "\t 4. Exit");
			System.out.println("--------------------------------------------------");

			System.out.println("Choose option from above menu: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				obj.addVehicle(choice);
				break;
				
			case 2:
				obj.displayVehicle();
				break;
				
			case 3:
				obj.startVehicle();
				break;
				
			case 4:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid input!!");
				
			}
		}
	}
}
