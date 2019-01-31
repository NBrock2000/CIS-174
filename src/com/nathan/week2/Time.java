package com.nathan.week2;

import java.time.LocalDateTime;

public class Time {

	public static void main(String[] args) {
		LocalDateTime now;
		int nowSec;
		int prevSec = 0;
		
		for(;;) {
			now = LocalDateTime.now();
			int hour = now.getHour();
			nowSec = now.getSecond();
			if(nowSec != prevSec) {
				if(now.getHour() > 12) {
					hour = hour-12;
					System.out.println(hour + ":"+ now.getMinute() + ":" + nowSec);
				} else {
					System.out.println(now.getHour() + ":"+ now.getMinute() + ":" + nowSec);
				}
				
				prevSec = nowSec;
			}
		}
	}
}
