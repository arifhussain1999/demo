package com.example.demo;

import java.util.List;

public class Lift {
   private int LiftNo;
   private int CapacityInWeight;
   private int CapacityInPerson;

   private List<Passenger> list;

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, List<Passenger> list) {
        LiftNo = liftNo;
        CapacityInWeight = capacityInWeight;
        CapacityInPerson = capacityInPerson;
        this.list = list;
    }

    public Lift() {
    }

    public int getLiftNo() {
        return LiftNo;
    }

    public void setLiftNo(int liftNo) {
        LiftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return CapacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        CapacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return CapacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        CapacityInPerson = capacityInPerson;
    }

    public List<Passenger> getList() {
        return list;
    }

    public void setList(List<Passenger> list) {
        this.list = list;
    }
}
