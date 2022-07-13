package com.practice;

public class StackImpl {

	public static void main(String[] args) {

		StackII<Character> stack = new StackII<>(5);
		stack.push('a');
		stack.push('d');
		stack.push('c');
		stack.push('b');
		stack.push('b');
		stack.push('b');
		stack.push('b');

		stack.printStack();
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println();
		stack.printStack();
	}
}

class StackII<T> {

	private Object[] arr;
	private int capacity;
	private int top;
	private int size;

	public StackII(int size) {
		arr = new Object[size];
		top = -1;
		capacity = (3 / 2) * size;
	}

	public void push(T data) {

		if (isFull()) {
			return;
		}
		arr[++top] = data;
		size++;
	}

	public Object pop() {
		if (isEmpty()) {
			return -1;
		}
		return arr[top--];
	}

	public Object peek() {
		return arr[top];
	}

	public boolean isFull() {
		return capacity - 1 == top;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
