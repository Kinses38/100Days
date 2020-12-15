package com.kinses38.OHDOC.day8.HackerRank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingInversionsTest {

    @Test
    public void tests(){
        assertEquals(0, CountingInversions.countInversions(new int[]{1,1,1,2}));
        assertEquals(4,CountingInversions.countInversions(new int[]{2,1,3,1,2}));
    }
}
