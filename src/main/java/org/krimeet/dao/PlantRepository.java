package org.krimeet.dao;

import org.krimeet.entities.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {

}
