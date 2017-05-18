package com.smriti.algorithms.trees;

public class BinaryTree {
	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
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

	public Node findLowestCommonAncestor(Node root, int n1, int n2) {
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
	
	public int Pathlength(Node root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.key == n1) || (x = Pathlength(root.leftChild, n1)) > 0
					|| (x = Pathlength(root.rightChild, n1)) > 0) {
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	class Node {
		int key;
		String name;

		Node leftChild;
		Node rightChild;

		Node(int key, String name) {
			this.key = key;
			this.name = name;
		}
	}

}