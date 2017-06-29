package pl.mwaleria.cci.ch01;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_03 {

    private static final int CHAR_COUNT = 256;


    public static boolean isPermuted(char[] first, char[] second) {
        if(first.length != second.length) {
            return false;
        }
        int[] firstChars = new int[CHAR_COUNT];
        int[] secondChars = new int[CHAR_COUNT];

        for(char c : first)
            firstChars[(int) c]++;
        for(char c :second)
            secondChars[(int) c]++;

        for(int i = 0 ; i < firstChars.length ; i++) {
            if(firstChars[i] != secondChars[i]) {
                return false;
            }
        }


        return true;
    }
}
