package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testEmptyString() {
        assertEquals("", ReverseString.reverseString(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertEquals("a", ReverseString.reverseString("a"));
    }

    @Test
    public void testSimpleString() {
        assertEquals("cba", ReverseString.reverseString("abc"));
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals("cba fed", ReverseString.reverseString("def abc"));
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertEquals("!@#$%", ReverseString.reverseString("%$#@!"));
    }

    @Test
    public void testPalindromeString() {
        assertEquals("madam", ReverseString.reverseString("madam"));
    }

    @Test
    public void testMixedCaseString() {
        assertEquals("EdCbA", ReverseString.reverseString("AbCdE"));
    }

    @Test
    public void testLongString() {
        assertEquals("gnirtS gnol a si sihT", ReverseString.reverseString("This is a long String"));
    }


}
