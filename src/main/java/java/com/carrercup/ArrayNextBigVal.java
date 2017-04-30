package com.carrercup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * Replace element of an Array with nearest bigger number at right side of the Array in O(n) 
For example if the input Array is 
7, 5, 6, 3, 4, 1, 2, 9, 11 
output array should be 
9, 6, 9, 4, 9, 2, 9, 11, 11
 * 
 */
public class ArrayNextBigVal {

	public void findAndAssignNextVal(Integer[] arr) {
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(arr[arr.length - 1]);
		for (int i = arr.length - 2; i >= 0; i--) {
			int current = arr[i];
			while (!intStack.isEmpty() && intStack.peek() < current) {
				intStack.pop();
			}
			if (!intStack.isEmpty()) {
				arr[i] = intStack.peek();
				intStack.push(current);
			} else {
				intStack.push(current);
				arr[i] = current;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		Integer[] arr = { 7, 5, 1, 6, 2, 6, 3, 4, 1, 2, 9, 11 };
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList = Arrays.asList(arr);

		ArrayNextBigVal obj = new ArrayNextBigVal();
		obj.findAndAssignNextVal(arr);
	}
}
