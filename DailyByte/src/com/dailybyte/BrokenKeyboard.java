package com.dailybyte;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*You are typing on a broken keyboard trying to spell your friend’s name. 
 * Since the keyboard is broken, sometimes when you press a key the key is typed one or more times. 
 * Given a string typed and a string name return whether or not you’ve successfully typed your friend’s name even though certain keys might be repeated. 
Note: Both strings will only contain lower case alphabetical characters. 

Ex: Given the following typed and name…

typed = "kkevin", name = "kevin", return true.
Ex: Given the following typed and name…

typed = "timmm", name = "timmy", return false.*/

public class BrokenKeyboard {

	public static boolean isTypedName(String misspelt, String correctName) {

		Set<Character> misspeltSet = new HashSet<Character>();
		Set<Character> correctSet = new HashSet<Character>();

		for (int i = 0; i < misspelt.length(); i++) {
			misspeltSet.add(misspelt.charAt(i));
		}

		for (int i = 0; i < correctName.length(); i++) {
			correctSet.add(correctName.charAt(i));
		}

		if (misspeltSet.size() == correctSet.size())
			return true;
		return false;

	}

	public static void main(String[] args) {

		System.out.println("Type the name");
		Scanner in = new Scanner(System.in);

		String misspelt = in.nextLine();
		System.out.println("Enter the original name");
		String correctName = in.nextLine();

		System.out.println(isTypedName(misspelt, correctName));
		in.close();
	}
}
