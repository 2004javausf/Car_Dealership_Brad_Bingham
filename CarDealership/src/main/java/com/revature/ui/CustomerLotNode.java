package com.revature.ui;

import com.revature.driver.Driver;

public class CustomerLotNode extends MenuNode {

	@Override
	public void runDisplay() {
		Display.header("Car Lot");
		Display.list(Driver.lot.getCars());
		Display.options("Enter car ID","Back");
	}

	@Override
	public void getInput() {
		//valid.isVehicleNumber();
		//valid.vehicleIsAvailable();
		Input.prompt();
		choice = Input.newInt();
	}

	@Override
	public void performAction() {
		switch (choice) {
		//Menu.customerOffer
		case 1: navigateTo(null); break;
		case 2: navigateTo(Menu.customer); break;
		default: System.out.println("not an option"); break;
		}
	}

}
