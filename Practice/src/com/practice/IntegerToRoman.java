package com.practice;

public class IntegerToRoman {

	static String[] thousands = { "", "M", "MM", "MMM" };
	static String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	static String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	static String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

	public String intToRoman(int num) {

		return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];
	}

	public static void main(String[] args) {

		IntegerToRoman itr = new IntegerToRoman();
		System.out.println(itr.intToRoman(324));
	}
}
