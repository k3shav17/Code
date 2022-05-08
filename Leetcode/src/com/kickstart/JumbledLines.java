package com.kickstart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Write a program that takes a path to a file name as an argument (.txt file), reads the file and
 * generates a new file that has every alternate line swapped. In the new file, line 2 is line 1 of
 * original file, line 3 of new file is line 4 of original file, line 4 of new file is line 3 of original file and
 * so on.*/

public class JumbledLines {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\kesha\\Downloads\\test.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String newPath = "C:\\Users\\kesha\\Downloads\\newtext.txt";

		File newFile = new File(newPath);
		if (newFile.createNewFile()) {
			System.out.println("file created and started writing " + newFile.getName());
		}

		FileWriter myWriter = new FileWriter(newPath);

		String st;
		while ((st = br.readLine()) != null) {
			
			System.out.println(st);
		}
		
		//String[] lines = st.split("\\r?\\n");
		String[] lines = st.split(System.lineSeparator());
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
		myWriter.close();

		br.close();
	}

}
