package com.kinses38.OHDOC.day5.CodeWars;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
        assertEquals(11, Keypad.presses("PQRST"));
        assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }
}