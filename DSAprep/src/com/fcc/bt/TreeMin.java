package com.fcc.bt;

import java.util.Stack;

public class TreeMin {

	public static void main(String[] args) {

		NodeM a = new NodeM(3);
		NodeM b = new NodeM(11);
		NodeM c = new NodeM(5);
		NodeM d = new NodeM(12);
		NodeM e = new NodeM(4);
		NodeM f = new NodeM(10);

		a.right = b;
		a.left = c;
		b.right = e;
		b.left = d;
		c.right = f;

		TreeMin tm = new TreeMin();
		System.out.println(tm.minValueItr(a));
		System.out.println(tm.minValueRcs(a));
	}

	public int minValueItr(NodeM root) {

		if (root == null)
			return 0;

		Stack<NodeM> branches = new Stack<>();
		branches.push(root);

		int min = branches.peek().value;

		while (branches.size() > 0) {

			NodeM current = branches.pop();
			if (current.value < min)
				min = current.value;
			if (current.left != null)
				branches.push(current.left);
			if (current.right != null)
				branches.push(current.right);
		}
		return min;
	}
	
	public int minValueRcs(NodeM root) {
		if (root == null) return Integer.MAX_VALUE;
		
		return Integer.min(root.value, Integer.min(minValueRcs(root.left), minValueRcs(root.right)));
	}
}

class NodeM {

	int value;
	NodeM right;
	NodeM left;

	public NodeM(int value) {
		this.value = value;
	}
}
