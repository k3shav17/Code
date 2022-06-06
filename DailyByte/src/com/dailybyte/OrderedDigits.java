package com.dailybyte;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two values, low and high, return all values between low and high (inclusive) that contain consecutive digits in sorted order.
 * Note: low and high will be between one and a million.
 * Ex: Given the following low and high…
 * low = 10, high = 25, return [12, 23].
 * Ex: Given the following low and high…
 * low = 15, high = 48, return [23, 34, 45].
*/
public class OrderedDigits {

	static OrderedDigits od = new OrderedDigits();

	public List<String> consecutiveSortedNumbers(int low, int high) {

		List<String> sortedNumbers = new ArrayList<>();

		for (int i = low; i <= high; i++) {
			String str = i + "";
			if (od.isStringSorted(str))
				sortedNumbers.add(str);
		}
		return sortedNumbers;
	}

	public boolean isStringSorted(String str) {
		for (int c = 0; c < str.length() - 1; c++) {
			if (str.charAt(c) == str.charAt(c + 1) - 1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int low = 15, high = 48;
		System.out.println(od.consecutiveSortedNumbers(low, high));
	}
}
