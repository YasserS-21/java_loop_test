package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class SumOfDigitsTest {

    @Test
    public void testSingleDigit() {
        assertEquals(5, SumOfDigits.sumOfDigits(5));
    }

    @Test
    public void testTwoDigits() {
        assertEquals(7, SumOfDigits.sumOfDigits(25));
    }

    @Test
    public void testThreeDigits() {
        assertEquals(6, SumOfDigits.sumOfDigits(123));
    }

    @Test
    public void testZero() {
        assertEquals(0, SumOfDigits.sumOfDigits(0));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(45, SumOfDigits.sumOfDigits(123456789));
    }

    @Test
    public void testNumberWithZeros() {
        assertEquals(5, SumOfDigits.sumOfDigits(5000));
    }

}
