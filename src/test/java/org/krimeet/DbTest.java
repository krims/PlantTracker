package org.krimeet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krimeet.dao.PlantRepository;
import org.krimeet.entities.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TrackerApplication.class)
public class DbTest {
	@Autowired
	private PlantRepository plantRepo;

	@Test
	public void givenCrudRepo_whenSaveAndRetrieveEntity_thenOK() {
		Plant plant = new Plant();
		plant.setAlias("Snake Plant");
		plant.setGenus("Sansevieria");
		plant.setSchedule("2 weeks");
		Plant savedPlant = plantRepo.save(plant);
		Optional<Plant> foundPlant = plantRepo.findById(savedPlant.id);

		assertTrue(foundPlant.isPresent());
		assertEquals(savedPlant.getAlias(), foundPlant.get().getAlias());
	}
}
