package com.smriti.alogorithms;

public class TestingBloomberg {

	public static void main(String[] args) {
		String st1 = "this is a String";
		String st2 = "this aa ab cc";
		String[] a = st1.split(" ");
		String[] b = st2.split(" ");
		commonSubstring(a, b);

	}

	static void commonSubstring(String[] a, String[] b) {

		int len = a.length;

		outer:for (int i = 0; i < len; i++) {

			String fromA = a[i];
			String fromB = b[i];

			int lenA = fromA.length();
			int lenB = fromB.length();

			if (lenA >= lenB) {
				for (int j = 0; j < lenB; j++) {
					if (fromA.indexOf(fromB.charAt(j)) == 0) {
						System.out.println("Yes");
						continue outer;
					}
				}
				System.out.println("No");
			} else {
				 for (int j = 0; j < lenA; j++) {
					if (fromB.indexOf(fromA.charAt(j)) == 0) {
						System.out.println("Yes");
						continue outer;
					}
				}
				System.out.println("No");
			}

		}
	}

}
