package com.tejas;
import java.util.Map; 
import java.util.HashMap; 

public class WordFrequency {

    public static Map<String, Integer> frequency(String sentence) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> frequencies = new HashMap<>();

        String[] words = sentence.trim().toLowerCase().split("\\s+");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                frequencies.put(entry.getKey(), entry.getValue());
            }
        }
        return frequencies;
    }

    public static void main(String[] args) {

        String sentence = "Given an array, rearrange the elements in the array such that all even elements come first in array and all odd come later or vice versa.";

        System.out.println(frequency(sentence)); 

    } 
}
