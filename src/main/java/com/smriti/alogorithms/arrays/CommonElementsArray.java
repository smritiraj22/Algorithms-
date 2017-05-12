package com.smriti.alogorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsArray {

	public static void main(String[] args) {
		int[][] a = { { 10, 160, 200, 500, 500 }, { 4, 150, 160, 200, 500 }, { 2, 160, 200, 202, 203 },
				{ 3, 150, 155, 160, 200 }, { 3, 160, 155, 200, 301 } };

		System.out.println(firstCommonElement(a));
		

	}

	static int firstCommonElement(int[][] arr) {

		int[] a1 = arr[0];
		int high = a1.length;
		Map<Integer, Integer> mapCommonNum = new HashMap<Integer, Integer>();
		for (int i = 0; i < high; i++) {
			mapCommonNum.put(a1[i], 1);
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (binarySearch(a1, arr[i][j], high - 1, 0) != -1 && mapCommonNum.get(arr[i][j])==i) {
					int n = mapCommonNum.get(arr[i][j]) + 1;
					mapCommonNum.put(arr[i][j], n);
				
				}
			}
		}

		for (int key : mapCommonNum.keySet()) {
			if (mapCommonNum.get(key) == arr.length ) {
				System.out.println(key+" "+mapCommonNum.get(key));
				return key;
			}
		}
		return 0;

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

}
