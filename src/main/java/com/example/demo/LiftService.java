package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiftService {
    @Autowired
    LiftRepository liftRepository;

    public String addPassenger(Passenger passenger) {
        return liftRepository.addPassenger(passenger);
    }

    public String addLift(Lift lift) {
        return liftRepository.addLift(lift);
    }

    public String deletePassengers() {
        return liftRepository.deletePassengers();
    }

    public int weightGreaterthan50(Lift lift) {
        return liftRepository.weightGreaterthan50(lift);
    }

    public int maximumPassengers(int weight) {
        return liftRepository.maximumPassengers(weight);
    }
}
