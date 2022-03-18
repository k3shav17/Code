package com.dailybyte;

import java.util.Scanner;

public class DefangingIP {

	public static String afterDefang(String address) {
		String defang = "";

		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				defang = defang + "[.]";
			} else
				defang += address.charAt(i);
		}
		return defang;
	}

	public static void main(String[] args) {
		System.out.println("Enter an IP address to defang");
		Scanner input = new Scanner(System.in);
		String address = input.nextLine();
		System.out.println(afterDefang(address));
		input.close();
	}
}
