package org.fasttrackit.automotiverentalonline.persistance;

import org.fasttrackit.automotiverentalonline.domain.CarRoutes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRoutesRepository extends JpaRepository<CarRoutes,Long> {
}
