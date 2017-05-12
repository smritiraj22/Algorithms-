package com.smriti.alogorithms.arrays;

import java.util.Arrays;

public class Modulo3 {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 4, 3, 1, 1 };
		System.out.println(getHigestNumDivisibleByThree(arr));

	}

	private static int getHigestNumDivisibleByThree(int[] arr) {

		int sum = 0;
		StringBuilder str = new StringBuilder();
		Arrays.sort(arr);

		for (int i = arr.length; i > 0; i--) {
			str.append(arr[i - 1]);
		}
		sum = Integer.parseInt(str.toString());
		int remainder = sum % 3;
		if (remainder == 0)
			return Integer.parseInt(str.toString());

		else {
			StringBuilder str1 = new StringBuilder();
			int[] arrB = new int[arr.length];

			for (int i = arr.length; i > 0; i--) {
				arrB[arr.length - i] = arr[i - 1];
			}

			for (int i = 0; i < arrB.length; i++) {
				for (int j = 0; j < i; j++) {
					str1.append((Integer) arrB[j]);
				}
				for (int j = i + 1; j < arrB.length; j++) {
					str1.append((Integer) arrB[j]);
				}
				//System.out.println(str1.toString());
				if (Integer.parseInt(str1.toString()) % 3 == 0) {
					return Integer.parseInt(str1.toString());
				}
				str1 = new StringBuilder();
			}
		}
		return 0;
	}

}
