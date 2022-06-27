package com.dailybyte;

/*
 * Given an integer, N, return its string representation including the necessary commas.
 * 
 * Ex: Given the following N…
 * 
 * N = 200000000, return "200,000,000".
 * Ex: Given the following N…
 * 
 * N = 5000, return "5,000".
 * Ex: Given the following N…
 * 
 * N = 100, return "100".
 * */
public class DB270622 {

	public StringBuilder insertCommas(int number) {

		if (number >= 0 && number <= 999) {
			return new StringBuilder(number);
		}

		String numToStr = number + "";
		String withCommas = "";

		int count = 0;
		for (int i = numToStr.length() - 1; i >= 0; i--) {
			if (count % 3 == 0 && count != 0) {
				withCommas += "," + numToStr.charAt(i);
			} else {
				withCommas += numToStr.charAt(i);
			}
			count++;
		}
		StringBuilder str = new StringBuilder(withCommas);
		return str.reverse();
	}

	public static void main(String[] args) {

		int number = 5000;
		
		DB270622 db = new DB270622();
		System.out.println(db.insertCommas(number));

	}
}
