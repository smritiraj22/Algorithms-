package com.smriti.alogorithms.arrays;

public class TwoArraySum {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8 };
		for(int i:twoArraySum(arr1, arr2)){
			System.out.println(i);
		}
	}

	public static int[] twoArraySum(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;

		if (len1 > len2) {
			return calSum(arr1, arr2);
		} else {
			return calSum(arr2, arr1);
		}
	}

	private static int[] calSum(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int carryover = 0;

		int len = len1 + 1;
		int[] arr = new int[len];
		if (len1 - len2 > 0)
			for (int i = len1 - 1; i > len1 - len2; i--) {
				arr[i + 1] = arr1[i];
			}

		for (int i = len2 - 1; i >= 0; i--) {
			int sum = arr1[i] + arr2[i] + carryover;
			if (sum >= 10) {
				carryover = sum / 10;
				int temp = sum % 10;				
				arr[i + 1] = temp;
				continue;
			} else {
				arr[i + 1] = sum;
			}
		}
		arr[0] = carryover;
		return arr;

	}

}
