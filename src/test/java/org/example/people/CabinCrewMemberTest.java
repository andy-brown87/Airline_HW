package org.example.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Anne Anderson", CrewRank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){assertEquals("Anne Anderson", cabinCrewMember.getName());}

    @Test
    public void canMakeAnnouncement(){
        assertEquals("Please listen to the safety brief", cabinCrewMember.makeAnnouncement());}



}