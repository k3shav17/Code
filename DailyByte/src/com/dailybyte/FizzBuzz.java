package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public static List<String> fizzBuzzList(int limit) {

		List<String> fizzBuzz = new ArrayList<String>();

		for (int i = 1; i <= limit; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzz.add("FizzBuzz");
			} else if (i % 3 == 0) {
				fizzBuzz.add("Fizz");
			} else if (i % 5 == 0) {
				fizzBuzz.add("Buzz");
			} else
				fizzBuzz.add("\"" + i + "\"");
		}
		return fizzBuzz;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number till you want to print fizz and buzz");
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();

		System.out.println(FizzBuzz.fizzBuzzList(limit));
		in.close();
	}
}
