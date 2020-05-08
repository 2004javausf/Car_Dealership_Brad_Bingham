package com.revature.cars;

import com.revature.contracts.Contract;

public class Car {
	private Model model;
	private Year year;
	private Color color;
	private Price price;

	public Car(Model model, Year year, Color color, Price price) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + "]";
	}

	

}
