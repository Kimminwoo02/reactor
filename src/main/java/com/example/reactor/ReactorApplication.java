package com.example.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ReactorApplication {

	public static void main(String[] args) {
		var publisher = new Publisher();
		publisher.startFlux()
						.subscribe(System.out::println);

		System.out.println(" Do it");
	}

}
