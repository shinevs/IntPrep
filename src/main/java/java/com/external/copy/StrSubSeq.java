package com.external.copy;

import java.util.HashMap;
import java.util.Map;

public class StrSubSeq {
	public static void main(String[] args) {

	}

	public void findSubSeq(String str, String seq) {
		Map<Character, Integer> seqMap = new HashMap<Character, Integer>();
		for (int i = 0; i < seq.length(); i++)
			seqMap.put(seq.charAt(i), i);
	}
}
