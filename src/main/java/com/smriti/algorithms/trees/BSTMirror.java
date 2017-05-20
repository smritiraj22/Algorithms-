package com.smriti.algorithms.trees;

public class BSTMirror {

	class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	Node mirroringBST(Node root){
		if(root == null){
			return root;
		}
		Node left = mirroringBST(root.left);
		Node right = mirroringBST(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}

}
