package com.dailybyte;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println("Enter two words");
        Scanner in = new Scanner(System.in);
        String firstWord = in.nextLine();
        String secondWord = in.nextLine();
        boolean output = false;
        Set<Character> subs = new HashSet<>();
        if (firstWord.length() <= secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                for (int j = i; j < secondWord.length(); j++) {
                    if (firstWord.charAt(i) == secondWord.charAt(j)) {
                        subs.add(secondWord.charAt(j));
                    }
                }
            }
        } else System.out.println("Enter proper words");

        output = (subs.size() == firstWord.length()) ? (true) : (false);
        System.out.println(output);
        in.close();
    }
}
