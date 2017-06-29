package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_04Test {


    @Test
    public void testWithPolishSentence(){
        String s1 =      "ALA MA KOTA    ";
        String expected ="ALA%20MA%20KOTA";
        char[]  string = s1.toCharArray();
        Task01_04.replace(string,11);
        assertCharArray(expected.toCharArray(),string);
    }

    @Test
    public void testWithEnglishSentence(){
        String s1 =      "I LIKE MY DOG      ";
        String expected ="I%20LIKE%20MY%20DOG";
        char[]  string = s1.toCharArray();
        Task01_04.replace(string,13);
        assertCharArray(expected.toCharArray(),string);
    }


    private void assertCharArray(char[] first, char[] second) {
        if(first.length!=second.length) {
            fail("Arrays should be the same size");
        }
        for(int i = 0 ; i < first.length-1; i++) {
            if(first[i]!=second[i]) {
                System.out.println("first="+new String(first));
                System.out.println("second  ="+new String(second));
                fail(
                        new StringBuilder()
                                .append("first[")
                                .append(i)
                                .append("]=")
                                .append(first[i])
                                .append(" ,second[")
                                .append(i)
                                .append("]=")
                                .append(second[i])
                                .toString());
            }
        }
    }
}
