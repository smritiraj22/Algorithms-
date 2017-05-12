package com.smriti.alogorithms.linkedlist;

public class LoopDetection {

	public static void main(String[] args) {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		circularSinglyLinkedList.add(new Node("1"));
		circularSinglyLinkedList.add(new Node("2"));
		circularSinglyLinkedList.add(new Node("3"));
		circularSinglyLinkedList.add(new Node("4"));
		circularSinglyLinkedList.add(new Node("5"));
		circularSinglyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		circularSinglyLinkedList.addAtIndex(new Node("Here"), 2);
		System.out.println("---------------------------");
		circularSinglyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		System.out.println(circularSinglyLinkedList.getDataAtIndex(3));
		System.out.println("---------------------------");
		circularSinglyLinkedList.removeFromIndex(4);
		circularSinglyLinkedList.printLinkedList();
		System.out.println("---------------------------");
		circularSinglyLinkedList.addAtStart(new Node("Begin"));
		System.out.println("---------------------------");
		circularSinglyLinkedList.printLinkedList();
		circularSinglyLinkedList.removeLastNode();
		System.out.println("---------------------------");
		circularSinglyLinkedList.printLinkedList();
		detect(circularSinglyLinkedList.getHead());
		System.out.println("---------------------------");

	}

	public static boolean detect(Node node) {
		Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				removeLoop(slow, node);
				return true;
			}
		}
		return false;
	}

	public static void removeLoop(Node slow, Node head) {
		Node temp1 = slow;
		Node temp2 = slow;
		int k = 1, i;
		while (temp1.next != temp2) {
			temp1 = temp1.next;
			k++;
		}
		temp1 = head;

		temp2 = head;
		for (i = 0; i < k; i++) {
			temp2 = temp2.next;
		}

		while (temp2 != temp1) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		temp2 = temp2.next;
		while (temp2.next != temp1) {
			temp2 = temp2.next;
		}

		temp2.next = null;
	}

}
