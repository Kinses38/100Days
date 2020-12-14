package com.kinses38.OHDOC.day7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextSmallestNumberTest {

    @Test
    public void basicTests() {
        assertEquals(12, NextSmallestNumber.nextSmaller(21));
        assertEquals(790, NextSmallestNumber.nextSmaller(907));
        assertEquals(513, NextSmallestNumber.nextSmaller(531));
        assertEquals(-1, NextSmallestNumber.nextSmaller(1027));
        assertEquals(414, NextSmallestNumber.nextSmaller(441));
        assertEquals(123456789, NextSmallestNumber.nextSmaller(123456798));
    }
}
