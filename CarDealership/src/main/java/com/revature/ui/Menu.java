package com.revature.ui;

public class Menu {
	public static MenuNode main = new MainNode();
	public static MenuNode logIn = new LogInNode();
	public static MenuNode customer = new CustomerNode();
	public static MenuNode customerLot = new CustomerLotNode();
	public static MenuNode customerOwned = new CustomerLotNode();
	public static MenuNode customerOffer = new CustomerOfferNode();
	public static MenuNode offerSubmitted = new OfferSubmittedNode();
	
	public MenuNode node = main;
	public Menu() {}
}
