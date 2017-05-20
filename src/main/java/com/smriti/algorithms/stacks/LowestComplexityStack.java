package com.smriti.algorithms.stacks;

public class LowestComplexityStack {

	private class Node {
		int value;
		int minValue;
		Node next;
	}

	Node head;

	public void push(int val) {
		Node node = new Node();
		node.value = val;
		if (val > head.minValue)
			head.minValue = val;

		if (head == null)
			head = node;
		else {
			if (node.value < head.minValue)
				node.minValue = head.minValue;
			else
				node.minValue = val;
			node.next = head;
			head = node;
		}
	}

	public int pop() {
		if (head == null)
			return -1;

		Node temp = head;
		head = head.next;
		return temp.value;
	}
	
	public int max(){
		return head.minValue;
	}

}
