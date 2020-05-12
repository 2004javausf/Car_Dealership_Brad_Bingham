package com.revature.menu;

import java.sql.SQLException;

import com.revature.cars.Color;
import com.revature.cars.Model;
import com.revature.cars.Price;
import com.revature.cars.Year;
import com.revature.daoimp.CarDAOImp;

public class AddCar {
	private Model model;
	private Year year;
	private Color color;
	private Price price;
	
	public AddCar() {
		super();
	}
	public boolean checkModel(Model model) {
		if(model.isValid()) {
			this.model = model;
			return true;
		}
		System.out.println("Not a vaild input for model");
		return false;
	}
	public boolean checkYear(Year year) {
		if(year.isValid()) {
			this.year = year;
			return true;
		}
		System.out.println("Not a valid input for year");
		return false;
	}
	public boolean checkColor(Color color) {
		if(color.isValid()) {
			this.color = color;
			return true;
		}
		return false;
	}
	public boolean checkPrice(Price price) {
		if(price.isValid()) {
			this.price = price;
			return true;
		}
		System.out.println("Not a vaild price");
		return false;
	}
	public void addCar() {
		if(model != null && year != null && color != null && price != null) {
			CarDAOImp cdi = new CarDAOImp();
			try {
				cdi.insertCar(
						model.getValue(), 
						year.getValue(),
						color.getValue(), 
						price.getValue());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Model getModel() {
		return model;
	}
	public Year getYear() {
		return year;
	}
	public Color getColor() {
		return color;
	}
	public Price getPrice() {
		return price;
	}
}
