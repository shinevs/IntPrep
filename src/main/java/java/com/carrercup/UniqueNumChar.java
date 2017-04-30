package com.carrercup;

import java.util.Arrays;

/*
 * check unique number of char in two strings
 * 
 * 
 */
public class UniqueNumChar {
	public static void main(String[] args) {
		UniqueNumChar obj = new UniqueNumChar();
		System.out.println(obj.equalCount("abca", "aabc"));
		// easiest method is sort both the strings and check for equals. :)
		String s1 = "abcda";
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		String s2 = "abacd";
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		String s3 = String.valueOf(c1);
		String s4 = String.valueOf(c2);
		System.out.println(s3.equals(s4) + "," + s3);
	}

	public boolean equalCount(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] letters = new int[256];
		int numUniqueLetters = 0;
		int numCompletedStr = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (letters[s1.charAt(i)] == 0)
				++numUniqueLetters;
			++letters[s1.charAt(i)];
		}
		for (int j = 0; j < s2.length(); j++) {
			int c = (int) s2.charAt(j);
			if (letters[c] == 0)
				return false;
			--letters[c];
			if (letters[c] == 0) {
				++numCompletedStr;
				if (numCompletedStr == numUniqueLetters)
					return true;// why the heck it is required
			}
		}
		return true;

	}
}
