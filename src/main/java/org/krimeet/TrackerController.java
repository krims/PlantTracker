package org.krimeet;

import java.util.List;

import org.krimeet.dao.PlantDao;
import org.krimeet.entities.Plant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tracker")
@CrossOrigin(origins = "http://localhost:4200")
public class TrackerController {
	private static final Logger LOG = LoggerFactory.getLogger(TrackerController.class.getName());

	@Autowired
	PlantDao dao;

	@GetMapping("/plant")
	public Plant plantById(@RequestParam(value = "id", defaultValue = "1") String name) {
		return dao.getPlantByAlias("");
	}

	@GetMapping("/plants")
	public List<Plant> allPlants() {
		return dao.getAllPlants();
	}
}
