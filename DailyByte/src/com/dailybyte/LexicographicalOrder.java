package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given an integer, N, return all values between one and N (inclusive) in lexicographical order.
 * Note: N will not exceed one million.
 * 
 * Ex: Given the following N…
 * 
 * N = 11, return [1, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9].
 * */
public class LexicographicalOrder {

	public List<String> lexicalNumbers(int number) {

		List<String> lexicalOrder = new ArrayList<>();
		
		for (int i = 1; i <= number; i++) {
			lexicalOrder.add(String.valueOf(i));
		}
		
		Collections.sort(lexicalOrder);
		return lexicalOrder;
	}

	public static void main(String[] args) {

		LexicographicalOrder order = new LexicographicalOrder();
		System.out.println(order.lexicalNumbers(21));
	}
}
