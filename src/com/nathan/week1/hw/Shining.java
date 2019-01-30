package com.nathan.week1.hw;

public class Shining {

	public static void main(String[] args) {
		PrintStringX1000();
	}
	
	private static void PrintString() {
		System.out.println("All work and no play makes Jack a dull boy.");
	}
	private static void PrintStringX10() {
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		PrintString();
		
	}
	private static void PrintStringX100() {
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		PrintStringX10();
		
	}
	private static void PrintStringX1000() {
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		PrintStringX100();
		
	}
}
