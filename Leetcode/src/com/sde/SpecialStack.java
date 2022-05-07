package com.sde;

import java.util.Iterator;
import java.util.Stack;

/*
 * Question: Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
 * and an additional operation getMin() which should return minimum element from the SpecialStack. 
 * All these operations of SpecialStack must be O(1). 
 * To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, . etc. */

public class SpecialStack {

	static Stack<Integer> stack = new Stack<>();

	public boolean isFull() {

		if (stack.isEmpty()) {
			return false;
		}
		return true;
	}

	public boolean isEmptyStack() {
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public int myPop() {
		return stack.pop();
	}

	public void myPush(Integer element) {
		stack.push(element);
	}

	public Integer getMin() {

		Integer min = stack.firstElement();
		Iterator<Integer> it = stack.iterator();

		while (it.hasNext()) {

			int otherMin = it.next();
			if (otherMin < min) {
				min = otherMin;
			}
		}
		return min;
	}

	public static void main(String[] args) {

		SpecialStack specialStack = new SpecialStack();
		System.out.println(specialStack.isEmptyStack());

		specialStack.myPush(10);
		specialStack.myPush(20);
		specialStack.myPush(45);
		specialStack.myPush(11);
		System.out.println(specialStack.isFull());
//		System.out.println(specialStack.myPop());
		System.out.println(specialStack.getMin());

	}
}
