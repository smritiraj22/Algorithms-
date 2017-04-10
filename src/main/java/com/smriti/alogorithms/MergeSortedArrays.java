package com.smriti.alogorithms;

public class MergeSortedArrays {

	public static void main(String[] args) {

		int[] a = { 1, 4, 6, 9 };
		int[] b = { 3, 7, 11, 18 };
		int arr[] = merge(a, b);
		for(int num:arr){
			System.out.println(num);
		}

	}

	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length){
			System.out.println(a[i]+"----");
			System.out.println(b[j]+"++++");
			answer[k++] = a[i] < b[j] ? a[i++] : b[j++];
			
		}

		while (i < a.length)
			answer[k++] = a[i++];

		while (j < b.length)
			answer[k++] = b[j++];

		return answer;
	}

}
