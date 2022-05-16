package com.dailybyte;

//This question is asked by Amazon. Given a string s and a list of words representing a dictionary,
// return whether the entirety of s can be segmented into dictionary words.
//        Note: You may assume all characters in s and the dictionary are lowercase.
//s = "thedailybyte", dictionary = ["the", "daily", "byte"], return true.

public class DictionaryWords {
	public static void main(String[] args) {

		String s = "thedailybyte";
		String[] dictionary = { "the", "daily", "byte" };
		boolean flag = false;

		if (dictionary[0].equals(s.substring(0, dictionary[0].length()))) {

			for (int i = 1; i < dictionary.length; i++) {
				if (dictionary[i].equals(s.substring(dictionary[i - 1].length() + i,
						dictionary[i - 1].length() + dictionary[i].length()))) {
					flag = true;
					System.out.println(flag);
					System.out.println(dictionary[i]);
				} else {
					System.out.println("flag is false, so breaking out of the loop");
				}
			}
		}
	}
}
