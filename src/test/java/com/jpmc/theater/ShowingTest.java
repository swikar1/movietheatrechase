package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ShowingTest {
    @Test
    void testConstructor() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        Showing actualShowing = new Showing(movie, 1, ofResult);

        assertSame(movie, actualShowing.getMovie());
        assertEquals(1, actualShowing.getSequenceOfTheDay());
        assertSame(ofResult, actualShowing.getStartTime());
    }

    @Test
    void testConstructor2() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        Showing actualShowing = new Showing(movie, 1, ofResult);

        assertSame(movie, actualShowing.getMovie());
        assertEquals(1, actualShowing.getSequenceOfTheDay());
        assertSame(ofResult, actualShowing.getStartTime());
    }

    @Test
    void testIsSequence() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertTrue((new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1))).isSequence(1));
    }

    @Test
    void testIsSequence2() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertFalse((new Showing(movie, 0, LocalDateTime.of(1, 1, 1, 1, 1))).isSequence(1));
    }

    @Test
    void testIsSequence3() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertTrue((new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1))).isSequence(1));
    }

    @Test
    void testIsSequence4() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertFalse((new Showing(movie, 0, LocalDateTime.of(1, 1, 1, 1, 1))).isSequence(1));
    }

    @Test
    void testGetMovieFee() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertEquals(10.0, (new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1))).getMovieFee());
    }

    @Test
    void testGetMovieFee2() {
        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertEquals(10.0, (new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1))).getMovieFee());
    }
}

