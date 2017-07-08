package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by walema1 on 08.07.2017.
 */
public class Task01_06Test {

    @Test
    public void shouldRotate1elementMatrix(){
        int[][] input = {{1}};
        int[][] expected = {{1}};
        Task01_06.rotateBy90Degrees(input);
        assertMatrix(expected,input);
    }

    @Test
    public void shouldRotate4elementMatrix() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expected = {{3, 1}, {4, 2}};
        Task01_06.rotateBy90Degrees(input);
        assertMatrix(expected, input);
    }

    @Test
    public void shouldRotate25elemetnMatrix() {
        int[][] input = {{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] expected = {{21,16,11,6,1},{22,17,12,7,2},{23,18,13,8,3},{24,19,14,9,4},{25,20,15,10,5}};
        Task01_06.rotateBy90Degrees(input);
        assertMatrix(expected, input);
    }

    private void assertMatrix(int[][] expected,int[][] actual) {
        for(int i=0;i< expected.length; i++) {
            for(int j=0;j<expected[i].length; j++) {
                if(expected[i][j] != actual[i][j]) {
                    printErrorMatrix(expected,actual,i,j);
                    fail();
                }
            }
        }
    }

    private void printErrorMatrix(int[][] expected, int[][] actual, int i, int j) {
        System.out.println("Error at i=" + i+", j="+j);
        System.out.println("Expected Matrix:");
        for(int i1 = 0; i1 < expected.length; i1 ++) {
            for(int j1 =0; j1< expected[i1].length;j1++) {
                System.out.print(expected[i1][j1]+ " ");
            }
            System.out.println();
        }
        System.out.println("Actual Matrix:");
        for(int i1 = 0; i1 < actual.length; i1 ++) {
            for(int j1 =0; j1< actual[i1].length;j1++) {
                System.out.print(actual[i1][j1]+ " ");
            }
            System.out.println();
        }
    }

}