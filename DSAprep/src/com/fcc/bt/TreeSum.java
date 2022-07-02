package com.fcc.bt;

import java.util.Stack;

public class TreeSum {

	public static void main(String[] args) {

		NodeS a = new NodeS(3);
		NodeS b = new NodeS(11);
		NodeS c = new NodeS(4);
		NodeS d = new NodeS(2);
		NodeS e = new NodeS(4);
		NodeS f = new NodeS(1);

		a.right = b;
		a.left = c;
		b.right = e;
		b.left = d;
		c.right = f;

		TreeSum ts = new TreeSum();

		System.out.println(ts.sumOfNodesRcs(a));
	}

	public int sumOfNodesRcs(NodeS root) {

		if (root == null)
			return 0;

		return root.value + sumOfNodesRcs(root.left) + sumOfNodesRcs(root.right);
	}

	public int sumOfNodesItr(NodeS root) {
		if (root == null)
			return -1;

		int sum = 0;
		Stack<NodeS> branches = new Stack<>();
		branches.push(root);

		while (branches.size() > 0) {
			NodeS current = branches.pop();
			sum += current.value;
			if (current.left != null)
				branches.push(current.left);
			if (current.right != null)
				branches.push(current.right);
		}
		return sum;
	}
}

class NodeS {

	int value;
	NodeS right;
	NodeS left;

	public NodeS(int value) {
		this.value = value;
	}
}
