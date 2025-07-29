package com.dilaraalk.scheduled;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
	// cron -> * * * * * *
	@Scheduled(cron = "00 03 23 * * *")
	public void write1To10() {
		for (int i = 1; i<=10; i++) {
			System.out.println(i+ " ");
			
		}
	}

}
