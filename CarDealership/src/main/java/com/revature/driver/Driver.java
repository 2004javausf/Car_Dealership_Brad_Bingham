package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.contracts.Contract;
import com.revature.daoimp.ContractDAOImp;

public class Driver {
	public static ContractDAOImp di = new ContractDAOImp();
	
	public static void main(String[] args) {
		try {
//			di.insertContract(5,666);
			ArrayList<Contract> testi = (ArrayList<Contract>) di.getContractList();
			System.out.println(testi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
