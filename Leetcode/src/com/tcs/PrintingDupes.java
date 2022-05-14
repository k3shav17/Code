package com.tcs;
//a2 = aa, keshav3 = keshavkeshavkeshav
public class PrintingDupes {

	public static void main(String[] args) {
		
		String repetition = "k3sh";
		
		for (int i = 0; i < Integer.parseInt(String.valueOf(repetition.charAt(repetition.length() - 1))); i++) {
			
			System.out.print(repetition.substring(0, repetition.length() - 1));
		}
	}
}
