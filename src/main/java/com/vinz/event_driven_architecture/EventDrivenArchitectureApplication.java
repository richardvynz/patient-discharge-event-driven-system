package com.vinz.event_driven_architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventDrivenArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventDrivenArchitectureApplication.class, args);
	}

}
