package pl.mwaleria.cci.ch01;

/**
 * Created by walema1 on 28.06.2017.
 */
public class Task01_01 {

    private static final int CHAR_COUNT = 256;

    public static boolean hasUniqueChars(char[] input)  {
        if(input.length > CHAR_COUNT) {
            return true;
        }
        boolean[] chars = new boolean[CHAR_COUNT];
        for(int i = 0 ; i < CHAR_COUNT ; i++) {
            chars[i] = false;
        }
        for(char c : input) {
            int index = (int) c;
            if(chars[index]) {
                return false;
            }
            chars[index] = true;
        }

        return true;
    }
}
