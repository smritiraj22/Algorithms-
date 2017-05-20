package com.smriti.alogorithms;

import java.util.Scanner;

public class LeftRotationArray {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);       
        int t = in.nextInt();
        int order = in.nextInt();
      
        int [] arr = new int[t];
        
          for(int a0 = 0; a0 < t; a0++){
            arr[a0] = in.nextInt();
          }
        
        if (arr == null || arr.length==0 || order < 0) {
		throw new IllegalArgumentException("Illegal argument!");
	}
 
	if(order > arr.length){
		throw new IllegalArgumentException("Illegal argument!");
	}
 
	reverse(arr, 0, order-1);
	reverse(arr, order, arr.length-1);
	reverse(arr, 0, arr.length-1);
 
    for(int var:arr){
        System.out.print(var + " ");
    }
        
}
 
public static void reverse(int[] arr, int left, int right){
	if(arr == null || arr.length == 1) 
		return;
 
	while(left < right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}	
        
    }
}
