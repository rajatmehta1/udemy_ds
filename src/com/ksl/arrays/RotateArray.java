package com.ksl.arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] input = { 1,2,3,4,5,6,7,8,9 };

        printArr(input);
            rotateArray(input, -2);
        printArr(input);

    }

    public static void printArr(int[] input) {
        System.out.println("\n");
        for(int i : input) {
            System.out.print( i + ", ");
        }
    }

    public static void rotateArray(int[] arr, int rotateBy) {

        //1. check if rotating is +ve or -ve
        //2. check if rotating is more than the length of the array

       rotateArray(arr, 0 , arr.length - 1);
       if(rotateBy > 0) {
           if(rotateBy > (arr.length - 1))
               rotateArray(arr, rotateBy, arr.length - 1);
           rotateArray(arr, rotateBy, arr.length - 1);
       }
       else {
           rotateArray(arr, 0, arr.length - 1 + rotateBy);
       }

    }

    public static void rotateArray(int[] arr,int start, int end) {

        //1. check if rotating is +ve or -ve

        //2. check if rotating is more than the length of the array

        for(int i = start, j = end; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

}
