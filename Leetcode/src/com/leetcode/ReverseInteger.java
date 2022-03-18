package com.leetcode;

public class ReverseInteger {

	public static int reverse(int x) {
		int result = 0;

		while (x != 0) {
			int tail = x % 10; // Dividing the value by % gives us remainder back so. We can get the last value
			int newResult = result * 10 + tail; // in the newresult adding the tail value which we got because let say
												// we have something like
			// this 123, and from tail we got 3. Now what will happen when we add 2 after 3
			// when we come back we have something like
			// 30 + 2 = 32 and again we come back with carrying 1 we have 320 + 1 = 321,
			// Integer is reversed.
			if ((newResult - tail) / 10 != result) // checking if it's not valid. Return 0.
			{
				return 0;
			}
			result = newResult; // dumping the newResult value in result
			x = x / 10; // updating our x integer/
		}

		return result;
	}

	public static void main(String[] args) {

	}

}
