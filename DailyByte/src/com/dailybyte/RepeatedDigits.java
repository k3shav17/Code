package com.dailybyte;

import java.util.Scanner;

public class RepeatedDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();

		int count = 0;

		for (int i = n1; i <= n2; i++) {

			String temp = i + "";

			for (int j = 0; j < temp.length(); j++) {

				for (int k = j + 1; k < temp.length(); k++) {
					if (temp.charAt(j) == temp.charAt(k)) {
						count++;
					}
				}
			}

		}
		
		System.out.println(count);
		in.close();
	}
}
