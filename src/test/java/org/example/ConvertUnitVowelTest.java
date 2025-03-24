package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class ConvertUnitVowelTest {
    //testEmptyString
    @Test
    public void testEmptyString() {
        assertEquals("", ConvertUnitVowel.convertUntilVowel(""));
    }

    @Test
    public void testStringWithNoVowels() {
        assertEquals("bcdfghjklmnpqrstvwxyz", ConvertUnitVowel.convertUntilVowel("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    public void testStringWithOnlyVowels() {
        assertEquals("AEIOU", ConvertUnitVowel.convertUntilVowel("aeiou"));
    }

    @Test
    public void testStringWithMixedCharacters() {
        assertEquals("hEllO wOrld", ConvertUnitVowel.convertUntilVowel("hello world"));
    }

    @Test
    public void testStringWithMixedCaseVowels() {
        assertEquals("StrIng wIth mIxEd cAsE vOwEls", ConvertUnitVowel.convertUntilVowel("String with mixed case vowels"));
    }
}
