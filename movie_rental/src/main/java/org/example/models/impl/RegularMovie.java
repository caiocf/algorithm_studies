package org.example.models.impl;

import org.example.models.Rental;
import org.example.models.Movie;

public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public int getFee(int days, Rental rental) {
        return applyGracePeriod(150, days, 3);
    }

    @Override
    public int getPoints(int days, Rental rental) {
        return applyGracePeriod(1, days, 3);
    }
}
