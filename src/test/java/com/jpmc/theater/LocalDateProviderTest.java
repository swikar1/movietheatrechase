package com.jpmc.theater;

import org.junit.jupiter.api.Test;

class LocalDateProviderTest {
    @Test
    void testSingleton() {

        LocalDateProvider.singleton();
    }

    @Test
    void testSingleton2() {

        LocalDateProvider.singleton();
    }

    @Test
    void testCurrentDate() {
        (new LocalDateProvider()).currentDate();
    }
}

