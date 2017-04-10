package com.smriti.alogorithms;

public class NodeHeight {

	int data;
	NodeHeight left, right;

	NodeHeight(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTreeHeight {
	NodeHeight root;

	int maxDepth(NodeHeight node) {
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

	public int Diameter(NodeHeight root) {
		if (root != null) {

			int leftH = maxDepth(root.left);
			int rightH = maxDepth(root.right);
			
			System.out.println("leftheight :"+leftH);
			System.out.println("rightheight :"+rightH);

			int leftDiameter = Diameter(root.left);
			int rightDiameter = Diameter(root.right);
			
			System.out.println("leftDiameter :"+leftDiameter);
			System.out.println("rightDiameter :"+rightDiameter);

			return getMax(leftH + rightH + 1, leftDiameter, rightDiameter);
		}
		return 0;
	}

	public int getMax(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	
	public static int currentLevel =0;
	public void rightViewRecur(NodeHeight root, int nextLevel){
		if(root==null) return;
		//System.out.println (" currentLevel " + currentLevel);
		if(currentLevel<nextLevel){
			System.out.println ("  " + root.data);
			currentLevel = nextLevel;
		}
		rightViewRecur(root.right,nextLevel+1);
		rightViewRecur(root.left,nextLevel+1);
	}
	
	
	
	public static int currentleftLevel =0;
	public void leftViewRecur(NodeHeight root, int nextLevel){
		if(root==null) return;
		
		if(currentleftLevel<nextLevel){
			System.out.println ("  " + root.data);
			currentleftLevel = nextLevel;
		}
		rightViewRecur(root.left,nextLevel+1);
		rightViewRecur(root.right,nextLevel+1);
	}
	

	public static void main(String[] args) {
		
		
		BinaryTreeHeight tree = new BinaryTreeHeight();

		tree.root = new NodeHeight(1);
		tree.root.left = new NodeHeight(2);
		tree.root.right = new NodeHeight(3);
		tree.root.left.left = new NodeHeight(4);
		tree.root.left.right = new NodeHeight(5);
		tree.root.left.left.left = new NodeHeight(4);
		tree.root.left.left.right = new NodeHeight(5);
		tree.root.left.right.left = new NodeHeight(4);
		tree.root.left.right.right = new NodeHeight(5);

		//System.out.println("Height of tree is : " + tree.maxDepth(tree.root));

		//System.out.println("Diameter of Tree:" + tree.Diameter(tree.root));
		
		
		tree.rightViewRecur(tree.root,1);
		
		tree.leftViewRecur(tree.root,1);
	}

}
