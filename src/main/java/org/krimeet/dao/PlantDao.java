package org.krimeet.dao;

import java.util.List;

import org.krimeet.entities.Plant;

public interface PlantDao {
	public Plant getPlantByAlias(String alias);

	public List<Plant> getAllPlants();
}
