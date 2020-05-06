package com.revature.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.driver.Driver;

public abstract class MenuNode {
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String BLACK_BRIGHT = "\033[0;90m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	protected int choice = -1;
	
	public MenuNode() { super(); }
	
	private void setChoice(int input) { this.choice = input; }
	
	public abstract void runDisplay();
	
	public abstract void getInput();

	public abstract void performAction();
	
	public void navigateTo(MenuNode node) {	Driver.node = node;	}


	protected static class Display{
		public static void header(String input) {
			System.out.println(ANSI_YELLOW+input+ANSI_RESET);
		}
		public static void options(String ... input) {
			for (int i = 0; i < input.length; i++) {
				System.out.println((i+1)+": "+input[i]);
			}
		}
		public static <T> void list(ArrayList<T> items) {
			for(T item: items) {
				System.out.println(item.toString());
			}
			System.out.println("\n");
		}
		
	}
	protected static class Input{
		static Scanner scan = new Scanner(System.in);
		public static void prompt() {
			System.out.print(BLACK_BRIGHT+"Please make a selection: "+ANSI_RESET);
		}
		public static void prompt(String input) {
			System.out.print(BLACK_BRIGHT+input+ANSI_RESET);
		}
		public static int newInt() {
			return Integer.parseInt(scan.nextLine());	
		}
		public static String newString() {
			return scan.nextLine();	
		}
		public static double newDouble() {
			return Double.parseDouble(scan.nextLine());
		}

	}
	
}

