package com.springboot.jpa.controller;

import com.springboot.jpa.domain.Flight;
import com.springboot.jpa.exception.ResourceNotFoundException;
import com.springboot.jpa.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/flight")

public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @GetMapping("/list")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Flight getFlight(@PathVariable("id") int id){
        Optional<Flight> optionalFlight = flightRepository.findById(id);
        if(optionalFlight.isPresent()){
            return optionalFlight.get();
        }
        return null;
    }

    @PostMapping("/create")
    public String create(@RequestBody Flight flight){
        flightRepository.save(flight);
        return "Successfully Created";
        
    }

    @PutMapping("/update")
    public String update(@RequestBody Flight flight){
        flightRepository.save(flight);
        return "Successfully Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id){
    	Flight flight = flightRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Flight not exist with id :" + id));
        flightRepository.delete(flight);
        return "Successfully Deleted";
    }

}
