package com.revature.ui;

public class OfferSubmittedNode extends MenuNode{
	
	
	public void runDisplay() {
		Display.header("Offer successful submitted");
		Display.options("Choose another Car", "Exit");
	}

	public void getInput() {
		Input.prompt();
		choice = Input.newInt();
	}

	public void performAction() {
		switch (choice) {
		case 1: navigateTo(Menu.customerLot); break;
		case 2: navigateTo(Menu.customer); break;
		default: System.out.println("not an option"); break;
		}
	}

}
