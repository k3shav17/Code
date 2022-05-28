package com.practice;

public class Versions {

	public static String maxVersion(String versionA, String versionB) {

		int[] verA = new int[versionA.length()];
		int[] verB = new int[versionB.length()];
		String va = "", vb = "";

		for (int i = 0, j = 0; i < versionA.length(); i++, j++) {
			if ((int) versionA.charAt(i) >= 48 && (int) versionA.charAt(i) <= 57) {
				verA[j] = Integer.parseInt(String.valueOf(versionA.charAt(i)));
			}

			if ((int) versionB.charAt(i) >= 48 && (int) versionB.charAt(i) <= 57) {
				verB[j] = Integer.parseInt(String.valueOf(versionB.charAt(i)));
			}
		}

		for (int i = 0; i < verA.length; i++) {
			va += verA[i];
			vb += verB[i];
		}

		if (Integer.parseInt(va) > Integer.parseInt(vb)) {
			return versionA;
		}
		return versionB;
	}

	public static void main(String[] args) {

		String versionA = "1.2";
		String versionB = "1.2.3.0";

		System.out.println(maxVersion(versionA, versionB));
	}
}
