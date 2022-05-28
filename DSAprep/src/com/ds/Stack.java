package com.ds;

/* A Stack is a linear data structure that follows the principle of
 * Last In First Out(LIFO). 
 * This means the last element inserted inside the stack is removed first.
 * 
 * Eg: Pile of files, books, plates etc.
 */
public class Stack {

	private int arr[];
	private int top;
	private int capacity;

	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack overflow");
			System.exit(1);
		}
		arr[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}

	public int size() {
		return top + 1;
	}

	public Boolean isFull() {
		return top == capacity - 1;
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack.isEmpty());

		System.out.println(stack.isFull());
		
		stack.printStack();

		System.out.println(stack.pop());

		stack.printStack();
	}
}
