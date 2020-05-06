package com.revature.ui;

import java.util.Date;

import com.revature.cars.Car;
import com.revature.contracts.Contract;
import com.revature.driver.Driver;
import com.revature.lot.LotSystem;
import com.revature.users.User;

public class CustomerOfferNode extends MenuNode{

	public void runDisplay() {
		Display.header("Submit an Offer");
		System.out.println(Driver.currentCar);
	}

	public void getInput() {
		Date date;
		double downPayment;
		int loanLength;
		float monthlyPayment;
		User currentUser = Driver.currentUser;
		Car car;
		boolean submited;
		
		Input.prompt("Enter downpayment: ");
		downPayment = Input.newDouble();
		//valid.isSufficientPayment();
		//valid.isPositive();
		//valid.isNotOverPaying();
		System.out.println("enter length of loan");
		Display.options("4years","5 years", "6 years");
		loanLength = Input.newInt();
		//valid.isOption();
		monthlyPayment = LotSystem.caluculateMonthlyPayment();
		//build Contract constructor and assign args
		Contract newOffer = new Contract();
		System.out.println(newOffer);
		Display.options("Submit this offer","Start over", "Exit");
		choice = Input.newInt();
		
		System.out.println("make another offer");
		choice = Input.newInt();
		
	}

	public void performAction() {
		switch (choice) {
		case 1: navigateTo(Menu.offerSubmitted); break;
		case 2: navigateTo(Menu.customer); break;
		default: System.out.println("not an option"); break;
		}
	}

}
