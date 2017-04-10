package com.smriti.alogorithms;

public class MissingConsectiveNumber {

	public static void main(String args[]){
		int [] arrA = {1,2,3,4,5,7,8,9,10};
		System.out.println("Missing number is :" + missingNumber(arrA,10));
	}

	public static int missingNumber(int[] arrA, int size) {
		int sum = 0;
		int totalSum = 0;
		for (int a : arrA) {
			sum = sum + a;
		}
		for (int i = 1; i <= size; i++) {
			totalSum = totalSum + i;
		}
		return totalSum - sum;
	}

}
