package org.example.people;

public class CrewMember extends Person{


   CrewRank crewRank;


    public CrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    public CrewRank getCrewRank() {
        return crewRank;
    }

}
