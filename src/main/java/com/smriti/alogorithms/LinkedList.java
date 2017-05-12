package com.smriti.alogorithms;

//Java program for reversing the linked list

class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	
	public static Node reverseListRecursive(Node head) {
	    if(head==null || head.next == null)
	        return head;
	 
	    //get second node    
	    Node second = head.next;
	    //set first's next to be null
	    head.next = null;
	 
	    Node rest = reverseListRecursive(second);
	    second.next = head;
	 
	    return rest;
	}
	
	public static void printCharBackward(Node node) {
	    if(node == null) {
	      return;
	    }
	    int length = getLinkedListLength(node);
	    for(int i = length - 1; i >= 0; i--) {
	      int index = 0;
	      Node tmp = node;
	      while(index != i) {
	        tmp = tmp.next;
	        index++;
	      }
	      System.out.print(tmp.data+" ");
	    }
	  }

	  private static int getLinkedListLength(Node node) {
	    int length = 0;
	    Node tmp = node;
	    while(tmp != null) {
	      length++;
	      tmp = tmp.next;
	    }
	    return length;
	  }

	  ///////////////// Question 4
	  public static void printCharacterIterative(Node node) {
	    Node prev = null;
	    Node tmp = node;
	    // Reverse the list in (N)
	    while(tmp != null) {
	      Node next = tmp.next;
	      tmp.next = prev;
	      prev = tmp;
	      tmp = next;
	    }
	    // Print it O(N)
	   tmp = prev;
	    while(tmp != null) {
	      System.out.print(tmp.data+" ");
	      tmp = tmp.next;
	    }
	  }

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
		head = reverseListRecursive(head);
		System.out.println("Reversed linked list ");
		list.printList(head);
		printCharBackward(head);
		printCharacterIterative(head);
		
	}
}