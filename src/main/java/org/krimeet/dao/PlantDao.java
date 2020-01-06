package org.krimeet.dao;

import org.krimeet.entities.Plant;

public interface PlantDao {
	public Plant getPlantByAlias(String alias);
}
