package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.mwaleria.cci.ch01.Task01_08.isRotation;

public class Task01_08Test {


    @Test
    public void tests(){
        assertTrue(isRotation("lajkonik","niklajko"));
        assertFalse(isRotation("koko","kokokoko"));
        assertTrue(isRotation("aaaaaaaa","aaaaaaaa"));
        assertTrue(isRotation("abcdefghijk","fghijkabcde"));
        assertFalse(isRotation("qwertyuiop","poiuytrewq"));
    }

}