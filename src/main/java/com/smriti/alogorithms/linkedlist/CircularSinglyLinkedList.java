package com.smriti.alogorithms.linkedlist;

/**
 * Created by smraj on 4/21/2017.
 */
public class CircularSinglyLinkedList {

    private Node head = null;
    private Node tail = null;
    private int listCount = 0;

    public CircularSinglyLinkedList() {
    }

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
    }

    public void add(Node node) {
        Node curr = head;
        if (head == null) {
            head = node;
            tail = head;
            tail.setNext(head);
            this.listCount++;
            return;
        }
        while (curr.getNext() != head) {
            //System.out.println(node.getData());
            curr = curr.getNext();
        }
        curr.setNext(node);
        tail = node;
        this.listCount++;
        tail.setNext(head);
    }

    public void addAtStart(Node node) {
        Node curr = head;
        node.setNext(curr);
        head = node;
        tail.setNext(head);
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
        if (index == this.listCount) {
            addNodeAtEndIndex(node);
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

    public void addNodeAtEndIndex(Node node) {
        int count = 0;
        Node curr = head;
        Node prev = head;
        while (count < this.listCount && curr != null) {
            prev = curr;
            curr = curr.getNext();
            count++;
        }
        prev.setNext(node);
        tail = node;
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
        tail.setNext(head);
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
        Node nextNode = head;
        int count = 0;
        Node curr = null;
        Node previous = null;
        while (count < index) {
            previous = curr;
            curr = nextNode.getNext();
            count++;
        }
        previous.setNext(curr.getNext());
        this.listCount--;
        curr = null;
    }

    public void removeLastNode() {

        int count = 0;
        Node curr = head;
        Node previous = head;
        while (count < this.listCount) {
            previous = curr;
            curr = curr.getNext();
            count++;
        }
        curr = null;
        previous.setNext(null);
        tail = previous;
        tail.setNext(head);
        this.listCount--;

    }

    public void printLinkedList() {
        Node curr = head;
        for (int i = 0; i < listCount; i++) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

}