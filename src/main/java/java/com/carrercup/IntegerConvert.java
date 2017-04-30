package com.carrercup;

import java.util.HashMap;

public class IntegerConvert {

	public static void main(String[] args) {

		IntegerConvert iConvert = new IntegerConvert();

		System.out.println(iConvert.convert("one million two hundread"));
		System.out.println(iConvert.convert("one million two hundread thousand"));
		System.out.println(iConvert.convert("one million two hundread thousand fifty seven"));
		System.out.println(iConvert.convert("one million two hundread thousand two hundread fifty seven"));

	}

	private final HashMap<String, Integer> map;

	public IntegerConvert() {

		map = new HashMap<String, Integer>();

		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		map.put("eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fourteen", 14);
		map.put("fifteen", 15);
		map.put("sixteen", 16);
		map.put("seventeen", 17);
		map.put("eightteen", 18);
		map.put("nineteen", 19);

		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("fourty", 40);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("seventy", 70);
		map.put("enighty", 80);
		map.put("ninety", 90);

		map.put("hundread", 100);
		map.put("thousand", 1000);
		map.put("million", 1000000);
		map.put("billion", 1000000000);

	}

	public int convert(String string) {

		int value = 0;

		String[] words = string.split(" ");

		int local = 0;

		for (String s : words) {
			if (isMultiply(s) && s.equals("hundread")) {
				local *= map.get(s);
			} else if (isMultiply(s)) {
				local *= map.get(s);
				value += local;
				local = 0;
			} else {
				local += map.get(s);
			}
		}

		value += local;
		return value;
	}

	public boolean isMultiply(String s) {

		if (s.equals("billion") || s.equals("million") || s.equals("thousand") || s.equals("hundread")) {
			return true;
		} else {
			return false;
		}
	}
}
