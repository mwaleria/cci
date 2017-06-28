package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by walema1 on 28.06.2017.
 */
public class Task01_01Test {


    @Test
    public void hasUniqueChars() {
        String input = "abc";
        boolean result = Task01_01.hasUniqueChars(input.toCharArray());
        assertTrue(result);
    }

    @Test
    public void hasNotUniqueChars() {
        String input = "abcdefgABCDEFGaHIK";
        boolean result = Task01_01.hasUniqueChars(input.toCharArray());
        assertFalse(result);
    }
}