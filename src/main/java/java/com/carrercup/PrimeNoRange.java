package com.carrercup;

import java.util.HashMap;
import java.util.Map;

/*
 * We need to find Prime numbers in range [L,R]. and need to find a highest occuring digit and if frequency is same, the highest number is answer.
What can we do for this program is to divide this prog in 3 parts.
1 ) Find prime numbers and store them in Array.
2 ) Create new array from this array with all just digits
ex : prime’s array = [2, 3, 5, 7, 11, 13, 17]
so new Array will be = [2, 3, 5, 7, 1, 1, 1, 3, 1, 7]
3) Find occurrence of each digit like [0,3,1,2,0,1,0,2] (0 comes 0 time, 1 comes 3 times, and so one…)
Now get the highest digit, return its index, if such numbers are more than one, return the highest index.
Coding Soultion :
 */
public class PrimeNoRange {
	public int findDigit(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer value = arr[i];
			// System.out.println(value);
			while (value > 0) {
				Integer k = value % 10;
				if (countMap.get(k) != null) {
					countMap.put(k, countMap.get(k) + 1);
				} else
					countMap.put(k, 1);
				value /= 10;
			}
		}
		int max = 0, value = 0;
		for (Map.Entry<Integer, Integer> myMap : countMap.entrySet()) {
			System.out.println(myMap.getKey() + " " + myMap.getValue());
			if (max < myMap.getValue()) {
				value = myMap.getKey();
				max = myMap.getValue();
			} else if (max == myMap.getValue()) {
				if (value < myMap.getKey()) {
					value = myMap.getKey();
				}
			}
		}
		return value;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 77, 22, 66, 21, 6 };

		PrimeNoRange obj = new PrimeNoRange();
		System.out.println(obj.findDigit(array) + "max value with high occurance");
	}
}
