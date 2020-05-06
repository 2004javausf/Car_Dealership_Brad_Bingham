package com.revature.ui;

class LogInNode extends MenuNode{
	//change back to false, only true to test
	boolean succesfulLogIn= true;
	
	public void runDisplay() {
		Display.header("Log In");
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
		if(succesfulLogIn)
			navigateTo(Menu.customer);
		else
			navigateTo(Menu.main);
	}
	
}
