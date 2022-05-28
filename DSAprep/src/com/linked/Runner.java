package com.linked;

public class Runner {

	public static void main(String[] args) {

		MyLinkedList myLl = new MyLinkedList();
		myLl.insertFirst(2);
		myLl.insertFirst(6);
		myLl.insertFirst(3);
		myLl.insertLast(9);
//		myLl.insert(14, 2);
//		myLl.printList();
//		System.out.println();
//		myLl.deleteAt(2);
//		myLl.printList();
//		System.out.println();
//		System.out.println(myLl.deleteFirst());
//		myLl.printList();
//		System.out.println();
//		myLl.deleteLast();
//		myLl.printList();
//		System.out.println();
//		System.out.println(myLl.find(2));
		myLl.printList();
		System.out.println();
		myLl.reverse();
		myLl.printList();
		
	}
}
