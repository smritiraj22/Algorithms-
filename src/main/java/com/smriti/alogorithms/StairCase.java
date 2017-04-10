package com.smriti.alogorithms;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 0;

		while (i < n) {
			int k = n-1;
			while (k > i) {
				System.out.print(" ");
				k--;
			}
			int j = 0;
			while (j <= i) {
				System.out.print("#");
				j++;
			}

			System.out.println();
			i++;

		}
	}

}
