package com.jpmc.theater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DiscountUtils {

    private static Logger logger = LoggerFactory.getLogger(DiscountUtils.class);

    private DiscountUtils() {
        throw new IllegalStateException("Utility class");
    }

    private static final int MOVIE_CODE_SPECIAL = 1;
    private static double specialDiscount = 0;
    private static double sequenceDiscount = 0;

    public static double getDiscount(int showSequence, LocalDateTime dateTime, int specialCode, double ticketPrice) {

        // time between 11am ~ 4pm
        LocalDateTime startDateTime = LocalDateTime.of(LocalDateProvider.singleton().currentDate(), LocalTime.of(11, 0));
        LocalDateTime endDateTime = LocalDateTime.of(LocalDateProvider.singleton().currentDate(), LocalTime.of(16, 0));

        if (MOVIE_CODE_SPECIAL == specialCode) {
            specialDiscount = ticketPrice * 0.2;  // 20% discount for special movie
        }

        if (dateTime.isAfter(startDateTime) && dateTime.isBefore(endDateTime)) {
            specialDiscount = ticketPrice * 0.25;  // 25% discount for movie
        }

        switch (showSequence) {
            case 1:
                sequenceDiscount = 3; // $3 discount for 1st show
                break;
            case 2:
                sequenceDiscount = 2; // $2 discount for 2nd show
                break;
            case 7:
                sequenceDiscount = 1; // $1 discount for 7th day show
                break;
        }

        // biggest discount wins
        return Math.max(specialDiscount, sequenceDiscount);
    }
}
