package com.gfg;

import java.util.Scanner;

/*Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123
Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only.
*/
public class ImplementAtoi {

	public static int atoi(String str) {

		int intValue = 0;
		try {

			intValue = Integer.parseInt(str);
		} catch (Exception e) {
			return -1;
		}
		return intValue;
	}

	public static void main(String[] args) {

		System.out.println("enter the string which you want to convert to integer");
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		System.out.println(atoi(str));
		in.close();
	}
}
