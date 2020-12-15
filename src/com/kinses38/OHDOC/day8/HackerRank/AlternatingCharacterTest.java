package com.kinses38.OHDOC.day8.HackerRank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternatingCharacterTest {

    @Test
    public void test(){
        assertEquals(3,AlternatingCharacter.alternatingCharacters("AAAA"));
        assertEquals(4,AlternatingCharacter.alternatingCharacters("BBBBB"));
        assertEquals(0, AlternatingCharacter.alternatingCharacters("ABABABA"));
    }
}
