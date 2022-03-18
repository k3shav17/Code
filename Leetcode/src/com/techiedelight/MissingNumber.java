package com.techiedelight;

//For example, consider array {1, 2, 3, 4, 5, 7, 8, 9, 10} whose elements are distinct and within the range of 1 to 10. The missing number is 6.
public class MissingNumber {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int missed = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != (i + 1)) {
				missed = i + 1;
				break;
			}
		}
		System.out.println(missed);
	}
}
