package com.smriti.algorithms.dynamicprogramming;

import java.util.Arrays;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] mem = new int[m][n];
        for(int[] arr: mem){
            Arrays.fill(arr, -1);
        }
        return calDistance(word1, word2, mem, m-1, n-1);
    }

    private int calDistance(String word1, String word2, int[][] mem, int i, int j){
        if(i<0){
            return j+1;
        }else if(j<0){
            return i+1;
        }

        if(mem[i][j]!=-1){
            return mem[i][j];
        }

        if(word1.charAt(i)==word2.charAt(j)){
            mem[i][j]=calDistance(word1, word2, mem, i-1, j-1);
        }else{
            int prevMin = Math.min(calDistance(word1, word2, mem, i, j-1), calDistance(word1, word2, mem, i-1, j));
            prevMin = Math.min(prevMin, calDistance(word1, word2, mem, i-1, j-1));
            mem[i][j]=1+prevMin;
        }

        return mem[i][j];
    }

    public static int minDistanceItr(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        // len1+1, len2+1, because finally return dp[len1][len2]
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }

        //iterate though, and check last char
        for (int i = 0; i < len1; i++) {
            char c1 = word1.charAt(i);
            for (int j = 0; j < len2; j++) {
                char c2 = word2.charAt(j);

                //if last two chars equal
                if (c1 == c2) {
                    //update dp value for +1 length
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    int replace = dp[i][j] + 1;
                    int insert = dp[i][j + 1] + 1;
                    int delete = dp[i + 1][j] + 1;

                    int min = replace > insert ? insert : replace;
                    min = delete > min ? min : delete;
                    dp[i + 1][j + 1] = min;
                }
            }
        }

        return dp[len1][len2];
    }

}
