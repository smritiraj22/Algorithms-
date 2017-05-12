package com.smriti.alogorithms.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(-6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		deleteNum(nums);

	}

	public static void deleteNum(List<Integer> nums) {
		Iterator<Integer> itr = nums.listIterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 != 0) {
				itr.remove();
			}
		}

		for (Integer s : nums) {
			System.out.println(s);
		}
	}

	public int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);
	}

	public int singleNumber(final List<Integer> a) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int num = 0;
		for (int i = 0; i < a.size(); i++) {
			if (!m.containsKey(a.get(i))) {
				m.put(a.get(i), 1);
			} else {
				int count = m.get(a.get(i));
				m.put(a.get(i), ++count);
			}

		}
		for (int key : m.keySet()) {
			if (m.get(key) == 1) {
				num = key;
			}
		}

		return num;
	}

	private static long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private static long gcd(long[] input) {
		long result = input[0];
		for (int i = 1; i < input.length; i++)
			result = gcd(result, input[i]);
		return result;
	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input) {
		long result = input[0];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}
}