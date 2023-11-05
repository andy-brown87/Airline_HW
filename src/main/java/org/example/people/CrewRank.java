package org.example.people;

public enum CrewRank{


    CAPTAIN("Captain"),

    FIRSTOFFICER("First Officer"),

    PURSER("Purser"),

    FLIGHTATTENDANT("FlightAttendant");



    private final String crewRank;


    CrewRank(String crewRank) {this.crewRank = crewRank; }

    public String getCrewRank() {
        return crewRank;
    }
}
