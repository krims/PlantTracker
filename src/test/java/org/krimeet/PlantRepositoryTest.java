package org.krimeet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krimeet.entities.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PlantRepositoryTest {
	@Autowired
	private PlantRepository plantRepo;

	@DisplayName("given object to save" + " when save object using MongoDB template" + " then object is saved")
	@Test
	public void test(@Autowired MongoTemplate mongoTemplate) {
		Plant plant = new Plant();
		plant.setAlias("Snake Plant");
		plant.setGenus("Sansevieria");
		plant.setSchedule("2 weeks");
		Plant savedPlant = plantRepo.save(plant);
		// Optional<Plant> foundPlant = plantRepo.

		// assertTrue(foundPlant.isPresent());

	}
}
