package org.example.models.impl;

import org.example.models.Rental;
import org.example.models.Movie;

public class ChildrensMovie extends Movie {
    public ChildrensMovie(String title) {
        super(title);
    }

    @Override
    public int getFee(int days, Rental rental) {
        return days * 100;
    }

    @Override
    public int getPoints(int days, Rental rental) {
        return 1;
    }
}
