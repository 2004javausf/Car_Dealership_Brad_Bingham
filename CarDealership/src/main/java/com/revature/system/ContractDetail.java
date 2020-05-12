package com.revature.system;

import java.util.Iterator;
import java.util.List;

import com.revature.cars.Car;
import com.revature.contracts.Contract;
import com.revature.contracts.Offer;
import com.revature.contracts.Payment;

public class ContractDetail {
	private Lot lot = Lot.getLotData().getLotData();
	private List<Contract> contractList = lot.getContracts();
	private List<Offer> offerList = lot.getOffers();
	private List<Car> carList = lot.getCars();

	private Contract contract;
	private Offer offer;
	private Car car;
	private double totalPrice;
	private double totalPaid;
	private double remaingBalance;
	private int monthsLeftOnLoan;

	public ContractDetail(int contractID) {
		super();
		contract = contractByID(contractID);
		offer = offerByID(contract.getOfferID());
		car = carByID(offer.getCarID());
		calculatePaymentInfo();
	}

	private Contract contractByID(int contractID) {
		Iterator<Contract> itr = contractList.iterator();
		while (itr.hasNext()) {
			Contract contract = itr.next();
			if (contract.getContractID() == contractID)
				return contract;
		}
		return null;
	}

	private Offer offerByID(int offerID) {
		Iterator<Offer> itr = offerList.iterator();
		while (itr.hasNext()) {
			Offer temp = itr.next();
			if (temp.getID() == offerID)
				return temp;
		}
		return null;
	}

	private Car carByID(int carID) {
		Iterator<Car> itr = carList.iterator();
		while (itr.hasNext()) {
			Car car = itr.next();
			if (car.getID() == carID)
				return car;
		}
		return null;
	}

	public void calculatePaymentInfo() {
		totalPrice = car.getPrice().getValue();
		List<Payment> payments = contract.getPayments();
		Iterator<Payment> itr = payments.iterator();
		monthsLeftOnLoan = offer.getTermLoanLength().getLength();
		while (itr.hasNext()) {
			Payment payment1 = itr.next();
			monthsLeftOnLoan--;
			totalPaid += payment1.getValue();
		}
		remaingBalance = totalPrice - totalPaid;
	}

	public Contract getContract() {
		return contract;
	}

	public Offer getOffer() {
		return offer;
	}

	public Car getCar() {
		return car;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public double getRemaingBalance() {
		return remaingBalance;
	}

	public int getMonthsLeftOnLoan() {
		return monthsLeftOnLoan;
	}

	@Override
	public String toString() {
		return "ContractDetail [contract=" + contract +
				", offer=" + offer +
				", car=" + car +
				", totalPrice="+ totalPrice +
				",\n totalPaid=" + totalPaid +
				",\n remaingBalance=" + remaingBalance +
				",\n monthsLeftOnLoan="+ monthsLeftOnLoan + "]";
	}
	

}
