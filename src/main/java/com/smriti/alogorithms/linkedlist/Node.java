package com.smriti.alogorithms.linkedlist;

/**
 * Created by smraj on 4/21/2017.
 */
public class Node {

    Node next;
    String data;

    public Node(Node next, String data) {
        this.next = next;
        this.data = data;
    }

    public Node( String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
