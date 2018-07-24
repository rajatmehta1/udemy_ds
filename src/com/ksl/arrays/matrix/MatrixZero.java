package com.ksl.arrays.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * if a value is zero in a row or col make the entrie row and col as zero
 */
public class MatrixZero {

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1,1,1},
                {2,2,0,1,2},
                {2,2,2,1,2},
                {2,2,3,1,2},
                {2,2,2,0,2}

        };

        printArr(arr);

            makeZero(arr);

        printArr(arr);

    }

    public static void makeZero(int[][] a) {
        HashMap<Integer,String> rows = new HashMap<>();
        HashMap<Integer,String> cols = new HashMap<>();

        for(int r = 0 ; r < a.length ; r++) {
            for(int c = 0 ; c < a.length ; c++) {
                if(a[r][c] == 0) {
                    rows.put(r,"p");
                    cols.put(c,"p");
                }
            }
        }

        for(int r = 0 ; r < a.length ; r++) {
            for(int c = 0 ; c < a.length ; c++) {
                if(rows.containsKey(r)) {
                    a[r][c] = 0;
                }
                if(cols.containsKey(c)) {
                    a[r][c] = 0;
                }
            }
        }
    }

    public static void printArr(int[][] a) {

        System.out.println("\n-----------------------------\n");

        for(int r = 0 ; r < a.length ; r++) {
            System.out.println();
            for(int c = 0 ; c < a.length ; c++) {
                System.out.print( a[r][c] + "," );
            }
        }
    }

}
