package com.nathan.week1.hw;

public class Lanterns {

	public static void main(String[] args) {
		printCone();
		System.out.println();
		printCone();
		print1();
		printCone();
		System.out.println();
		printCone();
		print2();
		
	}

	private static void print1() {
		System.out.println("* | | | | | *");
		System.out.println("*************");
	}

	private static void print2() {
		System.out.println("    *****");
		System.out.println("* | | | | | *");
		System.out.println("* | | | | | *");
		System.out.println("    *****");
		System.out.println("    *****");
	}

	private static void printCone() {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}
}
