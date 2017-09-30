package com.cloudnative;

import com.cloudnative.model.Reservation;
import com.cloudnative.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class SampleDataCLR implements CommandLineRunner {

    private final ReservationRepository reservationRepository;

    public SampleDataCLR(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        /*Stream.of("Jatinder", "Priyanka")
            .forEach(rn -> reservationRepository.save(new Reservation(rn)));

        reservationRepository.findAll().forEach(System.out::println);*/

    }
}
