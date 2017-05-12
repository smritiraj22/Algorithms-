package com.smriti.alogorithms;

public class ArrayDivisionWithSameSum {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6,21};
		int [] arr2 = {1,90, 50, 30, 5, 3, 2, 1 };
		int [] arr3 = {1, 50, 900, 1000 };
		
		checkSplit(arr1);
		checkSplit(arr2);
		checkSplit(arr3);		

	}

	private static void checkSplit(int[] arr) {
		int startSum = 0;
		int endSum = 0;
		int index = 0;
		int lastIndex = arr.length - 1;
		while (index <= lastIndex) {
			if (startSum < endSum)
				startSum += arr[index++];
			else
				endSum += arr[lastIndex--];
		}
		if (startSum == endSum) {
			System.out.println(startSum + " index " + index);

		} else
			System.out.println("Not possible");

	}

}
