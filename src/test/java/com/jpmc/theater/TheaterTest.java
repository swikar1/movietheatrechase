package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TheaterTest {
    @Test
    void testConstructor() {
        LocalDateProvider localDateProvider = new LocalDateProvider();
        assertSame((new Theater(localDateProvider)).provider, localDateProvider);
    }

    @Test
    void testReserve() {

        Theater theater = new Theater(new LocalDateProvider());
        theater.reserve(new Customer("Name", "42"), 1, 1);
    }


    @Test
    void testReserve2() {
        Theater theater = new Theater(new LocalDateProvider());
        assertThrows(IllegalStateException.class, () -> theater.reserve(new Customer("Name", "42"), 0, 1));
    }

    @Test
    void testReserve3() {
        Theater theater = new Theater(new LocalDateProvider());
        assertThrows(IllegalStateException.class, () -> theater.reserve(new Customer("Name", "42"), 0, 1));
    }

    @Test
    void testReserve4() {
        Theater theater = new Theater(new LocalDateProvider());
        theater.reserve(new Customer("Name", "42"), 1, 1);
    }

    @Test
    void testReserve5() {
        Theater theater = new Theater(new LocalDateProvider());
        assertThrows(IllegalStateException.class, () -> theater.reserve(new Customer("Name", "42"), 0, 1));
    }

    @Test
    void testReserve6() {
        Theater theater = new Theater(new LocalDateProvider());
        theater.reserve(new Customer("Name", "42"), 1, 1);
    }

    @Test
    void testReserve7() {
        Theater theater = new Theater(new LocalDateProvider());
        assertThrows(IllegalStateException.class, () -> theater.reserve(new Customer("Name", "42"), 0, 1));
    }

    @Test
    void testReserve8() {

        Theater theater = new Theater(new LocalDateProvider());
        theater.reserve(new Customer("Name", "42"), 1, 1);
    }

    @Test
    void testReserve9() {
        Theater theater = new Theater(new LocalDateProvider());
        assertThrows(IllegalStateException.class, () -> theater.reserve(new Customer("Name", "42"), 0, 1));
    }

}

