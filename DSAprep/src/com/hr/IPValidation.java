package com.hr;

public class IPValidation {

	public static void main(String[] args) {
		boolean isValid = "111111111111".matches("^(?:[0-9]{1,3}.){3}[0-9]{1,3}$");
		System.out.println(isValid);
	}
}
