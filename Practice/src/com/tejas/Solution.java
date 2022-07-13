
package com.tejas;

class Solution {
	public static int solve(int N, int a, int[] x) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N - 1; i++) {

			for (int j = 0; j < N; j++) {

				if (i != j) {
					if (Math.abs(a - x[i]) + Math.abs(a - x[j]) > max) {
						max = Math.abs(a - x[i]) + Math.abs(a - x[j]);
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 2, 17 };
		int a = 2;

		System.out.println(solve(arr.length, a, arr));
	}
}
