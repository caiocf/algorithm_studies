package org.example;
import org.example.models.Rental;

import java.util.ArrayList;
import java.util.List;


public class RentalCalculator {


    private List<Rental> rentals = new ArrayList<>();

    public void addRental(String title, int days) {
        rentals.add(new Rental(title, days));
    }

    public int getRentalFee() {
        int fee = 0;
        for (Rental rental :rentals) {
            fee += rental.getFee();
        }
        return fee;
    }


    public int getRentalPoints() {
        int points = 0;
        for (Rental rental :rentals) {
            points +=  rental.getPoints();
        }
        return points;
    }

    public void clear(){
        rentals.clear();
    }

}
