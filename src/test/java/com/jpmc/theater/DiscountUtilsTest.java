package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class DiscountUtilsTest {
    @Test
    void testGetDiscount() {
        assertEquals(0.0, DiscountUtils.getDiscount(3, LocalDateTime.of(1, 1, 1, 1, 1), 3, 10.0));
        assertEquals(3.0, DiscountUtils.getDiscount(1, LocalDateTime.of(1, 1, 1, 1, 1), 3, 10.0));
        assertEquals(2.0, DiscountUtils.getDiscount(2, LocalDateTime.of(1, 1, 1, 1, 1), 3, 10.0));
        assertEquals(1.0, DiscountUtils.getDiscount(7, LocalDateTime.of(1, 1, 1, 1, 1), 3, 10.0));
        assertEquals(2.0, DiscountUtils.getDiscount(3, LocalDateTime.of(1, 1, 1, 1, 1), 1, 10.0));
    }
}

