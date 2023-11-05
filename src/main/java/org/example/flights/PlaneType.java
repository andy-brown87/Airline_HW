package org.example.flights;

public enum PlaneType {

    BOEING747(467,333000),
    BOEING737(150,71000),
    BOEING767(200,143000);

    private final int capacity;
    private final int TotalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        TotalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return TotalWeight;
    }
}
