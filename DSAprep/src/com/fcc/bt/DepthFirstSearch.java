package com.fcc.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

	public List<Character> dfsImpl(Node root) {

		List<Character> result = new ArrayList<>();

		if (root == null) {
			return result;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (stack.size() > 0) {

			Node current = stack.pop();
			result.add(current.val);

			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
		}
		return result;
	}

	public static void main(String[] args) {

		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;

		DepthFirstSearch dfs = new DepthFirstSearch();
		System.out.println(dfs.dfsImpl(a));
	}
}

class Node {

	Character val;
	Node left;
	Node right;

	Node(Character val) {
		this.val = val;
		this.right = null;
		this.left = null;
	}
}
