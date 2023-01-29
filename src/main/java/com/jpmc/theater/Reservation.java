package com.jpmc.theater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reservation {

    private static Logger logger = LoggerFactory.getLogger(Reservation.class);


    private Customer customer;
    private Showing showing;
    private int audienceCount;

    public Reservation(Customer customer, Showing showing, int audienceCount) {
        this.customer = customer;
        this.showing = showing;
        this.audienceCount = audienceCount;
    }

    public double totalFee() {
        return showing.getMovieFee() * audienceCount;
    }
}


