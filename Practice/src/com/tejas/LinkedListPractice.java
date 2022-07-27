package com.tejas;

public class LinkedListPractice {

	public static void main(String[] args) {

		List list = new List();
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		list.printList();
		System.out.println(list.delete(4));
		list.printList();

		list.reverse();
		list.printList();
	}
}

class Node {
	int data;
	Node next = null;

	Node(int data) {
		this.data = data;
	}
}

class List {

	Node head;
	Node tail;

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
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void insert(int data) {

		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public int delete(int data) {

		int value = data;

		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			}

			temp = temp.next;
		}

		return value;
	}
}
