package com.fcc.bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

	public List<Character> bfsImpl(Node1 root) {

		List<Character> tree = new ArrayList<>();
		if (root == null) {
			return tree;
		}

		Queue<Node1> queue = new ArrayDeque<>();
		queue.add(root);

		while (queue.size() > 0) {

			Node1 current = queue.poll();
			tree.add(current.value);

			if (current.left != null) {
				queue.add(current.left);
			}

			if (current.right != null) {
				queue.add(current.right);
			}
		}
		return tree;
	}

	public static void main(String[] args) {

		Node1 a = new Node1('a');
		Node1 b = new Node1('b');
		Node1 c = new Node1('c');
		Node1 d = new Node1('d');
		Node1 e = new Node1('e');
		Node1 f = new Node1('f');

		a.right = c;
		a.left = b;
		b.right = e;
		b.left = d;
		c.right = f;

		BFS bfs = new BFS();
		System.out.println(bfs.bfsImpl(a));
	}
}

class Node1 {

	Character value;
	Node1 left;
	Node1 right;

	public Node1(Character value) {
		this.value = value;
	}
}
