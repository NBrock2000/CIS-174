package com.nathan.week1hw;

public class StarFigures {

	public static void main(String[] args) {
		starGrid();
		star1();
		emptySpace();
		starGrid();
		star1();
		starGrid();
		emptySpace();
		star2();
		starGrid();
		star1();
	}

	private static void starGrid() {
		System.out.println("*****");
		System.out.println("*****");
	}

	private static void emptySpace() {
		System.out.println();
		System.out.println();
	}

	private static void star1() {
		System.out.println(" * *");
		System.out.println("  *");
		System.out.println(" * *");
	}

	private static void star2() {
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
	}
}
