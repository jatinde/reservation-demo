package com.cloudnative.processor;

import com.cloudnative.model.Reservation;
import com.cloudnative.repository.ReservationRepository;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint
public class ReservationProcessor {

    private final ReservationRepository reservationRepository;

    public ReservationProcessor(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @ServiceActivator(inputChannel = "input")
    public void acceptNewReservation(Message<String> msg) {
        this.reservationRepository.save(new Reservation(msg.getPayload()));
    }
}
