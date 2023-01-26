package com.jpmc.theater;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    void testConstructor() {
        assertEquals("name: Name", (new Customer("Name", "42")).toString());
    }

    @Test
    void testEquals() {
        assertFalse((new Customer("Name", "42")).equals(null));
        assertFalse((new Customer("Name", "42")).equals("Different type to Customer"));
    }

    @Test
    void testEquals2() {
        Customer customer = new Customer("Name", "42");
        assertTrue(customer.equals(customer));
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer.hashCode());
    }

    @Test
    void testEquals3() {
        Customer customer = new Customer("Name", "42");
        Customer customer1 = new Customer("Name", "42");

        assertTrue(customer.equals(customer1));
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer1.hashCode());
    }

    @Test
    void testEquals4() {
        Customer customer = new Customer("com.jpmc.theater.Customer", "42");
        assertFalse(customer.equals(new Customer("Name", "42")));
    }

    @Test
    void testEquals5() {
        Customer customer = new Customer("Name", "Id");
        assertFalse(customer.equals(new Customer("Name", "42")));
    }
}

