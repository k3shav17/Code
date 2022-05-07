package com.leetcode;

import java.util.Scanner;

/*Given an integer as input and replace all the ‘0’ with ‘5’ in the integer. 

Examples: 

Input: 102 
Output: 152
Explanation: All the digits which are '0' is replaced by '5' 

Input: 1020 
Output: 1525
Explanation: All the digits which are '0' is replaced by '5'*/


public class ReplacingFive {

	public static String zeroToFive(String number) {
		
		String replacedWithFive = "";
		
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '0') {
				replacedWithFive += "5";
			} else replacedWithFive += number.charAt(i);
		}
		
		return replacedWithFive;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the number for which you want to replace 0 with 5");
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();
		
		System.out.println(zeroToFive(number));
		
		in.close();
	}
}
