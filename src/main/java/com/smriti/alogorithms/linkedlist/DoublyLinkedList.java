package com.smriti.alogorithms.linkedlist;

public class DoublyLinkedList {

	private DoublyNode head = null;
	private int listCount = 0;

	public DoublyLinkedList() {
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add(("1"));
		doublyLinkedList.add(("2"));
		doublyLinkedList.add(("3"));
		doublyLinkedList.add(("4"));
		doublyLinkedList.add(("5"));
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtStart(new DoublyNode("Here"));
		doublyLinkedList.addNodeAtEndIndex(new DoublyNode("Here"));
		System.out.println("---------------------------");
		doublyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		System.out.println(doublyLinkedList.getDataAtIndex(2));
		System.out.println("---------------------------");
		doublyLinkedList.removeFromIndex(1);
		System.out.println("---------------------------");
		doublyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		doublyLinkedList.addAtStart(new DoublyNode("Begin"));
		System.out.println("---------------------------");
		doublyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		doublyLinkedList.removeLastNode();
		doublyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		doublyLinkedList.reverse();
		doublyLinkedList.printLinkedList();
	}

	public void add(String data) {
		DoublyNode curr = head;
		if (head == null) {
			head = new DoublyNode(data);
			head.setNext(null);
			head.setPrev(null);
			this.listCount++;
			return;
		}
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		DoublyNode node = new DoublyNode(data);
		curr.setNext(node);
		node.setPrev(curr);
		node.setNext(null);

		this.listCount++;
	}

	public void addAtStart(DoublyNode node) {
		DoublyNode curr = head;
		head = node;
		head.setNext(curr);
		curr.setPrev(head);
		head.setPrev(null);
		this.listCount++;
	}

	public void addAtIndex(String data, int index) {
		if (index > listCount || index < 0) {
			throw new RuntimeException("index larger than list size");
		}
		if (index == 0) {
			addAtStart(new DoublyNode(data));
			return;
		}
		if (index == this.listCount) {
			addNodeAtEndIndex(new DoublyNode(data));
			return;
		}
		int count = 0;
		DoublyNode curr = head;
		DoublyNode prev = head;
		while (count < index && curr != null) {
			prev = curr;
			curr = curr.getNext();
			count++;
		}
		DoublyNode node = new DoublyNode(data);
		prev.setNext(node);
		node.setPrev(prev);
		node.setNext(curr);
		this.listCount++;
	}

	public void addNodeAtEndIndex(DoublyNode node) {
		int count = 0;
		DoublyNode curr = head;
		DoublyNode prev = head;
		DoublyNode next = null;
		while (count < this.listCount && curr != null) {
			prev = curr;
			curr = curr.getNext();
			count++;
		}
		prev.setNext(node);
		node.setPrev(prev);
		node.setNext(null);
		this.listCount++;
	}

	public String getDataAtIndex(int index) {
		if (index > listCount || index < 0) {
			throw new RuntimeException("index larger than list size");
		}
		if (index == 0) {
			return head.getData();
		}
		int count = 0;
		DoublyNode curr = head;
		while (count < index) {
			curr = curr.getNext();
			count++;
		}
		return curr.getData();
	}

	public void removeFromStart() {
		DoublyNode temp = head;
		head = head.getNext();
		head.setPrev(null);
		temp = null;
		this.listCount--;
	}

	public void removeFromIndex(int index) {
		if (index > listCount || index < 0) {
			throw new RuntimeException("index larger than list size");
		}
		if (index == 0) {
			removeFromStart();
			return;
		}
		if (index == this.listCount - 1) {
			removeLastNode();
			return;
		}
		int count = 0;
		DoublyNode curr = head;
		while (count < index) {
			curr = curr.getNext();
			count++;
		}
		curr.getPrev().setNext(curr.getNext());
		this.listCount--;
		curr = null;
	}

	public void removeLastNode() {
		int count = 0;
		DoublyNode curr = head;
		DoublyNode previous = head;
		while (count < this.listCount) {
			previous = curr;
			curr = curr.getNext();
			count++;
		}
		curr = null;
		previous.setNext(null);
		this.listCount--;

	}

	public void printLinkedList() {
		DoublyNode curr = head;
		for (int i = 0; i < listCount; i++) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public void reverse() {
		DoublyNode temp = null;
		DoublyNode current = head;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
			//System.out.println(current.data);
		}
		if (temp != null) {
			head = temp.prev;
		}
		
	}
	
	
}
