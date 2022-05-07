package com.practice;

public class Xibonacci {

	public static void tribonacci(double[] s, int n) {

		double a = s[0], b = s[1], c = s[2];
		double[] series = new double[n];

		double sum = 0;
		series[0] = a;
		series[1] = b;
		series[2] = c;

		for (int i = 3; i < n; i++) {

			sum = a + b + c;
			a = b;
			b = c;
			c = sum;
			series[i] = sum;
		}

		for (int i = 0; i < series.length; i++) {
			System.out.print(series[i] + " ");
		}
	}

	public static void main(String[] args) {
		double[] series = { 1, 1, 1 };
		int n = 8;

		tribonacci(series, n);
	}
}
