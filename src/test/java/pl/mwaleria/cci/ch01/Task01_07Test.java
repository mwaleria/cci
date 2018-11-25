package pl.mwaleria.cci.ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task01_07Test {


    @Test
    public void testMatrixWithoutZeros() {

        int[][] matrixInput = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrixExpected = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        Task01_07.setZeros(matrixInput);
        assertTheSame(matrixExpected, matrixInput);
    }


    @Test
    public void testMatrixWithOneZero() {

        int[][] matrixInput = {{1, 0, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrixExpected = {{0, 0, 0}, {1, 0, 3}, {1, 0, 3}};
        Task01_07.setZeros(matrixInput);
        assertTheSame(matrixExpected, matrixInput);
    }

    @Test
    public void testMatrixWithOneManyZeros() {

        int[][] matrixInput = {{1, 0, 3}, {1, 2, 0}, {1, 2, 3}};
        int[][] matrixExpected = {{0, 0, 0}, {0, 0, 0}, {1, 0, 0}};
        Task01_07.setZeros(matrixInput);
        assertTheSame(matrixExpected, matrixInput);
    }

    void assertTheSame(int[][] expected, int[][] actual) {
        int rows = expected.length;
        int columns = expected[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                assertEquals(String.format("i = %s, j=%s", i, j), expected[i][j], actual[i][j]);
            }
        }
    }

}