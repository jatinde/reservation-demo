package com.cloudnative.repository;

import com.cloudnative.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @RestResource(path = "/by-name", rel = "searchByName")
    Collection<Reservation> findByReservationName(@Param("reservationName") String reservationName);
}
