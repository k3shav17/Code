package com.fcc.bt;

import java.util.Stack;

public class TreeIncludes<T> {

	public static void main(String[] args) {

		Node2 a = new Node2('a');
		Node2 b = new Node2('b');
		Node2 c = new Node2('c');
		Node2 d = new Node2('d');
		Node2 e = new Node2('e');
		Node2 f = new Node2('f');

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;

		TreeIncludes ti = new TreeIncludes();
//		System.out.println(ti.isBranch(a, 'e'));
		System.out.println(ti.isBranchRecursive(a, 'e'));

	}

	public boolean isBranch(Node2<T> root, T target) {

		if (root == null) {
			return false;
		}

		Stack<Node2<T>> branches = new Stack<>();
		branches.push(root);

		while (branches.size() > 0) {

			Node2<T> current = branches.pop();
			if (current.value == target) {
				return true;
			}

			if (current.left != null) {
				branches.push(current.left);
			}
			if (current.right != null) {
				branches.push(current.right);
			}
		}
		return false;
	}

	public boolean isBranchRecursive(Node2<T> root, T target) {

		if (root == null)
			return false;
		if (root.value == target)
			return true;
		return isBranchRecursive(root.left, target) || isBranchRecursive(root.right, target);
	}
}

class Node2<T> {

	T value;
	Node2<T> left;
	Node2<T> right;

	public Node2(T value) {
		this.value = value;
	}
}
