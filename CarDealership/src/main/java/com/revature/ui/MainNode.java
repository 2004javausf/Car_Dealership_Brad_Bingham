package com.revature.ui;

class MainNode extends MenuNode{
	private int userInput;
	
	public void runDisplay() {			
		Display.header("What would you like to do?");
		Display.options("Log In","Register User","Exit");
	}
	public void getInput() {
		Input.prompt();
		choice =Input.newInt();
	}
	public void performAction() {
		switch (choice) {
		case 1: navigateTo(Menu.logIn); break;
		case 2: navigateTo(Menu.logIn); break;
		case 3: System.out.println("goodbye"); System.exit(0); break;
		default: System.out.println("Not an option"); break;
		}
	}
}