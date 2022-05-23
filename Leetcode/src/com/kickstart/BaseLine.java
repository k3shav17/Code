package com.kickstart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Write a function that takes 2 arguments: numberList (array of integers), baseLine (integer) and
 * prints the count of elements in numberList that is less than baseLine and count of elements in
 * numberList that is more than baseLine. Eg: numberList={10,20,30,40,50,60} and baseLine=45,
 * output should be
 * Below BaseLine : 4
 * Above BaseLine : 2*/
public class BaseLine {

	public static void baseLineCount(List<Integer> list, int base) {

		int below = 0, above = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= base) {
				above++;
			} else
				below++;
		}

		System.out.println("Below BaseLine : " + below);
		System.out.println("Above BaseLine : " + above);
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, click x when done.");
		Scanner in = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		while (true) {
			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				list.add(Integer.parseInt(element));
		}

		System.out.println("enter the baseline number");
		int base = in.nextInt();
		
		baseLineCount(list, base);
		in.close();
	}
}