package com.smriti.alogorithms.linkedlist;

/**
 * Created by smraj on 4/22/2017.
 */
public class DoublyNode {
	DoublyNode next;
	DoublyNode prev;
	String data;

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DoublyNode(DoublyNode next, DoublyNode prev, String data) {
		super();
		this.next = next;
		this.prev = prev;
		this.data = data;
	}

	public DoublyNode(String data) {
		this.data = data;
	}

}
