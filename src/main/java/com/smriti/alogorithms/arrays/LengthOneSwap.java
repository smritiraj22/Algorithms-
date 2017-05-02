package com.smriti.alogorithms.arrays;

/**
 * Created by smraj on 5/1/2017.
 */
public class LengthOneSwap {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 6, 9, -11, -20, 13, 14};

        System.out.println(lengthOneSwap(arr));
        int[] arr1 = {-1, 0, 1, 2, 3, 4};

        System.out.println(lengthOneSwap(arr1));

    }

    static Boolean lengthOneSwap(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] - arr[i + 1] == 1) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
