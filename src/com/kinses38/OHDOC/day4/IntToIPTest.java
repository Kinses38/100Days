package com.kinses38.OHDOC.day4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToIPTest {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", IntToIP.longToIP(2154959208L));
        assertEquals("0.0.0.0", IntToIP.longToIP(0));
        assertEquals("128.32.10.1", IntToIP.longToIP(2149583361L));
    }
}
