package com.smriti.alogorithms.arrays;

public class MoveZerosToFront {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 0, 4, 0, 0, 0, 1, 1, 4, 0 };
		arr = moveZerosToFront(arr);
		for (int a : arr) {
			System.out.println(a);
		}

	}

	public static int[] moveZerosToFront(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		}
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != 0 && arr[j] == 0) {

				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;

				i++;
				j--;
			}
			if (arr[i] == 0) {

				i++;
			}
			if (arr[j] != 0) {

				j--;
			}
		}
		return arr;
	}

}
