package com.fcc.bt;

public class MaxPathSum {

	public static void main(String[] args) {

		NodePS a = new NodePS(1);
		NodePS b = new NodePS(2);
		NodePS c = new NodePS(3);
//		NodePS d = new NodePS(4);
//		NodePS e = new NodePS(2);
//		NodePS f = new NodePS(1);

		a.right = c;
		a.left = b;
//		b.left = d;
//		b.right = e;
//		c.right = f;
		
		MaxPathSum mps = new MaxPathSum();
		System.out.println(mps.maxChildPath(a));
	}

	public int maxChildPath(NodePS root) {

		if (root == null)
			return Integer.MIN_VALUE;
		if (root.right == null && root.left == null)
			return root.value;

		return root.value + Integer.max(maxChildPath(root.left), maxChildPath(root.right));
	}
}

class NodePS {

	int value;
	NodePS right;
	NodePS left;

	public NodePS(int value) {
		this.value = value;
	}
}
