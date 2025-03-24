package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class CountDigitsTest {

    @Test
    public void testPositiveSingleDigit() {
        assertEquals(1, CountDigits.countDigits(5));
    }

    @Test
    public void testPositiveMultipleDigits() {
        assertEquals(3, CountDigits.countDigits(123));
    }

    @Test
    public void testLargePositiveNumber() {
        assertEquals(9, CountDigits.countDigits(123456789));
    }

    @Test
    public void testOne() {
        assertEquals(1, CountDigits.countDigits(1));
    }

    @Test
    public void testTen() {
        assertEquals(2, CountDigits.countDigits(10));
    }

}
