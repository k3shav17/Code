package com.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a list of words followed by two words, the task to find the minimum distance between the given two words in the list of words
Example 1:
Input:
S = { "the", "quick", "brown", "fox", 
     "quick"}
word1 = "the"
word2 = "fox"
Output: 3
Explanation: Minimum distance between the 
words "the" and "fox" is 3
Example 2:

Input:
S = {"geeks", "for", "geeks", "contribute", 
     "practice"}
word1 = "geeks"
word2 = "practice"
Output: 2
Explanation: Minimum distance between the
words "geeks" and "practice" is 2*/

public class MinimumDistance {

	public static int minimum(List<String> words, String wordOne, String wordTwo) {

		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).equals(wordOne)) {
				startIndex = i;
			} else if (words.get(i).equals(wordTwo)) {
				endIndex = i;
				break;
			}
		}
		return endIndex - startIndex;

	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array");
		List<String> words = new ArrayList<String>();

		Scanner in = new Scanner(System.in);

		while (true) {

			String word = in.nextLine();
			if (word.equalsIgnoreCase("x")) {
				break;
			}
			words.add(word);
		}
		System.out.println("enter the words that you want to find the distance between.");
		System.out.println("enter the first word");
		String wordOne = in.nextLine();
		System.out.println("enter the second one");
		String wordTwo = in.nextLine();

		System.out.println(minimum(words, wordOne, wordTwo));
		in.close();
	}
}
