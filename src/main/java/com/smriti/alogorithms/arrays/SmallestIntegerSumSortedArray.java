package com.smriti.alogorithms.arrays;

public class SmallestIntegerSumSortedArray {
	public int find(int[] arrA) {
		int smlNumber = 1;
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] <= smlNumber) {
				smlNumber += arrA[i];
			} else {
				break;
			}
		}
		return smlNumber;
	}
}
