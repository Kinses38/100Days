package com.kinses38.OHDOC.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
        assertEquals(11, Keypad.presses("PQRST"));
    }
}