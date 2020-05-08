package com.revature.users;

public class UserFactory {
	private Username username;
	private Password password;
	private User user;

	public UserFactory() {
		super();
	}

	public void enterUsername(String input) {
		Username username = new Username(input);
		if (!username.isValid())
			System.out.println(username.getValue() + " is not a valid username.");
		else if (!username.isAvailable())
			System.out.println(username.getValue() + " is already beeing used");
		else {
			this.username = username;
		}
	}

	public void enterPassword(String input) {
		Password password = new Password(input);
		if (!password.isValid())
			System.out.println(password.getValue() + "is not a valid password");
		else {
			this.password = password;
		}
	}

	public void registerThisUser() {
		if (username == null || password == null)
			System.out.println("Please enter username/password");
		else {
			this.user = new User(username, password, new UserType());
			// TODO persist new user
		}
	}

	public User thisNewUser() {
		if (user == null)
			System.out.println("User not yet created");
		else {
			return user;
		}
		return null;
	}

}
