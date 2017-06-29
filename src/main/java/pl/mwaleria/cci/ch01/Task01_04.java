package pl.mwaleria.cci.ch01;

/**
 * Created by walema1 on 29.06.2017.
 */
public class Task01_04 {


    private static final char SPACE =' ';
    private static final char[] SEQ = {'0','2','%'};
    public static void replace(char[] array, int arrayTextSize) {
        int lastIndexInArrayWithText = arrayTextSize -1 ;
        int indexOFLastNoSpace = -1;
        for(int i = array.length-1; i >= 0 ; i--) {
            if(array[i] != SPACE) {
                indexOFLastNoSpace = i;
                break;
            }
        }
        int countOfSpaces =0;

        //validate end spaces

        for(int i = 0 ; i <= indexOFLastNoSpace ; i++) {
            if(array[i] == SPACE) countOfSpaces ++;
        }
        int arrayLengthDiff = array.length - arrayTextSize;

        for(int i=indexOFLastNoSpace; i >=0 ; i--) {
            if(array[i] == SPACE) {
                for(int j = 0 ; j < SEQ.length ; j++) {
                    array[i + arrayLengthDiff] = SEQ[j];
                    arrayLengthDiff--;
                }
                arrayLengthDiff++;
            } else {
                array[i+arrayLengthDiff] = array[i];
            }
        }
    }
}
