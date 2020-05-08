package com.revature.system;

import java.util.ArrayList;
import java.util.List;

import com.revature.cars.Car;
import com.revature.contracts.Contract;
import com.revature.users.User;

public class Lot {
	private List<User> users = new ArrayList<>();
	private List<Car> cars = new ArrayList<>();
	private List<Contract> contracts = new ArrayList<>();
	
	private static Lot instance;
	
	private Lot() {
		super();
	}
	
	public static synchronized Lot getLotData() {
		if(instance == null)
			instance = new Lot();
		return instance;
	}

	public List<User> getUsers() {
		return users;
	}

	private void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Car> getCars() {
		return cars;
	}

	private void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	private void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	@Override
	public String toString() {
		return "LotData [users=" + users + ", cars=" + cars + ", contracts=" + contracts + "]";
	}
	
	
	
}
