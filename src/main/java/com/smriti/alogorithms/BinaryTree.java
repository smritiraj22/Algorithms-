package com.smriti.alogorithms;

public class BinaryTree {
	Node root;
	
	public void addNode(int key,String name){
		Node newNode=new Node(key, name);
		if(root==null){
			root=newNode;
		}
		else
		{
			Node nodeToBeChecked=root;
			Node parent;
			while(true){
				parent=root;
				if(key<nodeToBeChecked.key){
					nodeToBeChecked=nodeToBeChecked.leftChild;
					if(nodeToBeChecked==null){
						parent.leftChild=newNode;
						return;
					}
				}else{
					nodeToBeChecked=nodeToBeChecked.rightChild;
					if(nodeToBeChecked==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
		
	}
	
	
}
class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key,String name){
		this.key=key;
		this.name=name;
	}
}