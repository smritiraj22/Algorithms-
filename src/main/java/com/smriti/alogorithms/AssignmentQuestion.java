package com.smriti.alogorithms;

import java.lang.Math;

public class AssignmentQuestion {
	public static void main(String a[]) {
		int n = 1;
		double poly = 200 * Math.pow(n, 2);
		double exp = Math.pow(1.5, n);
		while (poly > exp) {
			n++;
		}
		System.out.println(n + " poly " + poly + " exp " + exp);
	}
}
