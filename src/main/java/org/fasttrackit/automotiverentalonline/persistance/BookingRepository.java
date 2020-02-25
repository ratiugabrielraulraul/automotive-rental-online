package org.fasttrackit.automotiverentalonline.persistance;

import org.fasttrackit.automotiverentalonline.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
