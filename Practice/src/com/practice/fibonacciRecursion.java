package com.practice;

public class fibonacciRecursion {

	public static void series(int first, int second, int end) {

		for (int i = first; i <= end; i++) {
			int sum = 0;
			sum = first + second;
			first = second;
			second = sum;
			System.out.println(sum);
		}
	}

	public static int seriesRec(int end) {
		if (end == 1 || end == 2)
			return 1;
		return seriesRec(end - 1) + seriesRec(end - 2);
	}

	public static void main(String[] args) {
		int a = 1, b = 1, n = 10;
//		System.out.println(a);
//		series(a, b, n);
		for (int i = 1; i <= n; i++) {
			System.out.println(seriesRec(i));
		}
	}
}
