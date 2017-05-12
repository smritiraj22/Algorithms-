package com.smriti.alogorithms.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PairsofNum {

	public static void main(String[] args) {
		int[] A = { 2, 3,  4,1 };
		int sumNum = 9;
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for (int i : A) {
		pairs.put(i, sumNum-i);
		
		}
		int count = 0;
		for(int key:pairs.keySet()){
			if(pairs.containsKey(sumNum-key)){
				
				count++;
			}
		}
		System.out.println(count/2);

	}

}
