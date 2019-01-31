package com.nathan.week2;

import java.time.LocalDateTime;

public class CompairloopTimes {

	public static void main(String[] args) {
		int startTime, endTime;
		final int repeat = 100_000;
		final int factor = 1_000_000;
		LocalDateTime now;
		now = LocalDateTime.now();
		startTime = now.getNano();
		for(int x = 0; x <= repeat; x++) 
			for(int y = 0; y <= repeat; y++);
			now = LocalDateTime.now();
			endTime = now.getNano();
			System.out.println("Time for loops starting from 0: " + ((endTime-startTime) / factor) + " miliseconds");
			now = LocalDateTime.now();
			startTime = now.getNano();
			for(int x = 0; x <= repeat; x++) 
				for(int y = 0; y <= repeat; y++);
				now = LocalDateTime.now();
				endTime = now.getNano();
				System.out.println("Time for loops starting from 0: " + ((endTime-startTime) / factor) + " miliseconds");
			
			
			
		
	}
}
