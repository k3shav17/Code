package com.dailybyte;

import java.util.Scanner;

/*Given a string, text, return how many times you can form the string “programming”.

Ex: Given the following text…

text = "mingabcprojklgram", return 1.

Ex: Given the following text…

text = "rammingabcprogrammingdefprog", return 2.*/

public class ProgrammingString {

	public static int repeatedProgramming(String text) {

		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'p' || text.charAt(i) == 'r' || text.charAt(i) == 'o' || text.charAt(i) == 'a'
					|| text.charAt(i) == 'm' || text.charAt(i) == 'i' || text.charAt(i) == 'g'
					|| text.charAt(i) == 'n') {
				counter++;
			}
		}
		
		if (counter == 11) {
			return 1;
		} else if ((counter > 11)) {
			if (counter % 11 == 0)
				return counter % 11;
		}
		return 0;
	}

//	public static int repeatedProgramming(String text) {
//		
//		List<Character> program = new ArrayList<>();
//		
//		for (int i = 0; i < text.length(); i++) {
//			if (text.charAt(i) == 'p' || text.charAt(i) == 'r' || text.charAt(i) == 'o' || text.charAt(i) == 'a'
//					|| text.charAt(i) == 'm' || text.charAt(i) == 'i' || text.charAt(i) == 'g'
//					|| text.charAt(i) == 'n') {
//				program.add(text.charAt(i));
//			}
//		}
//		System.out.println(program);
//		
//		return program.size();
//	}
	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();

		System.out.println(ProgrammingString.repeatedProgramming(text.toLowerCase()));
		in.close();

	}
}
