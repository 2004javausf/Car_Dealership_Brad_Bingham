package com.revature.cars;

public class CarFactory {
	private Model model;
	private Year year;
	private Color color;
	private Price price;
	private Car car;

	public CarFactory() {
		super();
	}
	

	public CarFactory(String model, int year, String color, double price) {
		super();
		this.model = new Model(model);
		this.year = new Year(year);
		this.color = new Color(color);
		this.price = new Price(price);
		this.car = new Car(this.model, this.year, this.color, this.price);
	}


	public void enterModel(String input) {
		Model model = new Model(input);
		if (!model.isValid())
			System.out.println(model.getValue() + " is not a valid model");
		else {
			this.model = model;
		}
	}

	public void enterYear(int input) {
		Year year = new Year(input);
		if (!year.isValid())
			System.out.println(year.getValue() + " is not a valid year");
		else {
			this.year = year;
		}
	}

	public void enterColor(String input) {
		Color color = new Color(input);
		if (!color.isValid())
			System.out.println(color.getValue() + " is not a valid color");
		else {
			this.color = color;
		}
	}

	public void enterPrice(double input) {
		Price price = new Price(input);
		if (!price.isValid())
			System.out.println(price.getValue() + " is not a valid price");
		else {
			this.price = price;
		}
	}

	public void registerThisCar() {
		if (model == null || year == null || color == null || price == null)
			System.out.println("Please enter car car information");
		else {
			this.car = new Car(model, year, color, price);
			// TODO persist car
		}
	}

	public Car thisNewCar() {
		if (car == null)
			System.out.println("Car info not yet entered");
		else {
			return car;
		}
		return null;
	}

}
