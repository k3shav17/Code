package com.linked;

public class HammingWeight {

	public static int noOfOnes(int n) {

		int count = 0;
		for (int i = 1; i < 33; i++) {
			if (get(n, i) == true)
				count++;
		}
		return count;
	}

	public static boolean get(int n, int i) {
		return (n & (1 << i)) != 0;
	}

	public static void main(String[] args) {
		int bits = 00000000000000000000000000001011;
		System.out.println(noOfOnes(bits));
	}
}
