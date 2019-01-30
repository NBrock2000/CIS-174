package com.nathan.week1.hw;

public class EggStop {

	public static void main(String[] args) {
		print1();
		print2();
		print3();
		print5();
		print6();
		print5();
		print6();
		printPlus();
		
		print1();
		print2();
		print3();
		printText();
		print5();
		print6();
		
		print1();
		print2();
		print3();
		printPlus2();
	}

	private static void printText() {
		System.out.println("|   STOP  |");
	}

	private static void print1() {
		System.out.println("  _______");
	}

	private static void print2() {
		System.out.println(" /       \\");
	}

	private static void print3() {
		System.out.println("/         \\");
	}

	private static void printPlus() {
		System.out.println(" +-------+");
		System.out.println();
	}
	
	private static void printPlus2() {
		System.out.println("+---------+");
	}

	private static void print5() {
		System.out.println("\\         /");
	}

	private static void print6() {
		System.out.println(" \\_______/");
	}
}
