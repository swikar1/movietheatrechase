package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ReservationTest {
    @Test
    void testConstructor() {

        Customer customer = new Customer("Name", "42");

        Movie movie = new Movie("Dr", null, 10.0, 1);

        new Reservation(customer, new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1)), 3);

    }

    @Test
    void testConstructor2() {

        Customer customer = new Customer("Name", "42");

        Movie movie = new Movie("Dr", null, 10.0, 1);

        new Reservation(customer, new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1)), 3);

    }

    @Test
    void testTotalFee() {
        Customer customer = new Customer("Name", "42");

        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertEquals(30.0,
                (new Reservation(customer, new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1)), 3)).totalFee());
    }

    @Test
    void testTotalFee2() {
        Customer customer = new Customer("Name", "42");

        Movie movie = new Movie("Dr", null, 10.0, 1);

        assertEquals(30.0,
                (new Reservation(customer, new Showing(movie, 1, LocalDateTime.of(1, 1, 1, 1, 1)), 3)).totalFee());
    }
}

