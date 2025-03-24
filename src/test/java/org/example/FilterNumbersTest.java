package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilterNumbersTest {

    @Test
    public void testEmptyString() {
        assertEquals("", FilterNumbers.filterNumbers(""));
    }

    @Test
    public void testStringWithNoNumbers() {
        assertEquals("abcDEF!@", FilterNumbers.filterNumbers("abcDEF!@"));
    }

    @Test
    public void testStringWithOnlyNumbers() {
        assertEquals("", FilterNumbers.filterNumbers("1234567890"));
    }

    @Test
    public void testStringWithMixedCharacters() {
        assertEquals("abcDEF!@", FilterNumbers.filterNumbers("1a2b3c4D5E6F7!8@90"));
    }

    @Test
    public void testStringWithNumbersAtBeginning() {
        assertEquals("abc", FilterNumbers.filterNumbers("123abc"));
    }

    @Test
    public void testStringWithNumbersAtEnd() {
        assertEquals("abc", FilterNumbers.filterNumbers("abc123"));
    }

    @Test
    public void testStringWithNumbersInMiddle() {
        assertEquals("abcDEF", FilterNumbers.filterNumbers("abc123DEF"));
    }

}
