package com.kinses38.OHDOC.day7.HackerRank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudulentActivitiesTest {

    @Test
    public void tests(){
        assertEquals(0, FraudulentActivities.activityNotifications(new int[]{1, 2, 3, 4, 4},4));
        assertEquals(2, FraudulentActivities.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 7, 4, 5},5));
    }
}
