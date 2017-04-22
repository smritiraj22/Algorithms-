package com.smriti.alogorithms;

import java.util.Arrays;

/**
 * Created by smraj on 4/12/2017.
 */
public class AccurateSortingHackerRank {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void accurateSort(int[] arr) {

        int len = arr.length - 1;
        int[] arr1 = (int[]) arr.clone();
        Arrays.sort(arr1);

        inner:
        for (int j = 1; j <= len; j++) {
            if ((arr[j] - arr[j - 1] == 1) || (arr[j] - arr[j - 1]) == -1) {
                swap(arr, j, j - 1);
            } else {

                continue inner;
            }

        }


        if (Arrays.equals(arr1, arr)) {
            System.out.println("Yes");
        } else {
            inner:
            for (int j = len; j >= 0; j--) {
                if ((arr[j] - arr[j - 1] == 1) || (arr[j] - arr[j - 1]) == -1) {
                    swap(arr, j, j - 1);
                } else {

                    continue inner;
                }

            }
            if (Arrays.equals(arr1, arr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

}
