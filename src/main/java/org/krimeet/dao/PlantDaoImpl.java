package org.krimeet.dao;

import java.util.List;

import org.krimeet.PlantRepository;
import org.krimeet.entities.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlantDaoImpl implements PlantDao {
	@Autowired
	private PlantRepository plantRepo;

	@Override
	public Plant getPlantByAlias(String alias) {
		return plantRepo.findByAlias(alias);
	}

	@Override
	public List<Plant> getAllPlants() {
		return plantRepo.findAll();
	}
}