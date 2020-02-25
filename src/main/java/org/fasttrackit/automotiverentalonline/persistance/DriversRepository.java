package org.fasttrackit.automotiverentalonline.persistance;

import org.fasttrackit.automotiverentalonline.domain.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriversRepository extends JpaRepository<Drivers, Long> {
}
