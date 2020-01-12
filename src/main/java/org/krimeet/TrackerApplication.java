package org.krimeet;

import org.krimeet.entities.Plant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan({ "org.krimeet" })
public class TrackerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "local"); // set local as default
		SpringApplication.run(TrackerApplication.class, args);
	}

	@Bean
	@Profile("local")
	CommandLineRunner init(PlantRepository repo) {
		return args -> {
			if (repo.count() > 1) {
				return; // only set temp plant if empty
			}
			Plant plant = new Plant();
			plant.setAlias("Snake Plant");
			plant.setGenus("Sansevieria");
			plant.setSchedule("2 weeks");
			repo.save(plant);
			repo.findAll().forEach(System.out::println);
		};
	}
}
