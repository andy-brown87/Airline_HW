package org.example.flights;

import org.example.people.CabinCrewMember;
import org.example.people.Passenger;
import org.example.people.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilot;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private AirportCode destAirport;
    private AirportCode deparAirport;
    private String departureTime;



    public Flight(Plane plane, int flightNumber, AirportCode destAirport, AirportCode deparAirport, String departureTime) {
        this.pilot = new ArrayList<Pilot>();
        this.crew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.deparAirport = deparAirport;
        this.destAirport = destAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public AirportCode getDestAirport() {
        return destAirport;
    }

    public AirportCode getDeparAirport() {
        return deparAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }



}
