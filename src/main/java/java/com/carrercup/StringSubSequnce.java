
//Given string a and b, with b containing all distinct characters, 
//find the longest common subsequence's 

package com.carrercup;

import java.util.HashMap;
import java.util.Map;

public class StringSubSequnce {

	public static void main(String[] args) {
		StringSubSequnce obj = new StringSubSequnce();
		System.out.println("OP:" + obj.findLCS("MyNamehineaIsShinehi", "hineab"));
	}

	public String findLCS(String a, String b) {
		if (a == null || b == null || a.length() == 0 || b.length() == 0) {
			return "";
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < b.length(); ++i) {
			map.put(b.charAt(i), i);
		}

		String lcs = null;
		int count = 0;
		for (int i = 0; i < a.length(); ++i) {
			if (map.containsKey(a.charAt(i))) {

				if ((count != 0) && map.get(a.charAt(i - 1)) + 1 == map.get(a.charAt(i))) {
					// System.out.println(a.charAt(i) + ":" +
					// (map.get(a.charAt(i - 1)) + 1) + ":" +
					// map.get(a.charAt(i)));
					++count;
				} else {
					count = 1;
				}

				if (lcs == null || lcs.length() < count) {
					lcs = a.substring(i - count + 1, i + 1);
				}
			} else {
				count = 0;
			}
		}

		return lcs;
	}
}
