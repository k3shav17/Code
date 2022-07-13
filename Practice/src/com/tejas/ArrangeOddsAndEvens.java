package com.tejas;

import java.util.Arrays;

public class ArrangeOddsAndEvens {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		ArrangeOddsAndEvens oe = new ArrangeOddsAndEvens();
		System.out.println(Arrays.toString(oe.arrange(arr)));
	}

	private int[] arrange(int[] arr) {

		int j = -1, temp;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
}
