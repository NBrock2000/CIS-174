package com.nathan.week2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double balance;
		int response;
		int year = 1;
		final double intRate = 0.03;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter inital bank balance > ");
		balance =  keyboard.nextDouble();
		keyboard.nextLine();
		do {
			balance =  balance + balance*intRate;
			System.out.println("After year " + year + " at " + intRate + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balnce at the end of another year?");
			System.out.println("Enter 1 for yes");
			System.out.print("  or any other number for no >>");
			response = keyboard.nextInt();
			
		} while(response == 1);
	}
}
