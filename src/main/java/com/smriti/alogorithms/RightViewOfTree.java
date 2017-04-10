package com.smriti.alogorithms;

public class RightViewOfTree {
	public static int currentLevel = 0;

	public void rightViewRecur(Nodes root, int nextLevel) {
		if (root == null)
			return;
		System.out.println(currentLevel +" curr "+nextLevel+" next ");
		if (currentLevel < nextLevel) {
			System.out.print("  " + root.data);
			currentLevel = nextLevel;
		}
		rightViewRecur(root.right, nextLevel + 1);
		System.out.println(root.data+" smriti");
		rightViewRecur(root.left, nextLevel + 1);
	}

	public static void main(String[] args) throws java.lang.Exception {
		Nodes root = new Nodes(5);
		root.left = new Nodes(10);
		root.right = new Nodes(15);
		root.left.left = new Nodes(20);
		root.left.right = new Nodes(25);
		root.right.left = new Nodes(30);
		root.right.right = new Nodes(35);
		root.left.right.right = new Nodes(45);

		RightViewOfTree i = new RightViewOfTree();
		i.rightViewRecur(root, 1);
	}
}

class Nodes {
	int data;
	Nodes left;
	Nodes right;

	public Nodes(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
