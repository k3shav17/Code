package com.kickstart;

import java.util.ArrayList;
import java.util.Scanner;

public class CandiesRemaining {

	public static int candiesLeft(int candyBags, int kids, ArrayList<Integer> candies) {

		int totalCandies = 0;
		for (int i = 0; i < candies.size(); i++) {
			totalCandies += candies.get(i);
		}

		return totalCandies % kids;
	}

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();

			for (int t = 1; t <= T; t++) {
				int candyBags = in.nextInt();
				int kids = in.nextInt();
				ArrayList<Integer> candies = new ArrayList<>();

				for (int i = 0; i < candyBags; i++) {
					candies.add(in.nextInt());
				}
				System.out.println("Case #" + t + ": " + candiesLeft(candyBags, kids, candies));
			}
		}
	}
}