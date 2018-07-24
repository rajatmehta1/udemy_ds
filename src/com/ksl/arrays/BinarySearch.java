package com.ksl.arrays;

public class BinarySearch {

    public static void main(String[] args) throws Exception {
        int[] arr = {2, 5, 8, 9 , 16, 23, 38, 56, 72, 91};

        int result = doBinSearch(arr, 23, 0);
        if(result == -1) System.out.println("Not found");
        else System.out.println("Recursive Result index : " + result);


        result = doBinSearch(arr, 23, 1);
        if(result == -1) System.out.println("Not found");
        else System.out.println("Iterative Result index : " + result);
    }


    public static  int doBinSearch(int[] arr, int key, int type) throws BinaryException {
        //defensive coding
        if(null == arr || arr.length == 0)
            throw new BinaryException("Bad input data");

        // Also check if array is sorted or not. In case of unsorted again throw BinaryException
        if(type == 0) {
            return binSearchRecursive(arr, 0, arr.length - 1, key);
        } else {
            return binSearchIterative(arr, key);
        }
    }


    public static int binSearchRecursive(int[] arr, int start, int end, int key) {

        if(start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if(key == arr[mid]) {
            return mid;
        }
        else if(key > arr[mid]) {
            return binSearchRecursive(arr, mid + 1, end, key);
        }
        else if(key < arr[mid]) {
            return binSearchRecursive(arr, 0, mid - 1, key);
        }

        return -1;
    }


    public static int binSearchIterative(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(key == arr[mid]) {
                return mid;
            }
            else if(key > arr[mid]) {
                start = mid + 1;
            }
            else if(key < arr[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }



}
