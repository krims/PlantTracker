package org.krimeet;

import org.krimeet.entities.Plant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlantRepository extends MongoRepository<Plant, String> {
	public Plant findByAlias(String alias);
}
