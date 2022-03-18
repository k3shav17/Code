package com.dailybyte;

/*This question is asked by Apple. Given a 32 bit signed integer, reverse it and return the result.
Note: You may assume that the reversed integer will always fit within the bounds of the integer data type.

Ex: Given the following integer num…

num = 550, return 55
Ex: Given the following integer num…

num = -37, return -73
*/
import java.util.Scanner;

public class ReverseNumber {

	public static String reverseNum(int number) {

		String convert = number + "";
		String reverse = "";

		for (int i = convert.length() - 1; i >= 0; i--) {
			reverse = reverse + convert.charAt(i);
		}
		if (reverse.charAt(0) == '0') {
			reverse = reverse.substring(1, reverse.length());
			
			if (reverse.charAt(reverse.length() - 1) == '-') {
				reverse = "-" + reverse.substring(0, reverse.length() - 1);
			}
		} else if (reverse.charAt(reverse.length() - 1) == '-') {
			reverse = "-" + reverse.substring(0, reverse.length() - 1);
		}
		return reverse;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number to reverse it");

		try (Scanner in = new Scanner(System.in)) {
			int number = in.nextInt();
			System.out.println(reverseNum(number));
		} catch (Exception format) {
			System.out.println("Enter a number not a word or any other thing");
		}

	}

}
