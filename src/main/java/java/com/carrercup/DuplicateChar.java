package com.carrercup;

/*
 * 
 * Find duplicate char in a string with out having a new data structure 
 * 
 */
public class DuplicateChar {

	public static void main(String[] args) {
		DuplicateChar obj = new DuplicateChar();
		String str = "Aabcdefghi..";
		System.out.println(obj.checkDuplicate(str));

	}

	public boolean checkDuplicate(String str) {
		boolean[] charBool = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			System.out.println(value);
			if (charBool[value] == true)
				return false;
			else
				charBool[value] = true;
		}
		return true;
	}
}
