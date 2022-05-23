package com.techiedelight;

import java.util.LinkedList;
import java.util.List;

//For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.

public class MaxOfProduct {

	public static void main(String[] args) {

		int[] array = { -10, -3, 5, 6, -2 };
		int max = array[0];

		List<String> pairs = new LinkedList<>();

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] * array[j] >= max) {
					max = array[i] * array[j];
					pairs.add("(" + array[i]);
					pairs.add(array[j] + ")");
				}
			}
		}
		System.out.println(pairs);
	}
}
