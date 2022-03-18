package com.dailybyte;

import java.util.Scanner;

/*Given a positive integer n, return its corresponding column title in an excel spreadsheet.

Ex: Given the following values for n...

n = 1, return “A”.
n = 2, return “B”.
n = 3, return “C”.
n = 26, return “Z”. 
n = 27, return “AA”. 
n = 28, return “AB”. 
*/
public class SpreadSheet {

	public static StringBuilder columnTitle(int column) {

		StringBuilder columnName = new StringBuilder();

		while (column > 0) {

			int remainder = column % 26;

			if (remainder == 0) {
				columnName.append('Z');
				column = (column / 26) - 1;
			} else {
				columnName.append((char) ((remainder - 1) + 'A'));
				column = column / 26;
			}
		}
		return columnName.reverse();

	}
	
	public static int columnName(String columnTitle) {
		
		int result = 0;
		
		for (int i = 0; i < columnTitle.length(); i++) {
			
			char c = columnTitle.charAt(i);
			result = result * 26 + c - 'A' + 1;
		}
		return result;
	}
	


	public static void main(String[] args) {

		System.out.println("Enter the column number for the excel spreadsheet");

		Scanner in = new Scanner(System.in);
		int column = in.nextInt();
//		String column = in.nextLine();

		System.out.println(SpreadSheet.columnTitle(column));
//		System.out.println(SpreadSheet.columnName(column.toUpperCase()));
		
		in.close();
		
	}
}
