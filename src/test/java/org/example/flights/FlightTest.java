package org.example.flights;

import org.example.people.CabinCrewMember;
import org.example.people.CrewRank;
import org.example.people.Passenger;
import org.example.people.Pilot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {


    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrew;
    Passenger passenger1;
    Passenger passenger2;

    @BeforeEach
    void setUp() {
        passenger1 = new Passenger("Hugh Tennant", 1);
        passenger2 = new Passenger("Arthur Guinness", 4);
        cabinCrew = new CabinCrewMember("Anne Anderson", CrewRank.FLIGHTATTENDANT);
        pilot = new Pilot("Hubert Henkelstenk", CrewRank.CAPTAIN, 123456);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, 987654, AirportCode.GLASGOW, AirportCode.ALICANTE, "06:00 6th Nov 2023");

    }

    @Test
    void getPilot() {
        flight.getPilot();
        assertEquals("Hubert Henkelstenk", flight.getPilot());
    }

    @Test
    void getCrew() {
    }

    @Test
    void getPassengers() {
    }

    @Test
    void getPlane() {
    }

    @Test
    void getFlightNumber() {
    }

    @Test
    void getDestAirport() {
    }

    @Test
    void getDeparAirport() {
    }

    @Test
    void getDepartureTime() {
    }

    @Test
    void setFlightNumber() {
    }

    @Test
    void setDepartureTime() {
    }
}