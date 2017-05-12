package com.smriti.alogorithms.arrays;

public class LowerSpaceUpper {

	public static void main(String[] args) {
		String output = lowerSpaceUpper("a cBd LkmY");

		System.out.println(output); 

	}

	public static String lowerSpaceUpper(String str) {
		StringBuilder lower = new StringBuilder();
		StringBuilder space = new StringBuilder();
		StringBuilder upper = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				lower.append(str.charAt(i));
			}
			if (Character.isUpperCase(str.charAt(i))) {
				upper.append(str.charAt(i));
			}
			if (str.charAt(i) == ' ') {
				space.append(str.charAt(i));
			}
		}
		space.append(upper.toString());
		return lower.append(space.toString()).toString();
	}

}
