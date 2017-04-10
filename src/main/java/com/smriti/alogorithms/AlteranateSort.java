package com.smriti.alogorithms;

public class AlteranateSort {
	public static void main(String[] args) {
	      int[] arr = {2,3,4,5,1,9,8};
	      sortAlternate(arr);
	    }
	    
	    public static void sortAlternate(int[] arr){
	      boolean flag = true;
	      for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	          if(flag){
	          if(arr[j] > arr[i])
	            swap(arr,j,i);
	          	for(int a:arr){
	          		System.out.print(a);
	          		
	          	}
	          	System.out.print("---");
	          }
	          else{
	            if(arr[j] < arr[i])
	            swap(arr,j,i);
	            for(int a:arr){
	          		System.out.print(a);
	          		
	          	}
	            System.out.print("****");
	          }
	        }
	        flag = !flag;
	      }
	    }
	    
	    public static void swap(int[] arr, int j , int i){
	      int temp = arr[j];
	      arr[j] = arr[i];
	      arr[i] = temp;
	    }
}
