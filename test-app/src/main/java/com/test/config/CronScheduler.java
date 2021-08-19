package com.test.config;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronScheduler {
	
	@Scheduled(cron = "0 16 11 * * *")
	public void job() {
		System.out.println("Event trigger at: "+ LocalDateTime.now());
	}
}
