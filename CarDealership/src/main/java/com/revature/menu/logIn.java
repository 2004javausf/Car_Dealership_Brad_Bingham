package com.revature.menu;

import java.util.List;

import com.revature.system.Lot;
import com.revature.users.Password;
import com.revature.users.User;
import com.revature.users.Username;

public class logIn {
	private List<User> users;
	private boolean locatedUsername;
	private boolean matchingPassword;
	private User user;

	public logIn() {
		super();
		this.users = Lot.getLotData().getUsers();
		this.locatedUsername = false;
		this.matchingPassword = false;
		this.user = null;
	}

	private boolean checkUsername(Username username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				this.user = user;
				this.locatedUsername = true;
				return true;
			}
		}
		return false;
	}

	public boolean checkPassword(Password password) {
		if(user == null || locatedUsername == false)
			System.out.println("Please enter a valid username first");
		else if(user.getPassword().equals(password)) {
			this.matchingPassword = true;
			return true;
		}
		return  false;
	}

	//TODO connect logIn to lotMenu.currentUser
	public void logIn() {
		if(locatedUsername = matchingPassword = true)
			System.out.println("logged in");
		else
			System.out.println("Invalid uesername/password");
	}
}
