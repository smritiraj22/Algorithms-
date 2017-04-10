package com.smriti.alogorithms;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int primarySum=0;
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	                if(a_i==a_j){
	                    primarySum=primarySum+a[a_i][a_j];
	                }
	            }
	        }
	        int j=0;
	        int secondarySum=0;
	        for(int a_i=n-1; a_i >=0; a_i--){
	            secondarySum=secondarySum+a[a_i][j];
	            j++;
	    }
	        int diff=Math.abs(primarySum-secondarySum);
	    System.out.println(diff);

	}

}
