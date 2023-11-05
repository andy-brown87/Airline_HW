package org.example.flights;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){plane = new Plane (PlaneType.BOEING747);}

    @Test
    public void canGetPlaneCapacity(){assertEquals(467, plane.getPlaneCapacity());}

    @Test
    public void canGetTotalPlaneWeight(){assertEquals(333000, plane.getPlaneWeight());}

}