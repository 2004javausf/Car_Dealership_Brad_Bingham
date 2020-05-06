package com.revature.users;

public class User {
	private String name;
	private String type;

	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public User(String name) {
		super();
		this.name = name;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
