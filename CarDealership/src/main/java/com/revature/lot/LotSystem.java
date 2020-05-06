package com.revature.lot;

import java.util.ArrayList;

import com.revature.cars.Car;
import com.revature.users.User;

public class LotSystem {
	private ArrayList<Car> cars;
	private ArrayList<User> users;
	
	

	public ArrayList<Car> getCars() {
		return cars;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public LotSystem() {
		super();
		Car c1 = new Car("c1");
		Car c2 = new Car("c2");
		User u1 = new User("Brad");
		User u2 = new User("Bingham");
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<User> users= new ArrayList<User>();
		cars.add(c1);
		cars.add(c2);
		users.add(u1);
		users.add(u2);
		this.cars = cars;
		this.users = users;
	}

	public static float caluculateMonthlyPayment() {
		// TODO Auto-generated method stub
		return 0;
	}
}
