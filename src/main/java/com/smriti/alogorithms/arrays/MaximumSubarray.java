package com.smriti.alogorithms.arrays;

/**
 * Created by smraj on 5/1/2017.
 */
public class MaximumSubarray {
    public static int maxSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum, sum + arr[i]);
        }

        return sum;
    }

    public static int[] positionSkipMultiply(int[] arr) {
        int[] arrB = new int[arr.length];
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                result *= arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                result *= arr[j];
            }
            arrB[i] = result;
            result =1;
        }
        return arrB;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 3, 6, 9, -11, -20, 13, 14};
        System.out.println(maxSum(arr));
        int[] arrA = {1,2,4,5};
        for(int a:positionSkipMultiply(arrA)){
            System.out.println(a);
        }
    }

}
