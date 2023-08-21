package org.example;

import org.example.models.impl.ChildrensMovie;
import org.example.models.Movie;
import org.example.models.impl.RegularMovie;

import java.util.HashMap;
import java.util.Map;

public class VideoRegistry {
    public enum VideoType {REGULAR, CHILDRENS};
    private static Map<String, VideoType> movieRegistry = new HashMap();

    public static VideoType getType(String title) {
        return movieRegistry.get(title);
    }

    public static void addMovie(String title, VideoType videoType){
        movieRegistry.put(title,videoType);
    }

    public static Movie getMovie(String title){
        switch (movieRegistry.get(title)){
            case REGULAR:
                return new RegularMovie(title);
            case CHILDRENS:
                return new ChildrensMovie(title);
        }
        return null;
    }

}
