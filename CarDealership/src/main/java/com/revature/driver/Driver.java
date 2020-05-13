package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.cars.Car;
import com.revature.daoimp.UserDAOImp;
import com.revature.system.Display;
import com.revature.system.Lot;
import com.revature.users.User;

public class Driver {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Lot lot = Lot.getLotData();
		
		System.out.println("Welcome to Brad's Car Lot");
		System.out.println("What would you like to do?");
		System.out.println("1. Register a new account.");
		System.out.println("2. Log in");
		System.out.print("Make your selection: ");
		int choice = -1;
		while(choice <= 0 || choice > 2) {
			choice = Integer.parseInt(scan.nextLine());
			if(choice <= 0 || choice > 2)
				System.out.print("Invalid selection,\nPlease enter a different selection");
		}
		switch (choice) {
		case 1: 
			String regUsername =null;
			String regPassword = null;
			boolean availableUsername = false;
			UserDAOImp udi = new UserDAOImp();
			System.out.println("Register a user");
			System.out.println("please enter a username");
			while(!availableUsername) {
				availableUsername = true;
				String checkUsername = scan.nextLine();
				for (User user : lot.getUsers()) {
					if(user.getUsername().getValue().equals(checkUsername)) {
						availableUsername = false;
					}
				}
				if(availableUsername) {
					regUsername = checkUsername;
				}else {
					System.out.print("Invalid selection\nPlease enter your username");
				}
			}
			System.out.println("please enter your password");
			String checkPassword = scan.nextLine();
			regPassword =checkPassword;
			try {
				udi.insertUser(regUsername, regPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("successfully created user");
			lot.updateLotData();
			for (User user : lot.getUsers()) {
				if(user.getUsername().getValue().equals(regUsername)) {
					lot.setCurrentUser(user);
				} 
			}
			customerMenu();
			System.exit(0); break;
		case 2: 
			User logInUser = null;
			boolean locatedUsername = false;
			boolean matchingPassword1 = false;
			System.out.println("Welcome to login");
			System.out.println("please enter your username");
			while(!locatedUsername) {
				String checkUsername = scan.nextLine();
				for (User user : lot.getUsers()) {
					if(user.getUsername().getValue().equals(checkUsername)) {
						logInUser = user;
						locatedUsername = true;
					} 
				}
				if(!locatedUsername)
					System.out.print("Invalid selection\nPlease enter your username");
			}
			System.out.println("please enter your password");
			while(!matchingPassword1) {
				String checkPassword1 = scan.nextLine();
				if(logInUser.getPassword().getValue().equals(checkPassword1)) {
					matchingPassword1 = true;
				}  
				
				if(!matchingPassword1)
					System.out.print("Invalid selection\nPlease enter your Password");
			}
			System.out.println("successfully logged in");
			lot.setCurrentUser(logInUser);
			customerMenu();
			System.exit(0); break;
		}

	}

	private static void customerMenu() {
		Lot lot = Lot.getLotData();
		lot.updateLotData();
		System.out.println("Welcome "+lot.getCurrentUser().getUsername());
		System.out.println("What would you like to do?");
		System.out.println("1. View available cars");
		System.out.println("2. View my cars");
		System.out.println("3. Exit");
		System.out.print("Please make a selection: ");
		int choice = -1;
		while(choice <= 0 || choice > 3) {
			choice = Integer.parseInt(scan.nextLine());
			if(choice <= 0 || choice > 3)
				System.out.print("Invalid selection,\nPlease enter a different selection");
		}
		switch(choice) {
		case 1:
			viewAvailableCars();
			break;
		case 2:
			viewMyCars();
			break;
		case 3:
			System.out.println("Thank you");
			System.exit(0);
			break;
		}
	}
	

	private static void viewAvailableCars() {
		Lot lot = Lot.getLotData();
		lot.updateLotData();
		Display display = new Display();
		
		boolean isvalidChoice = false;
		Car chosenCar = null;
		ArrayList<Car> availableCars = display.carRecords("available");
		System.out.println("Enter carID to view or 0 to exit");
		System.out.print("Please make a selection: ");
		while(!isvalidChoice) {
			int choice1 = Integer.parseInt(scan.nextLine());
			Car carById = null;
			if(choice1 == 0) { isvalidChoice =true; break; }
			for (Car car : lot.getCars()) {
				if(car.getID() == choice1) {
					carById = car;
				}
			}
			if(availableCars.contains(carById)) {
				isvalidChoice = true;
				chosenCar = carById;
			}else {
				System.out.println("Invalid selection,\nPlease enter a different selection");
			}
		}
		System.out.println(chosenCar);
		System.out.println("what would you like to do?");
		System.out.println("1. Make an offer");
		System.out.println("2. Select another car");
		System.out.println("3. Return to the main menu");
		System.out.print("Please make a selection: ");
		int choice2 = -1;
		while(choice2 <= 0 || choice2 > 3) {
			choice2 = Integer.parseInt(scan.nextLine());
			if(choice2 <= 0 || choice2 > 3)
				System.out.print("Invalid selection,\nPlease enter a different selection");
		}
		switch (choice2) {
		case 1:
			makeAnOffer(chosenCar);
			break;
		case 2:
			viewAvailableCars();
			break;
		case 3:
			customerMenu();
			break;
		}
		
	}
	private static void viewMyCars() {
		Lot lot = Lot.getLotData();
		lot.updateLotData();
		boolean isvalidChoice = false;
		Car chosenCar = null;
		Display display = new Display();
		String thisUserID = String.valueOf(Lot.getCurrentUser().getID());
		ArrayList<Car> myCars = display.carRecords(thisUserID);
		if(myCars.size() == 0) { System.out.println("None");};
		System.out.println("Enter carID to view or 0 to exit");
		System.out.println("Please make a selection: ");
		while(!isvalidChoice) {
			int choice1 = Integer.parseInt(scan.nextLine());
			Car carById = null;
			if(choice1 == 0) { isvalidChoice =true; break; }
			for (Car car : lot.getCars()) {
				if(car.getID() == choice1) {
					carById = car;
				}
			}
			if(myCars.contains(carById)) {
				isvalidChoice = true;
				chosenCar = carById;
			}else {
				System.out.println("Invalid selection,\nPlease enter a different selection");
			}
		}
		System.out.println(chosenCar);
		System.out.println("what would you like to do?");
		System.out.println("1. View Payment information");
		System.out.println("2. Select another car");
		System.out.println("3. Return to the main menu");
		System.out.print("Please make a selection: ");
		int choice2 = -1;
		while(choice2 <= 0 || choice2 > 3) {
			choice2 = Integer.parseInt(scan.nextLine());
			if(choice2 <= 0 || choice2 > 3)
				System.out.print("Invalid selection,\nPlease enter a different selection");
		}
		switch (choice2) {
		case 1:
			viewPayments(chosenCar);
			break;
		case 2:
			viewMyCars();
			break;
		case 3:
			customerMenu();
			break;
		}
		
	}
	private static void makeAnOffer(Car chosenCar) {
		System.out.println("make an offer screen");
	}
	private static void viewPayments(Car chosenCar) {
		System.out.println("view payments screen");
	}
	
}
