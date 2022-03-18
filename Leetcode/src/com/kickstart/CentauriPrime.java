package com.kickstart;

import java.util.Scanner;

public class CentauriPrime {

	private static String getRuler(String kingdom) {
		// TODO: implement this method to determine the ruler name, given the kingdom.
		String ruler = "";
		char ending = kingdom.charAt(kingdom.length() - 1);

		if (ending == '.') {
			ending = kingdom.charAt(kingdom.length() - 2);
		}

		if (kingdom.length() <= 100) {

			if (ending == 'A' || ending == 'E' || ending == 'I' || ending == 'O' || ending == 'U' || ending == 'a'
					|| ending == 'e' || ending == 'i' || ending == '0' || ending == 'u') {
				ruler = "Alice";
			} else if (ending == 'Y' || ending == 'y') {
				ruler = "nobody";
			} else {
				ruler = "Bob";
			}

		}
		return ruler;
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();

			for (int t = 1; t <= T; ++t) {
				String kingdom = in.next();
				System.out.println("Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
			}
		}
	}
}
