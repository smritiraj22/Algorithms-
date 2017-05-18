package com.smriti.algorithms.trees;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BSTNodeDistance {
	static Node root;

	public static int bstDistance(int[] values, int n, int node1, int node2) {
		for (int v : values) {
			addNode(v);
		}
		if (search(node1, root) == null || search(node1, root) == null)
			return -1;

		int n1 = nodeHeight(root, node1);
		int n2 = nodeHeight(root, node2);
		Node lca = findLowestCommonAncestor(root, node1, node2);
		int lcaHeight = nodeHeight(root, lca.key);

		return n1 + n2 - 2 * lcaHeight;
	}

	public static int nodeHeight(Node root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.key == n1) || (x = nodeHeight(root.leftChild, n1)) > 0
					|| (x = nodeHeight(root.rightChild, n1)) > 0) {
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	public static void addNode(int key) {
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
		} else {
			Node nodeToBeChecked = root;
			Node parent;
			while (true) {
				parent = root;
				if (key < nodeToBeChecked.key) {
					nodeToBeChecked = nodeToBeChecked.leftChild;
					if (nodeToBeChecked == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					nodeToBeChecked = nodeToBeChecked.rightChild;
					if (nodeToBeChecked == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}

	}

	public static Node findLowestCommonAncestor(Node root, int n1, int n2) {
		if (root != null) {
			if (root.key == n1 || root.key == n2) {
				return root;
			}
			Node left = findLowestCommonAncestor(root.leftChild, n1, n2);
			Node right = findLowestCommonAncestor(root.rightChild, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}

	static int maxDepth(NodeHeight node) {
		int leftHeight = 0;
		int rightHeight = 0;
				
		if (node == null)
			return 0;
		else {
			if (node.left != null)
				leftHeight = 1 + maxDepth(node.left);
			if (node.right != null)
				rightHeight = 1 + maxDepth(node.left);

			return Math.max(leftHeight, rightHeight);

		}
	}

	private static Node search(int key, Node node) {
		if (node != null) {
			if (node.key == key) {
				return node;
			} else {
				Node foundNode = search(key, node.leftChild);
				if (foundNode == null) {
					foundNode = search(key, node.rightChild);
				}
				return foundNode;
			}
		} else {
			return null;
		}
	}

	static class Node {
		int key;

		Node leftChild;
		Node rightChild;

		Node(int key) {
			this.key = key;

		}

	}
}
