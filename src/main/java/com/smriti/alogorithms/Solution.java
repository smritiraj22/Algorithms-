package com.smriti.alogorithms;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int [] A ={1,1,0,1,0,0};
		solution(A);

	}

	 static int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            int count = result;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
           else if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        System.out.println(result+" "+ r);
        return result + r;
    }
}
