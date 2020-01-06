package org.krimeet.dao;

import org.krimeet.PlantRepository;
import org.krimeet.entities.Plant;
import org.springframework.beans.factory.annotation.Autowired;

public class PlantDaoImpl implements PlantDao {
	@Autowired
	private PlantRepository plantRepo;

	@Override
	public Plant getPlantByAlias(String alias) {
		return plantRepo.findByAlias(alias);
	}
}