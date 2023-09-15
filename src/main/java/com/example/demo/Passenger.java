package com.example.demo;

public class Passenger {
    private int passengerID;
    private int weight;

    public Passenger(int passengerID, int weight) {
        this.passengerID = passengerID;
        this.weight = weight;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
