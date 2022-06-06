package com.dailybyte;

import java.util.Scanner;

//(30*H) -(11/2*M).
public class ClockAngle {

	public static void main(String[] args) {

		System.out.println("enter time in HH:mm format");

		Scanner in = new Scanner(System.in);

		String time = in.nextLine();

		String[] hands = time.split(":");

		double angle = (30 * Double.parseDouble(hands[0])) - (5.5) * Double.parseDouble(hands[1]);

		if ((int) angle == 360)
			System.out.println(0);
		else
			System.out.println(Math.abs(angle));
		in.close();
	}
}
