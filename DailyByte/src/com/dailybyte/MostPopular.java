package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a paragraph and a list of banned words, 
 * return the most frequently occurring word that is not banned. 
 * Treat words case insensitively and ignore punctuation.

Ex: Given the following paragraph and list of banned words...

paragraph = "The daily, the byte Daily.", banned = [“the”], return “daily”.*/
public class MostPopular {

	private static List<String> filteringMostPopular(String[] paragraph, List<String> banned) {

		List<String> filtering = new ArrayList<>();

		for (int i = 0; i < paragraph.length; i++) {
			if (!banned.contains(paragraph[i])) {
				filtering.add(paragraph[i]);
			}
		}

		return filtering;
	}

	public static void main(String[] args) {

		System.out.println("Enter paragraph");
		Scanner in = new Scanner(System.in);

		String paragraph = in.nextLine();
		String[] para = paragraph.split("[\\s,]+");

		System.out.println("Enter the size of the banned words list");
		int bannedSize = in.nextInt();

		List<String> banned = new ArrayList<>();
		for (int i = 0; i < bannedSize; i++) {
			banned.add(in.next());
		}
		System.out.println(MostPopular.filteringMostPopular(para, banned));
		in.close();
	}
}
