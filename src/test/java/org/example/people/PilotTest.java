package org.example.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Hubert Henkelstenk", CrewRank.CAPTAIN, 123456);
    }

    @Test
    public void hasName(){
        assertEquals("Hubert Henkelstenk", pilot.getName());
    }

    @Test
    public void hasCrewRank(){
        assertEquals("Captain", pilot.crewRank.getCrewRank());
    }

    @Test
    public void hasLicenseNum(){
        assertEquals(123456, pilot.LicenseNum);
    }

}