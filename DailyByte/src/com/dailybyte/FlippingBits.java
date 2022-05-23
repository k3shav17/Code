package com.dailybyte;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a positive integer, N, return all flippable numbers between one and N inclusive.
 * Note: A flippable number is a number whose digits can be rotated 180 degrees to form a different number. Digits 0, 1, 6, 8, and 9 become 0, 1, 9, 8, and 6 respectively when rotated. Digits 2, 3, 4, 5, and 7 are invalid when rotated.
 * Ex: Given the following value N…
 * N = 10, return 3 (6, 9, and 10 are flippable).
 * Ex: Given the following value N…
 * N = 17, return 4.
 * */
public class FlippingBits {

	public static int isFlippable(int n) {

		Map<Integer, Integer> map = new HashMap<>();

		map.put(6, 9);
		map.put(9, 6);
		map.put(8, 8);

		String[] series = new String[n];

		for (int i = 0; i < n; i++) {
			series[i] = i + "";
		}

		int flippable = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < series[i].length(); j++) {
				if (map.get(Integer.parseInt(String.valueOf(series[i].charAt(j)))) != null) {
					System.out.println(map.get(Integer.parseInt(String.valueOf(series[i].charAt(j)))));
					flippable++;
				}
			}
		}
		return flippable;
	}

	public static void main(String[] args) {
		int number = 2;
		System.out.println(isFlippable(number));

	}
}
