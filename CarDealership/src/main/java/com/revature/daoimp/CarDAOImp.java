package com.revature.daoimp;

import java.sql.SQLException;
import java.util.List;

import com.revature.cars.Car;
import com.revature.dao.CarDAO;

public class CarDAOImp implements CarDAO{
	//public static ConnFactory
	@Override
	public void insertCar(String model, int year, String color, double price) throws SQLException {
		
	}

	@Override
	public List<Car> getCarList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
