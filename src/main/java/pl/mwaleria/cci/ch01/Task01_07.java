package pl.mwaleria.cci.ch01;

import java.util.HashSet;
import java.util.Set;

public class Task01_07 {


    public static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        Set<Integer> rowIndexZero = new HashSet<>();
        Set<Integer> columnIndexZero = new HashSet<>();

        for(int i=0; i< rows ; i++) {
            for(int j=0; j< columns ; j++) {
                if(matrix[i][j] ==0) {
                    rowIndexZero.add(i);
                    columnIndexZero.add(j);
                }
            }
        }
        for(Integer zeroRow : rowIndexZero) {
            for(int j=0; j < columns ; j++) {
                matrix[zeroRow][j] = 0;
            }
        }
        for(Integer zeroColumn : columnIndexZero) {
            for(int i =0; i < rows; i++) {
                matrix[i][zeroColumn] = 0;
            }
        }

    }
}
