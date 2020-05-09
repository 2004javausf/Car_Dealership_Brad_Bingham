package com.revature.contracts;

import com.revature.cars.Car;
import com.revature.users.User;

public class OfferFactory {
	private Car car;
	private User user;
	private DownPayment downPayment;
	private TermLoanLength termLoanLength;
	private Offer offer;

	public OfferFactory(Car car, User user) {
		super();
		this.car = car;
		this.user = user;
	}

	public void enterDownPayment(double input) {
		DownPayment downPayment = new DownPayment(input);
		if (!downPayment.isValid())
			System.out.println(downPayment.getValue() + " is not a valid amount");
		else {
			this.downPayment = downPayment;
		}
	}

	public void enterTermLoanLength(int input) {
		TermLoanLength termLoanLength = new TermLoanLength(input);
		if (!termLoanLength.isValid())
			System.out.println(termLoanLength.getLength() + " is not a valid length");
		else {
			this.termLoanLength = termLoanLength;
		}
	}

	public void registerThisOffer() {
		if (car == null || user == null || downPayment == null || termLoanLength == null)
			System.out.println("Please enter offer information");
		else {
			this.offer = new Offer(car, user, downPayment, termLoanLength);
			//TODO persist Contract
		}
	}
	
	public Offer thisNewOffer() {
		if(offer == null)
			System.out.println("Contract not yet created");
		else {
			return offer;
		}
		return null;
	}

}
