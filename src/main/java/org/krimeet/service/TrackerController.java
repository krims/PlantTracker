package org.krimeet.service;

import org.krimeet.entities.Plant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tracker")
public class TrackerController {
	private static final Logger LOG = LoggerFactory.getLogger(TrackerController.class.getName());

	@RequestMapping("/plant")
	public Plant sample(@RequestParam(value = "id", defaultValue = "1") String name) {
		LOG.info("[sample called] - {}");
		return new Plant();
	}
}
