package com.revature.menu;

import java.sql.SQLException;
import java.util.List;

import com.revature.daoimp.UserDAOImp;
import com.revature.system.Lot;
import com.revature.users.Password;
import com.revature.users.User;
import com.revature.users.UserType;
import com.revature.users.Username;

public class RegisterUser {
	private List<User> users;
	private Username username;
	private Password password;

	public RegisterUser() {
		super();
		this.users = Lot.getLotData().getUsers();
	}

	public boolean checkUsername(Username username) {
		if (!username.isValid()) {
			System.out.println("This is not a vaild username");
			return false;
		} else if (!username.isAvailable()) {
			System.out.println("This usernaem is not available");
			return false;
		}
		this.username = username;
		return true;
	}

	public boolean checkPassword(Password password) {
		if (username == null)
			System.out.println("Please enter a valid username first");
		else if (password.isValid()) {
			this.password = password;
			return true;
		}
		return false;
	}

	public void registerUser() {
		if (username != null && password != null) {
			UserDAOImp udi = new UserDAOImp();
			try {
				udi.insertUser(
						username.getValue(),
						password.getValue()
						);
				System.out.println("Succesfully registered new user");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			System.out.println("Invalid uesername/password");
	}
}
