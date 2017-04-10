package com.smriti.alogorithms;

import java.util.Arrays;

public class FindingTwoNumbersInAnArray {

	
	public boolean findTwoNumbersHavingSum(int[] arrA, int number) {
		Arrays.sort(arrA);		
		for(int i =0; i<arrA.length-1;i++){
			int num2 = number -arrA[i];
			int num = binarySearch(arrA,num2);
			if(num==num2)
				return true;		
			
		}
		
		return false;
		
	}
	
	public int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
            	end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
