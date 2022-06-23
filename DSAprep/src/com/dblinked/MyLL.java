package com.dblinked;

public class MyLL {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		list.printList();
		list.delete(3);
		System.out.println();
		list.printList();
		System.out.println();
		list.swappedList(list.head);
		list.printList();
	}
}
