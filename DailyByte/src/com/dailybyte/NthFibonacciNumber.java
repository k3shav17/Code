package com.dailybyte;

/*Given an integer value, N, return the Nth Fibonacci number.
Note: Fibonacci numbers are a number sequence where Fibonacci(N) = Fibonacci(N - 1) + Fibonacci(N - 2). The first two Fibonacci numbers are zero and one.

Ex: Given the following N…

N = 2, return 1 (one is the second number in the Fibonnaci sequence).

Ex: Given the following N…

N = 3, return 2 (Fibonnaci(3) = Fibonacci(2) + Fibonacci(1) = 1 + 1 = 2).*/
import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		System.out.println("Enter the position of the fibonacci number you wants to know");
		Scanner in = new Scanner(System.in);
		
		int position = in.nextInt();
		
		long firstFibonacci = 0, secondFibonacci = 1;
		long fibonacciNumber = 0;
		for (int i = 2; i <= position; i++) {
			fibonacciNumber = firstFibonacci + secondFibonacci;
			firstFibonacci = secondFibonacci;
			secondFibonacci= fibonacciNumber;
		}
		
		System.out.println(fibonacciNumber);
		in.close();
	}
}
