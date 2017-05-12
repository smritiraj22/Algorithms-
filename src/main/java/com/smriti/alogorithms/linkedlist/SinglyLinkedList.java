package com.smriti.alogorithms.linkedlist;

/**
 * Created by smraj on 4/21/2017.
 */
public class SinglyLinkedList {

	private Node head = null;
	private int listCount = 0;

	public Node getHead() {
		return head;
	}

	public int getListCount() {
		return listCount;
	}

	public SinglyLinkedList() {
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.add(new Node("1"));
		singlyLinkedList.add(new Node("2"));
		singlyLinkedList.add(new Node("3"));
		singlyLinkedList.add(new Node("3"));
		singlyLinkedList.add(new Node("4"));
		/*
		 * singlyLinkedList.add(new Node("3")); singlyLinkedList.add(new
		 * Node("4")); singlyLinkedList.add(new Node("5"));
		 */
		/*
		 * singlyLinkedList.printLinkedList(); singlyLinkedList.addAtIndex(new
		 * Node("Here"), 0); System.out.println("---------------------------");
		 * singlyLinkedList.printLinkedList();
		 * System.out.println("---------------------------");
		 * System.out.println(singlyLinkedList.getDataAtIndex(2));
		 * System.out.println("---------------------------");
		 * singlyLinkedList.removeFromIndex(0);
		 * System.out.println("---------------------------");
		 * singlyLinkedList.printLinkedList();
		 * System.out.println("---------------------------");
		 * singlyLinkedList.addAtStart(new Node("Begin"));
		 * System.out.println("---------------------------");
		 * singlyLinkedList.printLinkedList();
		 */
		System.out.println("---------------------------");
		singlyLinkedList.printLinkedList();
		singlyLinkedList.removeFromIndex(2);
		System.out.println("---------------------------");
		singlyLinkedList.removeDuplicates();
		System.out.println("---------------------------");
		singlyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		singlyLinkedList.reverse();
		singlyLinkedList.printLinkedList();
	}

	public void add(Node node) {
		Node curr = head;
		if (head == null) {
			head = node;
			head.setNext(null);
			this.listCount++;
			return;
		}
		while (curr.getNext() != null) {
			// System.out.println(node.getData());
			curr = curr.getNext();
		}
		curr.setNext(node);
		this.listCount++;
	}

	public void addAtStart(Node node) {
		Node curr = head;
		node.setNext(curr);
		head = node;
		this.listCount++;
	}

	public void addAtIndex(Node node, int index) {
		if (index > listCount || index < 0) {
			throw new RuntimeException("index larger than list size");
		}
		if (index == 0) {
			addAtStart(node);
			return;
		}
		int count = 0;
		Node curr = head;
		Node prev = head;
		while (count < index && curr != null) {
			prev = curr;
			curr = curr.getNext();
			count++;
		}
		prev.setNext(node);
		node.setNext(curr);
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
		Node curr = head;
		while (count < index) {
			curr = curr.getNext();
			count++;
		}
		return curr.getData();
	}

	public void removeFromStart() {
		Node temp = head;
		head = head.getNext();
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
		int count = 0;
		Node curr = head;
		Node previous = head;
		while (count < index) {
			previous = curr;
			curr = curr.getNext();
			count++;
		}
		previous.setNext(curr.getNext());
		this.listCount--;
		curr = null;
	}

	public void printLinkedList() {
		Node curr = head;
		for (int i = 0; i < listCount; i++) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	Node removeDuplicates() {
		if (head == null || head.next == null)
			return head;

		Node prev = head;
		Node curr = head.next;

		while (prev != null && curr != null) {
			if (prev.data == curr.data) {
				curr = curr.next;
				prev.next = curr;
				listCount--;
			} else {
				curr = curr.next;
				prev = prev.next;
			}
		}
		return head;
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = head;
		while (next != null) {
			next = next.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public Node reverseRecursive(Node root) {
		if (root == null) {
			return root;
		}
		Node next = root.next;
		root.next = null;
		Node recNode = reverseRecursive(next);
		next.next = root;
		return recNode;
	}

	public boolean isPalindrome(Node root) {
		if (head == null || head.next == null)
			return true;

		Node fast = head;
		Node slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		Node midHead = reverseRecursive(slow);
		Node curr = head;
		Node revCurr = midHead;
		while (curr != midHead && revCurr != midHead) {
			if (curr.data == revCurr.data) {
				curr = curr.next;
				revCurr = revCurr.next;
			} else {
				return false;
			}
		}
		return true;
	}

}
