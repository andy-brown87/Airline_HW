package org.example.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob Bobson", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Bob Bobson", passenger.getName());
    }

    @Test
    public void canGetBags(){
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void canSetBags(){
        passenger.setBags(5);
        assertEquals(5, passenger.getBags());
    }



}