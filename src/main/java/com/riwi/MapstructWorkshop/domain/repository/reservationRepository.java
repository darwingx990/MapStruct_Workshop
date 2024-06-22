package com.riwi.MapstructWorkshop.domain.repository;

import com.riwi.MapstructWorkshop.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
