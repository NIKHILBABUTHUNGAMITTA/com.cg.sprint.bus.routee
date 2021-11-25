package com.cg.sprint.bus.route;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Start");

		SpringApplication.run(com.cg.sprint.bus.route.service.RouteService.class, args);
		
		System.out.println("end");
		
		
	}

}
