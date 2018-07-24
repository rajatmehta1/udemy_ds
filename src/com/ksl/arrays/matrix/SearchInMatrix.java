package com.ksl.arrays.matrix;

/*
 * Elements in a matrix are sorted in the rows as well as in the cols and
 * we have to find a particular element key
 *
 */
public class SearchInMatrix {

    public static void main(String[] arg) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {8,10,12,14,16},
                {10,12,15,18,20},
                {20,25,30,35,40},
                {25,30,36,45,55}
        };

        Result r = searchFor(arr, 67);

        if(null == r)
            System.out.println(" Not found");
        else
            System.out.println(r.toString());

    }

    public static Result searchFor(int[][] arr, int key) {

        int row = 0 ; int col = arr.length - 1;
        while(row < arr.length && col > 0) {
            if(arr[row][col] > key ) {
                col = col - 1;
                continue;
            }
            if(arr[row][col] < key ) {
                row = row + 1;
                continue;
            }
            if(arr[row][col] == key ) {
                return new Result(row,col);
            }

        }
        return null;
    }


    public static class Result {
        public int row;
        public int col;
        public Result(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String toString() {
            return "row : " + row + " , col : " + col;
        }
    }

}
