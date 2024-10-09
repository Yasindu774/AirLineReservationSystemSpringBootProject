package com.springboot.jpa.repository;

import com.springboot.jpa.domain.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("flightRepository")
public interface FlightRepository extends JpaRepository<Flight,Integer> {
    void deleteByFlightNumber(String id);
}
