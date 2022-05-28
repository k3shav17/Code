package com.gfg;

import java.util.Scanner;

// Checking whether the string contains only digits or not
public class OnlyDigits {

	public static boolean isDigitsOrNot(String numbers) {

		return !numbers.matches(".*[^0-9].*");
	}

	public static void main(String[] args) {

		System.out.println("enter the string");
		Scanner in = new Scanner(System.in);

		String numbers = in.nextLine();

		System.out.println(isDigitsOrNot(numbers));
		in.close();
	}
}
