package com.revature.contracts;

public class Payment {
	private int paymentID;
	private int contractID;
	private double value;
	
	//create in factory
	public Payment(double value,int contractID) {
		super();
		this.value = value;
		this.contractID = contractID;
	}
	//create from sql
	public Payment(int paymentID,double value,int contractID) {
		super();
		this.paymentID = paymentID;
		this.value = value;
		this.contractID = contractID;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "\tPayment "+paymentID+
				" [Amount=" + value + "]\n";
	}

	public boolean isValid() {
		//TODO add carlookup(id) make sure payment doesn't exceed balance
		if (value > 0)
			return true;
		return false;
	}
	public int getContractID() {
		return contractID;
	}

}
