/**
 *This file is created by Smriti on Aug 25, 2015
 * 
 */
package com.smriti.alogorithms;

/**
 * @author Smriti
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,9,4,61,87,53,76};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<arr.length;j++)
			{	int a=arr[j-1];
				int b=arr[j];			
				if(a>b)
				{	int temp=a;
					arr[j-1]=b;
					arr[j]=temp;
				}
			}
			len=len-1;
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
