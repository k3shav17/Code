package com.fcc.comques;

public class MirrorTree {

	public boolean isMirror(Node1 root1, Node1 root2) {

		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		if (root1.value != root2.value)
			return false;

		return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
	}

	public static void main(String[] args) {

		Node1 a = new Node1(1);
		Node1 b = new Node1(2);
		Node1 c = new Node1(2);
		Node1 d = new Node1(3);
		Node1 e = new Node1(4);
		Node1 f = new Node1(4);
		Node1 g = new Node1(3);

		a.right = b;
		a.left = c;
		b.right = d;
		b.left = e;
		c.right = f;
		c.left = g;
		
		MirrorTree mt = new MirrorTree();
		System.out.println(mt.isMirror(a.right, a.left));
	}
}

class Node1 {

	Integer value;
	Node1 left;
	Node1 right;

	public Node1(Integer value) {
		this.value = value;
	}
}
