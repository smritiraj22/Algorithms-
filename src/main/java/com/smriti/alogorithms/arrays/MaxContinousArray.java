package com.smriti.alogorithms.arrays;

public class MaxContinousArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 11, 13, 15 };
		System.out.println(maxContinousSubarray(arr));

	}

	public static int maxContinousSubarray(int[] arr) {
		int currLen = 1;
		int maxLen = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				currLen = currLen+1;
			} else {
				maxLen = Math.max(currLen, maxLen);
			}

		}

		return maxLen;

	}

}
