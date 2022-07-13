
package com.practice;

import java.util.Scanner;

public class MinimumSteps {

	public static int func(int n) {

		int ans = 0, count = 0;

		while (ans < n) {

			int power3 = 0, power2 = 0, ans1 = 0, ans2 = 0;

			while (ans + Math.pow(3, power3) <= n)
				power3++;

			ans1 += Math.pow(3, --power3);

			while (ans + Math.pow(2, power2) <= n)
				power2++;

			ans2 += Math.pow(2, --power2);

			count++;
			ans += Math.max(ans1, ans2);
//			System.out.println(ans);
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(func(n));
	}
}
