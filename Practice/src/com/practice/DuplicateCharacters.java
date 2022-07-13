package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public void characterFrequency(String word) {

		Map<Character, Integer> frequency = new HashMap<>();

		for (Character c : word.toCharArray()) {
			int count = 1;
			if (frequency.containsKey(c)) {
				count++;
				frequency.put(c, frequency.getOrDefault(c, 0) + 1);
			} else
				frequency.put(c, count);
		}

		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		String word = "Programming";

		DuplicateCharacters dc = new DuplicateCharacters();
		dc.characterFrequency(word);

	}
}
