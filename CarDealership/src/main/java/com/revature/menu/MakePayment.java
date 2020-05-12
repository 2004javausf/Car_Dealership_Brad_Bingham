package com.revature.menu;

import java.sql.SQLException;

import com.revature.contracts.Payment;
import com.revature.daoimp.PaymentDAOImp;
import com.revature.system.ContractDetail;

public class MakePayment {
	private int contractID;
	private ContractDetail details;
	boolean isValidPayment;
	private Payment payment;
	
	public MakePayment() {
		super();
		this.contractID = 0;
		this.details = null;
		this.isValidPayment = false;
		this.payment = null;
	}
	
	public boolean checkPayment(Payment payment) {
		if(payment.isValid()) {
			this.payment = payment;
			this.contractID = payment.getContractID();
			this.details = new ContractDetail(contractID);
			isValidPayment = true;
			return true;
		}
		System.out.println("Amount must be between 1 and "+details.getRemaingBalance()+".");
		return false;
	}
	
	public void makePayment() {
		if(isValidPayment) {
			PaymentDAOImp pdi = new PaymentDAOImp();
			try {
				pdi.insertPayment(payment.getValue(), this.contractID);
				System.out.println("successful payment");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
