package com.nathan.week1.hw;

public class TwoRockets {

	public static void main(String[] args) {
		printTip();
		printHull();
		printText();
		printHull();
		printTip();
	}

	private static void printTip() {
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
		System.out.println(" /    \\   /    \\");
	}
	
	private static void printHull() {
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	
	private static void printText() {
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
	}
	
}
