package com.revature.cars;

public class Car {
	private String type;

	public Car() {
		
	}
	public Car(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + "]";
	}
	
}
