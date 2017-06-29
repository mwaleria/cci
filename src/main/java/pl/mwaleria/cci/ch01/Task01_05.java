package pl.mwaleria.cci.ch01;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_05  {

    public static String compress(String inputStr) {
        if(inputStr.length() <=2 ) {
            return inputStr;
        }
        char[] input = inputStr.toCharArray();
        char last = input[0];
        int count = 1;
        StringBuilder builder = new StringBuilder(input.length);
        for(int i = 1; i < input.length ; i++) {
            if(last == input[i]) {
                count++;
            } else {
                builder.append(last);
                builder.append(count);
                last= input[i];
                count = 1;
            }
        }
        builder.append(last);
        builder.append(count);
        String result = builder.toString();
        if(result.length() < inputStr.length()) {
            return result;
        }
        return inputStr;
    }
}
