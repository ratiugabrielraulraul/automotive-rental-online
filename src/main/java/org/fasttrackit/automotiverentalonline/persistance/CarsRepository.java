package org.fasttrackit.automotiverentalonline.persistance;

import org.fasttrackit.automotiverentalonline.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository <Cars, Long> {

}
