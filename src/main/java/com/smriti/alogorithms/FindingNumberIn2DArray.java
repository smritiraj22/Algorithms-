package com.smriti.alogorithms;

public class FindingNumberIn2DArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 },
				{ 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
		int number1 = 15;
		int number2 = 5;
		int number3 = 19;
		int number4 = 25;
		
		System.out.println("The " + number1 + " present in 2D array a ??? :"
				+ findElement(a, number1));
		System.out.println("The " + number2 + " present in 2D array a ??? :"
				+ findElement(a, number2));
		System.out.println("The " + number3 + " present in 2D array a ??? :"
				+ findElement(a, number3));
		System.out.println("The " + number4 + " present in 2D array a ??? :"
				+ findElement(a, number4));

	}
	public static Boolean findElement(int[][] arrA, int number) {
		int row = 0;
		int col = arrA[1].length - 1;
		boolean numFound = false;
		
		while(numFound!=false){
			int ele = arrA[row][col];
			System.out.print(ele + "->");
			if (ele == number) {
				return true;
			} else if (ele > number)
				col--;
			else if (ele < number)
				row++;
			if (row > arrA[0].length - 1 || col < 0)
				return false;
		}
		return false;
	}

}
