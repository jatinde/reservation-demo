package com.cloudnative.controller;

import com.cloudnative.model.Reservation;
import com.cloudnative.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReservationRestController {

    private final ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservationsRest")
    public Collection<Reservation> reservations(){
        return reservationRepository.findAll();
    }
}
