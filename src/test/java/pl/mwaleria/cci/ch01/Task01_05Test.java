package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_05Test {


    @Test
    public void shouldCompressSimpleText() {
        String input = "aaaa";
        String expected="a4";
        assertEquals(expected,Task01_05.compress(input));
    }

    @Test
    public void shouldNoCompressDueOutputIsGreaterThanInput() {
        String input = "abcd";
        String expected="abcd";
        assertEquals(expected,Task01_05.compress(input));
    }

    @Test
    public void shouldNoCompressDueInputIs2char() {
        String input = "aa";
        String expected="aa";
        assertEquals(expected,Task01_05.compress(input));
    }
    @Test
    public void shouldNoCompressDueOutputAndInputAreTheSameLength() {
        String input = "aad";
        String expected="aad";
        assertEquals(expected,Task01_05.compress(input));
    }

    @Test
    public void shouldCompressExampleFromBook() {
        String input = "aabcccccaaa";
        String expected="a2b1c5a3";
        assertEquals(expected,Task01_05.compress(input));
    }
}