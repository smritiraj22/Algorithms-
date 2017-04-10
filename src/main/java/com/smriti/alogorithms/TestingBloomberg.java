package com.smriti.alogorithms;

import java.util.Arrays;
import java.util.List;

public class TestingBloomberg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  static void commonSubstring(String[] a, String[] b) {

		  int len = a.length;
	        for(int i =0; i <len; i++){
	            String fromA = a[i];
	            String fromB = b[i];
	            List stringSetA = Arrays.asList(fromA.toCharArray());
	            List stringSetB = Arrays.asList(fromB.toCharArray());
	            int lenA = stringSetA.size();
	            int lenB = stringSetB.size();
	            if(lenA>lenB){
	                innerA: for(int j=0; j<lenB;j++){
	                    if(stringSetA.contains(stringSetB.get(i))){
	                        System.out.print("Yes");
	                        break innerA;
	                    }
	                }
	                 System.out.print("No");
	            }
	            else{
	                 innerB: for(int j=0; j<lenA;j++){
	                    if(stringSetB.contains(stringSetA.get(i))){
	                        System.out.print("Yes");
	                        break innerB;
	                    }
	                }
	                System.out.print("Yes");
	            }
	            
	        }
	    }

	  

}
