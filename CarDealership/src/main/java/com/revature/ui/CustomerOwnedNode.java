package com.revature.ui;

import com.revature.driver.Driver;

public class CustomerOwnedNode extends MenuNode{

	public void runDisplay() {	
		int carID;
		
		Display.header("Owned Cars");
		//need to filter to get only this.cars
		Display.list(Driver.lot.getCars());
		System.out.println("Enter car ID to view payment information");
		System.out.println("Enter 0 to Exit");
	}

	public void getInput() {
		Input.prompt();
		choice = Input.newInt();
	}

	public void performAction() {
		//set current car in driver
		switch (choice) {
		//Menu.customerPayment
		case 1: navigateTo(null); break;
		case 2: navigateTo(Menu.customer); break;
		default: System.out.println("not an option"); break;
		}
	}

}
