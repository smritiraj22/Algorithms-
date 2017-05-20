package com.smriti.algorithms.trees;

public class HuffManDecoding {

	class Node {
		public int frequency;
		public char data;
		public Node left, right;
	}

	void decode(String S, Node root) {
		Node head = root;
		int len = S.length();

		for (int i = 0; i < len; i++) {
			if (S.charAt(i) == '0' && root != null) {
				root = root.left;
				if (root.left == null && root.right == null) {
					System.out.print(root.data);
					root = head;
				}

			} else if (S.charAt(i) == '1' && root != null) {
				root = root.right;
				if (root.left == null && root.right == null) {
					System.out.print(root.data);
					root = head;
				}

			}
		}
	}
}
