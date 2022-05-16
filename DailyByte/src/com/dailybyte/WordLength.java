package com.dailybyte;

import java.util.Scanner;

/*
Given a string, s, return the length of the last word.
Note: You may not use any sort of split() method.

Ex: Given the following string…

s = "The Daily Byte", return 4 (because "Byte" is four characters long).*/

public class WordLength {

	/* Previous method */
//	public static int lengthOfTheWord(String sentence) {
//
//		String temp = "";
//
//		ArrayList<String> wordArray = new ArrayList<>();
//		for (int i = 0; i < sentence.length(); i++) {
//			if (sentence.charAt(i) != ' ') {
//				temp += sentence.charAt(i);
//			} else {
//				wordArray.add(temp);
//				temp = "";
//			}
//		}
//		wordArray.add(temp);
//		return wordArray.get(wordArray.size() - 1).length();
//
//	}
	
	/* New method */
	public static int lengthOfTheWord(String sentence) {
		
		String[] temp = sentence.trim().split(" ");
		
		return temp[temp.length - 1].length();
	}

	public static void main(String[] args) {

		System.out.println("Enter a sentence to know the length of the last word!!");
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		System.out.println(WordLength.lengthOfTheWord(sentence));
		in.close();

	}

}
