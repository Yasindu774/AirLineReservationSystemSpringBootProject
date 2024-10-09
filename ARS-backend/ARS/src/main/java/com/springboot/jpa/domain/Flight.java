package com.springboot.jpa.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "flight_flightid_seq")
	@Column(name = "flight_number",scale = 10)
    private int flightNumber;

    @Column(name = "flight_airline")
    private String flightAirLine;

    @Column(name="departure_airport")
    private String departureAirport;

    @Column(name = "arrival_airport")
    private String arrivalAirport;

    @Column(name = "departure_date")
    @Temporal(TemporalType.DATE)
    private Date departureDate;

    @Column(name="arrival_date")
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;

    @Column(name = "adults_ticket_price")
    private double adultsTicketPrice;

    @Column(name="children_ticket_price")
    private double childrenTicketPrice;

    public Flight() {
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightAirLine() {
        return flightAirLine;
    }

    public void setFlightAirLine(String flightAirLine) {
        this.flightAirLine = flightAirLine;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
    	
        this.arrivalDate = arrivalDate;
    }

    public double getAdultsTicketPrice() {
        return adultsTicketPrice;
    }

    public void setAdultsTicketPrice(double adultsTicketPrice) {
        this.adultsTicketPrice = adultsTicketPrice;
    }

    public double getChildrenTicketPrice() {
        return childrenTicketPrice;
    }

    public void setChildrenTicketPrice(double childrenTicketPrice) {
        this.childrenTicketPrice = childrenTicketPrice;
    }
}
