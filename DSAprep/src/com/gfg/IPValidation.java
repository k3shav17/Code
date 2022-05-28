package com.gfg;

import java.util.Scanner;

public class IPValidation {

	public static boolean isValid(String str) {

		boolean flag = false;
		String[] ips = str.split("[.]");

		int count = 0;

		if (ips.length == 4) {

			for (int i = 0; i < ips.length; i++) {

				if (Integer.parseInt(ips[i]) > 0 && Integer.parseInt(ips[i]) <= 255) {
					count++;
				}
			}
			if (count == ips.length) {
				flag = true;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("enter the IP address in string form");
		Scanner in = new Scanner(System.in);

		String ip = in.nextLine();

		if (isValid(ip)) {
			System.out.println(1);
		} else
			System.out.println(0);

		in.close();
	}
}
