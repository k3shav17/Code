package com.sde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stocks {

	public static int optimalMonth(List<Integer> stocks) {

		int sum = 0;
		int minMonth = 0;

		for (int i = 0; i < stocks.size(); i++) {
			sum += stocks.get(i);
		}

		minMonth = (int) sum / stocks.size();

		return minMonth;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, click x when you are done.");

		Scanner in = new Scanner(System.in);

		List<Integer> nums = new ArrayList<Integer>();

		while (true) {

			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				nums.add(Integer.parseInt(element));
		}

		System.out.println(optimalMonth(nums));
		in.close();
	}
}
