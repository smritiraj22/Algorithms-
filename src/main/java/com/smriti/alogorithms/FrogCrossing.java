package com.smriti.alogorithms;

import java.util.Stack;

public class FrogCrossing {
	public int crossRiver(int X, int[] A) {
		int numberOfSteps = X;
		boolean[] stepTaken = new boolean[numberOfSteps + 1];
		for (int i = 0; i < A.length; i++) {
			if (!stepTaken[A[i]]) {
				stepTaken[A[i]] = true;
				numberOfSteps--;
			}

			if (numberOfSteps == 0)
				return i;
		}
		return -1;
	}

	public int solution(int[] A, int X, int D) {
		if (X < D) {
			return 1;
		} else {
			// let it take x steps initially to cross the river

			int stepCount = 0;
			// initialized with false array and make it take the step every time
			// it encounters the leaf in k time and decrement the steps
			int step = 0;
			for (int i = 0; i < A.length; i++) {

				if (step <= X) {

					step = step + A[i];
					stepCount++;
					System.out.println(step);
					System.out.println("stepCount" + stepCount);
					if (step >= X) {
						return i;

					}

				}

			}
		}

		return -1;

	}

	public static void main(String[] a) {
		FrogCrossing f = new FrogCrossing();
		int[] arr = { 1, 3, 1, 4, 2, 5 };
		f.solution(arr, 7, 3);
		
	}
}
