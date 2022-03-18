package com.dailybyte;

/*Given an integer, num, convert it to hexadecimal and return the result.

Ex: Given the following num…

num = 15, return "f".

Ex: Given the following num…

num = 46, return "2e".*/

import java.util.Scanner;

public class HexaDecimal {

	public static StringBuilder hexaDecimalConv(int decimal) {

		StringBuilder hexa = new StringBuilder("");

		int temp = decimal;

		while (decimal >= 1) {

			temp = decimal % 16;
			if (temp > 9 && temp <= 15) {
				char letter = 96;

				for (int i = 9; i < temp; i++) {
					letter++;
				}

				hexa.append(Character.toString(letter).toUpperCase());
			} else
				hexa.append(temp);
			decimal = decimal / 16;
		}
		return hexa.reverse();
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to convert it to hexa decimal");

		Scanner in = new Scanner(System.in);
		int decimal = in.nextInt();

		System.out.println(hexaDecimalConv(decimal));
		in.close();
	}
}
