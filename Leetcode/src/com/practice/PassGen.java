package com.practice;

import java.util.Random;

public class PassGen {

	public static void main(String[] args) {


		System.out.print(generatingSpecialCharaceters(33, 47) + generatingRandomNumbers() + generatingCaps() + generatingLows()+(generatingSpecialCharaceters(58, 64)));
		

	}

	public static char generatingSpecialCharaceters(int min, int max) {

		char random = (char) ((Math.random() * (max - min)) + min);

		return random;

	}

	public static String generatingRandomNumbers() {

		return String.format("%06d", new Random().nextInt(999999));
	}

	public static String generatingCaps() {
		String upperCase = "";

		for (int i = 0; i < 2; i++) {
			upperCase += (char) ((Math.random() * (90 - 65)) + 65);
		}
		return upperCase;
	}

	public static String generatingLows() {

		String lowerCase = "";

		for (int i = 0; i < 2; i++) {
			lowerCase += (char) ((Math.random() * (122 - 97)) + 97);
		}
		return lowerCase;
	}
}
