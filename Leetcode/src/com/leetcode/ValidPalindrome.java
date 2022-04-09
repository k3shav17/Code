package com.leetcode;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
        s = s.trim();
        
        String[] palis = s.split("[\\s,:]+");
        
        String mainStr = "";
        String revStr = "";
        
        for (int i = 0; i < palis.length; i++) {
        
            mainStr = mainStr + palis[i];
        }
        
        for (int j = mainStr.length() - 1; j >= 0; j--) {
            revStr += mainStr.charAt(j);
        }
        
        if (mainStr.equalsIgnoreCase(revStr)) {
            return true;
        }
        System.out.println(mainStr);
        System.out.println(revStr);
        return false;
    }

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}
