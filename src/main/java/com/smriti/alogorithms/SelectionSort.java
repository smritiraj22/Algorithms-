/**
 *This file is created by Smriti on Aug 25, 2015*/
package com.smriti.alogorithms;

public class SelectionSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,9,4,61,87,53,76};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]>arr[j])
				{	int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
