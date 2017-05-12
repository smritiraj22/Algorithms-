package com.smriti.alogorithms.arrays;

public class PivotSelection {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 0, 6 };
		System.out.println(findPivot(arr));

	}

	public static int findPivot(int[] arr) {
		int sumleft = 0;
		int sumRight = 0;
		for (int i = 0; i < arr.length; i++) {
			sumRight = sumRight + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			sumRight = sumRight - arr[i];
			
			if (sumRight == sumleft) {
				return i;
			}
			sumleft = sumleft + arr[i];
		}

		return -1;

	}

}
