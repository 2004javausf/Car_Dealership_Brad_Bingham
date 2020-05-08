package com.revature.users;

public class User {
	private Username username;
	private Password password;
	private UserType type;
	
	public User(Username username, Password password, UserType type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}
	public Username getUsername() {
		return username;
	}
	public void setUsername(Username username) {
		this.username = username;
	}
	public Password getPassword() {
		return password;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", type=" + type + "]";
	}

	
}
