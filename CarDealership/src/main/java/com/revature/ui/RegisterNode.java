package com.revature.ui;

import com.revature.users.User;

public class RegisterNode extends MenuNode {
	boolean succesfulLogIn = false;
	
	public void runDisplay() {
		Display.header("Register User");
	}
	public void getInput() {
		String username;
		String password;
		String confirmPassword;
		
		Input.prompt("please enter your username: ");
		username = Input.newString();
		//!valid.availableUsername();
		//valid.username();
		Input.prompt("please enter your password: ");
		password = Input.newString();
		//valid.password();
		Input.prompt("please confirm password: ");
		confirmPassword = Input.newString();
		//match = valid.usernamePasswordMatch();
		//if(match) succesfulLogIn = true;
	}
	public void performAction() {
		//change currentUser
		User currentUser = null;
		if(succesfulLogIn) {
			switch (currentUser.getType()) {
			case "Customer": navigateTo(Menu.customer); break;
			//navigate to employee
			case "Employee": navigateTo(null); break;
			default: System.out.println("not an option"); break;
			}
		}
			
		
	}
	
}
