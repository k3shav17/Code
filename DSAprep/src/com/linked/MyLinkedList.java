package com.linked;

public class MyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public MyLinkedList() {
		this.size = 0;
	}

	private class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	public void insertFirst(int val) {

		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insert(int val, int index) {

		if (index == 0) {
			insertFirst(val);
		}
		if (index == size - 1) {
			insertLast(val);
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}

	public void insertLast(int val) {

		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;

		size++;
	}

	public int deleteFirst() {

		int val = head.value;
		head = head.next;

		if (head == null) {
			tail.next = null;
		}
		size--;
		return val;
	}

	public int deleteLast() {

		if (size <= 1) {
			return tail.value;
		}

		Node secondLast = get(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;

		return val;
	}

	public int deleteAt(int index) {

		if (index == 0) {
			return deleteFirst();
		}

		if (index == size - 1) {
			return deleteLast();
		}

		Node prev = get(index - 1);
		int val = prev.next.value;
		prev.next = prev.next.next;

		return val;
	}

	public Node get(int index) {

		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

//	public Node find(int value) {
//
//		Node node = head;
//
//		while (node != null) {
//			if (node.value == value)
//				return node;
//
//			node = node.next;
//		}
//		return null;
//	}
//

	public int find(int value) {
		Node node = head;
		int index = 0;
		while (node != null) {
			if (node.value == value) {
				break;
			}
			node = node.next;
			index++;
		}
		return index;
	}

	public Node reverse() {

		Node prev = null;
		Node current = head;
		Node next = null;
		
		while (current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
}
