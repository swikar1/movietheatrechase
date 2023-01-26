package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class MovieTest {
    @Test
    void testConstructor() {
        Movie actualMovie = new Movie("Dr", null, 10.0, 1);

        assertNull(actualMovie.getRunningTime());
        assertEquals(10.0, actualMovie.getTicketPrice());
        assertEquals("Dr", actualMovie.getTitle());
    }

    @Test
    void testConstructor2() {
        Movie actualMovie = new Movie("Dr", null, 10.0, 1);

        assertNull(actualMovie.getRunningTime());
        assertEquals("Dr", actualMovie.getTitle());
        assertEquals(10.0, actualMovie.getTicketPrice());
    }

    @Test
    void testCalculateTicketPrice() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(7.0, movie.calculateTicketPrice(new Showing(movie1, 1, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice2() {
        Movie movie = new Movie("Dr", null, 10.0, 0);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(7.0, movie.calculateTicketPrice(new Showing(movie1, 1, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice3() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(8.0, movie.calculateTicketPrice(new Showing(movie1, 0, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice4() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(8.0, movie.calculateTicketPrice(new Showing(movie1, 7, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice5() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(7.0, movie.calculateTicketPrice(new Showing(movie1, 1, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice6() {
        Movie movie = new Movie("Dr", null, 10.0, 0);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(7.0, movie.calculateTicketPrice(new Showing(movie1, 1, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice7() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(8.0, movie.calculateTicketPrice(new Showing(movie1, 0, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice8() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(8.0, movie.calculateTicketPrice(new Showing(movie1, 2, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testCalculateTicketPrice9() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(8.0, movie.calculateTicketPrice(new Showing(movie1, 7, LocalDateTime.of(1, 1, 1, 1, 1))));
    }

    @Test
    void testEquals() {
        assertNotEquals(new Movie("Dr", null, 10.0, 1), null);
        assertNotEquals(new Movie("Dr", null, 10.0, 1), "Different type to Movie");
    }

    @Test
    void testEquals2() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        assertEquals(movie, movie);
        int expectedHashCodeResult = movie.hashCode();
        assertEquals(expectedHashCodeResult, movie.hashCode());
    }

    @Test
    void testEquals3() {
        Movie movie = new Movie("Dr", null, 10.0, 1);
        Movie movie1 = new Movie("Dr", null, 10.0, 1);

        assertEquals(movie, movie1);
        int expectedHashCodeResult = movie.hashCode();
        assertEquals(expectedHashCodeResult, movie1.hashCode());
    }

    @Test
    void testEquals4() {
        Movie movie = new Movie(null, null, 10.0, 1);
        assertNotEquals(movie, new Movie("Dr", null, 10.0, 1));
    }

    @Test
    void testEquals5() {
        Movie movie = new Movie("Dr", null, 0.2, 1);
        assertNotEquals(movie, new Movie("Dr", null, 10.0, 1));
    }

    @Test
    void testEquals6() {
        Movie movie = new Movie("Dr", null, 10.0, 0);
        assertNotEquals(movie, new Movie("Dr", null, 10.0, 1));
    }
}

