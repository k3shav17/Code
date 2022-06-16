package com.dblinked;

public class Node {

	int data;
	Node next = null;

	Node(int data) {
		this.data = data;
	}
}

class MyLinkedList {

	Node head;
	Node tail;

	public void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}


	public void swappedList(Node node) {
		Node temp = node;
		
		while (temp != null) {
			
		}
	}

	public void printList() {

		Node node = head;
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.print("null");
	}
}