//Find the possible combinations of a string
package com.carrercup;

public class PossibleCombinations {
	public static void main(String[] arr) {
		// PossibleCombinations obj = new PossibleCombinations();
		combination("", "1234");
	}

	private static void combination(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				combination(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

}
