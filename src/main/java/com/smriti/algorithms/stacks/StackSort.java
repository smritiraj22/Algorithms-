package com.smriti.algorithms.stacks;

import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<Integer> s2 = new Stack<Integer>();
		s2.push(1);
		s2.push(3);
		s2.push(4);
		s2.push(2);
		s2.push(5);
		s2.push(9);
		s2.push(7);
		Stack<Integer> s1 = stackSort(s2);

		while (!s1.isEmpty()) {
			System.out.println(s1.pop());
		}

	}

	public static Stack<Integer> stackSort(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();
		while (s1.size() > 0) {
			int next = s1.pop();
			while (s2.size() > 0) {
				int sorted = s2.pop();
				if (sorted < next)
					s1.push(sorted);
			}
			s2.push(next);
		}
		return s1;
	}

}
