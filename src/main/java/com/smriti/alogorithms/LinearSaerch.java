/**
 *This file is created by Smriti on Aug 25, 2015*/
package com.smriti.alogorithms;

public class LinearSaerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,9,4,61,87,53,76};
		int a=87;
		boolean found = false;
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i]){
				found=true;
				System.out.println("Element found at "+i);
			}
		}
		if(!found)
		{
		System.out.println("Element not found");
		}
	}

}
