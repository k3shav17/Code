package com.practice;

public class OneToTenRecursion {

	public void recursion(int n) {
		if (n >= 1 && n <= 10) {
			recursion(n - 1);
			System.out.println(n);
		}
		return;
	}

	public static void main(String[] args) {

		OneToTenRecursion ott = new OneToTenRecursion();
		ott.recursion(10);
	}
}
