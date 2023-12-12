package com.example.projetoussema1.Repository;

import com.example.projetoussema1.Entities.Reservation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation,String> {
}
