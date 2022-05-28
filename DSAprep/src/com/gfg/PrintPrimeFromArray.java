package com.gfg;

public class PrintPrimeFromArray {

	public static boolean isPrime(int value) {

		if (value == 0 || value == 1) {
			return false;
		}

		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = new int[50];

		for (int i = 1; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 50 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			if (isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
