package org.example.flights;

public enum AirportCode {

    EDINBURGH("EDI"),
    GLASGOW("GLA"),
    ALICANTE("ALI");


    private final String code;

    AirportCode(String code) {this.code = code; }

    public String getCode() {
        return code;
    }
}
