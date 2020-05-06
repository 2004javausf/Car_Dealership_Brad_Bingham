package com.revature.holdthis;

public class HoldThis {
	

//	private static class CustomerPaymentNode extends MenuNode{
//		public CustomerPaymentNode() {
//			super("---Car Payments---", "Specific car listed","all payment info");
//		}
//		public void performAction(int choice) {
//			System.out.println("back");
//			int userChoice = getInput(int);
//			
//
//			switch (choice) {
//			case 1: navigateTo(CustomerOwnedNode); break;
//			case 2: navigateTo(CustomerNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
//	private static class EmployeeNode extends MenuNode{
//		public EmployeeNode() {
//			super("---Employee---", "Add/remove car","View Offers", "ViewContracts");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//			valid.isVehicleNumber();
//			valid.vehicleIsAvailable();
//
//			switch (choice) {
//			case 1: navigateTo(EmployeeLotNode); break;
//			case 2: navigateTo(EmployeeOfferNode); break;
//			case 3: navigateTo(EmployeeContractNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
//	private static class EmployeeLotNode extends MenuNode{
//		public EmployeeLotNode() {
//			super("---Employee Lot---", "add car","removecar");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//	
//
//			switch (choice) {
//			case 1: navigateTo(AddCarNode); break;
//			case 2: navigateTo(RemoveCarNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
////----------------------------------------------------------------
//	private static class AddCarNode extends MenuNode{
//		public AddCarNode() {
//			super("---Employee Lot---", "add car","removecar");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//	
//
//			switch (choice) {
//			case 1: navigateTo(AddCarNode); break;
//			case 2: navigateTo(RemoveCarNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
//	private static class RemoveCarNode extends MenuNode{
//		public RemoveCarNode() {
//			super("---Employee Lot---", "add car","removecar");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//	
//
//			switch (choice) {
//			case 1: navigateTo(AddCarNode); break;
//			case 2: navigateTo(RemoveCarNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
//	private static class EmployeeOfferNode extends MenuNode{
//		public EmployeeOfferNode() {
//			super("---Employee---", "Add/remove car","View Offers", "ViewContracts");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//			valid.isVehicleNumber();
//			valid.vehicleIsAvailable();
//
//			switch (choice) {
//			case 1: navigateTo(EmployeeLotNode); break;
//			case 2: navigateTo(EmployeeOfferNode); break;
//			case 3: navigateTo(EmployeeContractNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
//	private static class EmployeeContractNode extends MenuNode{
//		public EmployeeContractNode() {
//			super("---Employee---", "Add/remove car","View Offers", "ViewContracts");
//		}
//		public void performAction(int choice) {
//			int userChoice = getInput(int);
//			valid.isVehicleNumber();
//			valid.vehicleIsAvailable();
//
//			switch (choice) {
//			case 1: navigateTo(EmployeeLotNode); break;
//			case 2: navigateTo(EmployeeOfferNode); break;
//			case 3: navigateTo(EmployeeContractNode); break;
//			default: System.out.println("not an option"); break;
//			}
//		}
//	}
	
//	private static class MainMenu{
//		private String head = "---Main Header ---";
//		private String[] options = {"Log In","Register User", "exit"};
//		//function
//		private String header1 = "---Log in header---"; 
//		private String[] inputs1 = {"username", "password"};
//		public void method1() { System.out.println("LogIn to Customers"); }
//		private String header2 = "---Register header---"; 
//		private String[] inputs2 = {"username", "password"};
//		public void method2() { System.out.println("Register and Log into customers"); }
//	}
//	private static class CustomerMenu{
//		private String head = "---Customer Header ---";
//		private String[] options = {"View Lot","View My Cars", "exit"};
//		private String header1 = "List of all cars\nWould you like to make an offer?"; 
//		private String[] inputs1 = {"car# or 0exit", "Downpayment","termlength"};
//		public void method1() { System.out.println("Make an Offer()"); }
//		private String header2 = "List of owned cars\nwould you like to view payment history"; 
//		private String[] inputs2 = {"car# or 0exit", "back or exit"};
//		public void method2() { System.out.println("viewPayments"); }
//	}
//	private static class EmployeeMenu{
//		private String head = "---Employee Header ---";
//		private String[] options = {"Manage Lot","Manage Contracts", "exit"};
//		private String header1 = "List of all cars\nadd,delete,exit"; 
//		private String[] inputs1 = {"car# or 0exit", "Downpayment","termlength"};
//		public void method1() { System.out.println("Make an Offer()"); }
//		private String header2 = "List of contracts\ndetermine,viewPayments,exit"; 
//		private String[] inputs2 = {"car# or 0exit", "back or exit"};
//		public void method2() { System.out.println("viewPayments"); }
//	}
//	private Scanner scan = new Scanner(System.in);
//	MainMenu current = new MainMenu();
//
//	
//
////	public void runMenu() {
////		while(true) {
////			printHead();
////			int choice =getInput();
////			performAction(choice);
////		}
////	}
//
//	private void printHead() {
//		System.out.println(current.head);
//		for (int i = 0; i < current.options.length; i++) {
//			System.out.println((i+1)+". "+current.options[i]);
//		}
//	}
//
//	private int getInput() {
//		System.out.print("make a choice: ");
//		int input = Integer.parseInt(scan.nextLine());
//		if(isInRange(input))
//			return input;
//		else
//			return -1;
//	}
//
//	private boolean isInRange(int input) {
//		int listLength = current.options.length;
//		return (input > 0 || input < listLength);
//	}
//
//
//	private void performAction(int choice) {
//		String a=null,b=null,c=null,d=null;
//		int count = 0;
//		switch (choice) {
//		case 1: 
//			System.out.println(current.options[0]+" Menu");
//			while(count < current.inputs1.length) {
//				System.out.print("Please enter\n   "+current.inputs1[count]+": ");
//				if(a == null) a=scan.nextLine();
//				else if(b == null) b=scan.nextLine();
//				else if(c == null) c=scan.nextLine();
//				else if(d == null) d=scan.nextLine();
//				count++;
//			}
//			current.method1();
//				break;
//		case 2: 
//			System.out.println(current.options[1]+" Menu");
//			while(count < current.inputs2.length) {
//				System.out.print("Please enter\n   "+current.inputs2[count]+": ");
//				if(a == null) a=scan.nextLine();
//				else if(b == null) b=scan.nextLine();
//				else if(c == null) c=scan.nextLine();
//				else if(d == null) d=scan.nextLine();
//				count++;
//			}
//			current.method2();
//				break;
//		default: break;
//		}
//	}
//
//	
}
