package com.smriti.alogorithms.arrays;

public class ProductExceptIndex {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		productExceptIndex(array);

	}
	
	static void productExceptIndex(int []array){
		int allMultiplication = 1;
        for (int i = 0; i < array.length; i++) {
            allMultiplication = allMultiplication * array[i];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = allMultiplication / array[i];
        }

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
	}

}
