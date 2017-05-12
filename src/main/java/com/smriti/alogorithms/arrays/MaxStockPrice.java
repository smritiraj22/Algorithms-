package com.smriti.alogorithms.arrays;

public class MaxStockPrice {

	public static void main(String[] args) {
		

	}

	int maxProfit(int[] prices) {

		int maxPrice = 0;
		int profit = 0;

		for (int i = prices.length - 1; i >= 0; i--) {
			maxPrice = Math.max(maxPrice, prices[i]);
			profit = Math.max(profit, maxPrice - prices[i]);
		}
		return profit;
	}

}
