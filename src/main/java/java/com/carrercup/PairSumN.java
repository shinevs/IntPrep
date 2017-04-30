package com.carrercup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * 
 * Given an array A = [3, 7, 2,5,6,4] for a number N, print the pairs from that array A 
 * that sums up to N. You should print each pair once.
 * 
 */
public class PairSumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairSumN obj = new PairSumN();
		Integer[] arr = { 3, 7, 2, 5, 6, 4 };
		int n = 9;
		obj.pair(arr, n);
	}

	public void pair(Integer[] arr, int n) {
		Collection<Integer> myList = new ArrayList<Integer>();
		/*
		 * for (int a : arr) { myList.add(a); }
		 */
		myList = Arrays.asList(arr);
		int value = 0;
		for (int a : myList) {
			value = n - a;
			if (myList.contains(value))
				System.out.println(a + "," + value);
		}
	}

}
