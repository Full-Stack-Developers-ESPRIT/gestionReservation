package com.example.projetoussema1.Services;

import com.example.projetoussema1.Entities.Reservation;
import com.example.projetoussema1.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;



    public Reservation AddReservation(Reservation e ) {

        return  reservationRepository.save(e);
    }

    public List<Reservation> GetReservation(){

        return  reservationRepository.findAll();

    }

    public Optional<Reservation> GetReservationId(String id) {

        return reservationRepository.findById(id);
    }


    public Reservation UpdateReservation(Reservation e ) {

        return  reservationRepository.save(e);
    }

    public void deleteReservationById(String id) {
        reservationRepository.deleteById(id);
    }


}
