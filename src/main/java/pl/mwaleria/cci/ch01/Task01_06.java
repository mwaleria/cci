package pl.mwaleria.cci.ch01;

/**
 * Created by walema1 on 08.07.2017.
 */
public class Task01_06 {

    public static void rotateBy90Degrees(int[][] matrix) {

        int iLength = matrix.length-1;
        int jLength = matrix[0].length-1;
        for(int i = 0 ; i < (iLength+1)/2; i++) {
            for(int j= i ; j<(jLength-i); j++ ) {
                int temp = matrix[i][j];
                matrix[i][j] =matrix[iLength-j][i];
                matrix[iLength-j][i]=matrix[iLength-i][jLength-j];
                matrix[iLength-i][jLength-j]=matrix[j][jLength-i];
                matrix[j][jLength-i]=temp;
            }
        }
    }
}
