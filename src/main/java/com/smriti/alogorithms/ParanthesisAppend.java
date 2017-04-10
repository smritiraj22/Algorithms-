package com.smriti.alogorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParanthesisAppend {

	private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
	private static final Map<Character, Character> oppositebrackets = new HashMap<Character, Character>();
	static {
		brackets.put('[', ']');
		brackets.put('{', '}');
		brackets.put('(', ')');

		oppositebrackets.put(']', '[');
		oppositebrackets.put('}', '{');
		oppositebrackets.put(')', '(');
	}

	public static String isBalanced(String str) {
		if (str.length() == 0) {
			throw new IllegalArgumentException("String length should be greater than 0");
		}
		
		final Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (brackets.containsKey(str.charAt(i))) {
				stack.push(str.charAt(i));
				sb.append(str.charAt(i));
			} else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
				if (i == 0) {
					if (sb.toString().indexOf(oppositebrackets.get(str.charAt(i))) == -1)
						sb.insert(0, oppositebrackets.get(str.charAt(i)));
					sb.append(str.charAt(i));
				} else {
					if (sb.toString().indexOf(oppositebrackets.get(str.charAt(i))) == -1)
						sb.append(oppositebrackets.get(str.charAt(i)));
					sb.append(str.charAt(i));
				}
			} else {
				sb.append(str.charAt(i));
			}
		}
		for (char c : stack) {
			sb.append(brackets.get(c));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("{([])"));
		System.out.println(isBalanced("([}])"));
		System.out.println(isBalanced("([])"));
		System.out.println(isBalanced("()[]{}[][]"));
		System.out.println(isBalanced("[}])"));
	}
}
