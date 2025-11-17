package module09._04equality;

import java.util.HashMap;
import java.util.Map;

public class MovieRatings {
    HashMap<String, Integer> movieRatings = new HashMap <>();

    private Map<String, Integer> movies;

    public MovieRatings() {
        movies = new HashMap<>();
    }

    public void addMovie(String movieName, int rating) {
        movies.put(movieName, rating);
        System.out.println("Added: " + movieName);
    }

    public void updateRanking(String movieName, int rating) {
        movies.put(movieName, rating);
    }

    public void removeMovie(String movieName) {
        movies.remove(movieName);
        System.out.println("Removed: " + movieName);
    }


}
