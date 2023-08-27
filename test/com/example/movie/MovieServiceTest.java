// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MovieServiceTest {
    @Test
    void find_Aliens_ReturnsOne() {
        List<ReadOnlyMovie> actual = MovieService.getInstance().find("Aliens");
        
        assertEquals(1, actual.size());
        final ReadOnlyMovie movie = actual.get(0);
        assertEquals("Aliens", movie.getTitle());
        assertEquals(1986, movie.getYear());
        assertEquals(Rating.R, movie.getRating());
    }

    @Test
    void find_EmptyString_ReturnsAllMovies() {
        List<ReadOnlyMovie> actual = MovieService.getInstance().find("");

        assertEquals(10, actual.size());
    }

    @Test
    void find_Null_ReturnsAllMovies() {
        List<ReadOnlyMovie> actual = MovieService.getInstance().find(null);

        assertEquals(10, actual.size());
    }

    @Test
    void find_The_ReturnsThree() {
        List<ReadOnlyMovie> actual = MovieService.getInstance().find("the");
        
        assertEquals(3, actual.size());
        assertEquals("Back to the Future", actual.get(0).getTitle());
        assertEquals("The Last Starfighter", actual.get(1).getTitle());
        assertEquals("The Terminator", actual.get(2).getTitle());
    }
}
