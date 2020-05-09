package com.revature.contracts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.revature.cars.Car;
import com.revature.daoimp.PaymentDAOImp;
import com.revature.users.User;

public class Contract {
	private int contractID;
	private int offerID; //car,user,price,length
	private List<Payment> payments = new ArrayList<>();//paid
	
	//for factory
	public Contract(int offerID, double downPayment) {
		super();
		this.offerID = offerID;
	}
	

	public Contract(int contractID, int offerID, ArrayList<Payment> payments) {
		super();
		this.contractID = contractID;
		this.offerID = offerID;
		this.payments = payments;
	}


	@Override
	public String toString() {
		return "Contract "+contractID+
				", offerID=" + offerID +
				", payments:\n" + payments + "\n";
	}
	
	
	

	

}
