package com.revature.ui;

class CustomerNode extends MenuNode{
	public void runDisplay() {
		Display.header("Customer Menu");
		Display.options("ViewLot","ViewOwned","Exit");
	}
	
	public void getInput() {
		Input.prompt();
		choice = Input.newInt();
	}
	
	public void performAction() {
		switch (choice) {
		//case 1: navigateTo(Menu.CustomerLot); break;
		//case 2: navigateTo(Menu.CustomerOwned); break;
		case 3: System.out.println("goodbye"); System.exit(0); break;
		default: System.out.println("Not an option"); break;
		}
	}
}
