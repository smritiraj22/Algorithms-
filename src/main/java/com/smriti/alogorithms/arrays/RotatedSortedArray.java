package com.smriti.alogorithms.arrays;

/**
 * Created by smraj on 5/1/2017.
 */
public class RotatedSortedArray {

    static int findMin(int arr[], int low, int high) {


        if (high == low) return low;
        if (high < low) return low;

        int mid = low + (high - low) / 2;

        if (arr[mid + 1] < arr[mid] && high > mid) {
            return mid + 1;
        }
        if (arr[mid - 1] > arr[mid] && mid > low) {
            return mid;
        }
        if (arr[high] > arr[mid]) {
            return findMin(arr, low, mid);
        } else {
            return findMin(arr, mid, high);
        }
    }

    static int findPosRotatedArray(int arr[], int low, int high, int num) {
        int pos = findMin(arr, low, high);
        if (arr[pos] < num && num > arr[high]) {
            return binarySearch(arr, num, pos - 1, low);
        } else {
            return binarySearch(arr, num, high, pos);
        }
    }

    static int binarySearch(int arr[], int num, int high, int low) {
        if (high < low) {
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (num == arr[mid]) {
            return mid;
        } else if (num > arr[mid]) {
            return binarySearch(arr, num, high, mid + 1);
        } else {
            return binarySearch(arr, num, mid - 1, low);
        }

    }

    public static void main(String[] args) {
        int arr1[] = {5, 6, -2, -1, 1, 2, 3, 4};
        System.out.println(findMin(arr1, 0, arr1.length - 1));
        System.out.println(findPosRotatedArray(arr1, 0, arr1.length - 1, -2));


    }


}
