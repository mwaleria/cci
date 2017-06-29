package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_03Test {

    @Test
    public void isNotPermutedDueCharArrayLength() {
        char[] first = "Ala ma kota".toCharArray();
        char[] second ="Sierotka ma rysia".toCharArray();
        boolean result = Task01_03.isPermuted(first,second);
        assertFalse(result);
    }

    @Test
    public void isNotPermuted() {
        char[] first = "cat".toCharArray();
        char[] second ="dog".toCharArray();
        boolean result = Task01_03.isPermuted(first,second);
        assertFalse(result);
    }

    @Test
    public void isPermuted(){
        char[] first = "aaaazzzz".toCharArray();
        char[] second ="zazazaza".toCharArray();
        boolean result = Task01_03.isPermuted(first,second);
        assertTrue(result);
    }

}