package com.revature.driver;

import com.revature.cars.Car;
import com.revature.lot.LotSystem;
import com.revature.ui.Menu;
import com.revature.ui.MenuNode;
import com.revature.users.User;

public class Driver {
	
	public static LotSystem lot = new LotSystem();
	public static Menu menu = new Menu();
	public static MenuNode node = menu.node;
	public static User currentUser;
	public static Car currentCar;
	
	public static void main(String[] args) {
		
		while(true) {
			node.runDisplay();
			node.getInput();
			node.performAction();
		}

	}

	
}
