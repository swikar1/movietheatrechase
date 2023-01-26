package com.jpmc.theater;

import org.junit.jupiter.api.Test;

class LocalDateProviderTest {
    @Test
    void testSingleton() {

        LocalDateProvider.singleton();
    }
}

