package org.example.people;

public class Pilot extends CrewMember{


    public int LicenseNum;

    public Pilot(String name, CrewRank crewRank, int LicenseNum) {
        super(name, crewRank);
        this.LicenseNum = LicenseNum;
    }

    public int getLicenseNum() {
        return LicenseNum;
    }
}


