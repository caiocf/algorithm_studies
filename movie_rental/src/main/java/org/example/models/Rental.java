package org.example.models;
import org.example.VideoRegistry;
import org.example.models.Movie;

public class Rental {
    private int  days;

    private Movie movie;

    public Rental(String title, int days) {
        this.days = days;
        this.movie = VideoRegistry.getMovie(title);
    }

    public String getTitle(){
        return movie.getTitle();
    }

    public int getPoints() {
        return movie.getPoints(days,this);
    }

    public int getFee() {
        return movie.getFee(days,this);
    }

}
