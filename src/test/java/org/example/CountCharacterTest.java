package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountCharacterTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, CountCharacter.countCharacter("", 'a'));
    }

    @Test
    public void testSingleCharacterMatch() {
        assertEquals(1, CountCharacter.countCharacter("a", 'a'));
    }

    @Test
    public void testSingleCharacterNoMatch() {
        assertEquals(0, CountCharacter.countCharacter("a", 'b'));
    }

    @Test
    public void testMultipleMatches() {
        assertEquals(3, CountCharacter.countCharacter("banana", 'a'));
    }

    @Test
    public void testNoMatches() {
        assertEquals(0, CountCharacter.countCharacter("banana", 'z'));
    }

    @Test
    public void testCaseSensitive() {
        assertEquals(1, CountCharacter.countCharacter("Banana", 'B'));
        assertEquals(0, CountCharacter.countCharacter("Banana", 'b'));
    }

    @Test
    public void testTargetAtBeginning() {
        assertEquals(1, CountCharacter.countCharacter("apple", 'a'));
    }

    @Test
    public void testTargetAtEnd() {
        assertEquals(1, CountCharacter.countCharacter("apple", 'e'));
    }

    @Test
    public void testTargetInMiddle() {
        assertEquals(2, CountCharacter.countCharacter("apple", 'p'));
    }

    @Test
    public void testTargetAppearsMultipleTimesInARow(){
        assertEquals(3, CountCharacter.countCharacter("aaa", 'a'));
    }

}
