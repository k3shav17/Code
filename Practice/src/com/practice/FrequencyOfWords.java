package com.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

	public Map<String, Integer> frequency(String sentence) {

		Map<String, Integer> wordsFrequency = new HashMap<>();

		String[] words = sentence.toLowerCase().split(" ");

		for (int i = 0; i < words.length; i++) {

			wordsFrequency.put(words[i], wordsFrequency.getOrDefault(words[i], 0) + 1);
		}

		return wordsFrequency;
	}

	public static void main(String[] args) {

		FrequencyOfWords fw = new FrequencyOfWords();
		System.out.println(fw.frequency("Hello hello world"));
	}
}
