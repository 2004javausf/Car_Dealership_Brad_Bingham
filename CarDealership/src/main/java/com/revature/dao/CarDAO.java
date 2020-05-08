package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.cars.Car;

public interface CarDAO {

	//Read data
	public void insertCar(String model, int year, String color, double price) throws SQLException;
	//Write data
	public List<Car> getCarList() throws SQLException;
}
