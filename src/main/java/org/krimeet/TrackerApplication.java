package org.krimeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "org.krimeet", "org.krimeet.dao", "org.krimeet.entities", "org.krimeet.service" })
public class TrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
}
