package com.techiedelight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Combinations {
	
	public static int meth(int size, String str) {
		
		Map<Character, Character> pairs = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				pairs.put(str.charAt(i), str.charAt(j));
			}
		}
		return pairs.size();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		
		System.out.println(Combinations.meth(size, str));
		in.close();
	}

}
