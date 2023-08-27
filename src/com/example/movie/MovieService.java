// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

import java.util.LinkedList;
import java.util.List;

public class MovieService {
    private static final MovieService INSTANCE = new MovieService();

    public static MovieService getInstance() {
        return INSTANCE;
    }

    private final List<ReadOnlyMovie> movies = new LinkedList<>();

    private MovieService() {
        Movie movie;

        movie = new Movie();
        movie.setTitle("Aliens");
        movie.setYear(1986);
        movie.setRating(Rating.R);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("Back to the Future");
        movie.setYear(1985);
        movie.setRating(Rating.PG);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("Blade Runner");
        movie.setYear(1982);
        movie.setRating(Rating.R);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("Ghostbusters");
        movie.setYear(1984);
        movie.setRating(Rating.PG);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("RoboCop");
        movie.setYear(1987);
        movie.setRating(Rating.R);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("The Last Starfighter");
        movie.setYear(1984);
        movie.setRating(Rating.PG);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("The Terminator");
        movie.setYear(1984);
        movie.setRating(Rating.R);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("Tron");
        movie.setYear(1982);
        movie.setRating(Rating.PG);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("WarGames");
        movie.setYear(1983);
        movie.setRating(Rating.PG);
        movies.add(movie);

        movie = new Movie();
        movie.setTitle("Weird Science");
        movie.setYear(1985);
        movie.setRating(Rating.PG13);
        movies.add(movie);
    }

    public List<ReadOnlyMovie> find(String text) {
        final List<ReadOnlyMovie> result = new LinkedList<>();
        final String search;

        if (text == null) {
            search = "";
        }
        else {
            search = text.toLowerCase();
        }

        for (final ReadOnlyMovie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(search)) {
                result.add(movie);
            }
        }

        return result;
    }
}
