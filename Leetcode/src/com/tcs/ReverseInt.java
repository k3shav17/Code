package com.tcs;

public class ReverseInt {

	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		else if (x > 0) {
			int n = x;
			int temp = x;
			int sum = 0;
			while (x > 0) {
				temp = x % 10;
				sum = sum * 10 + temp;
				x = x / 10;
			}

			if (sum == n) {
				return true;
			} else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		ReverseInt reverse = new ReverseInt();
		System.out.println(1 % 10);
		System.out.println(10 % 10);
		System.out.println(reverse.isPalindrome(10));
	}
}
