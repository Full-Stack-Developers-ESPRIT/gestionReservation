package com.example.projetoussema1.Controllers;

import com.example.projetoussema1.Entities.Reservation;
import com.example.projetoussema1.Services.ReservationService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("reservation")

public class ReservationController {


    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Reservation>> getAllCommandes() {
        List<Reservation> reservations = reservationService.GetReservation();
        return ResponseEntity.ok(reservations);
    }
    @PostMapping("saveReservation")
    public ResponseEntity<Reservation> saveReservation(@RequestBody Reservation reservation) {
        Reservation savedCommande = reservationService.AddReservation(reservation);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommande);
    }

    @GetMapping("getReservationById/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") String id) {
        Optional<Reservation> reservation = reservationService.GetReservationId(id);
        return reservation.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("deleteReservationById/{id}")
    public ResponseEntity<Void> deleteReservationById(@PathVariable String id) {
        reservationService.deleteReservationById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("updateReservation")
    public ResponseEntity<Reservation> updateReservation(@RequestBody Reservation reservation) {
        Reservation savedCommande = reservationService.UpdateReservation(reservation);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommande);
    }
}
