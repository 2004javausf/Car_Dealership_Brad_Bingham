package com.revature.contracts;

public class Payment {
	private double value;

	public Payment(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Payment [value=" + value + "]";
	}

	public boolean isValid() {
		if (value > 0)
			return true;
		return false;
	}

}
