package com.dailybyte;

import java.util.Scanner;

public class RemovingVowels {

    public static String removeVowels(String word) {

        word = word.toLowerCase();
        String onlyConsonants = "";
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')) {
                onlyConsonants += word.charAt(i);
            }
        }
        return onlyConsonants;
    }

    public static void main(String[] args) {

        System.out.println("Enter a word to remove the vowels in it");
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        if (!word.matches("[a-zA-Z]+")) {
            while (!word.matches("[a-zA-Z]+")) {
                System.out.println("Please enter words only");
                word = input.nextLine();
                if (word.matches("[a-zA-Z]+")) {
                    System.out.println(removeVowels(word));
                }
            }
        } else System.out.println(removeVowels(word));
        input.close();

    }
}
