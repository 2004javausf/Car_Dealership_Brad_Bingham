package com.revature.contracts;

import java.util.ArrayList;
import java.util.List;

import com.revature.cars.Car;
import com.revature.users.User;

public class Contract {
	private Car car;
	private User user;
	private List<Payment> payments = new ArrayList<>();
	private Offer offer;

	public Contract(Car car, User user, Offer offer) {
		super();
		this.car = car;
		this.user = user;
		this.offer = offer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "Contract [car=" + car + ", user=" + user + ", payments=" + payments + ", offer=" + offer + "]";
	}

}
