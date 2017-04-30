package com.carrercup;

import java.util.Arrays;

/*
 * 
 * Given an array of integers, rearrange the array in such a way that the first element is 
 * first maximum and second element is first minimum. 
Input : {1, 2, 3, 4, 5, 6, 7} 
Output : {7, 1, 6, 2, 5, 3, 4}
 * 
 * 
 */
public class ArrayOrder {
	public static void main(String[] args) {
		ArrayOrder obj = new ArrayOrder();
		int[] a = { 1, 2, 9, 4, 11, 6, 7 };
		obj.maxMin(a);
	}

	public void maxMin(int[] a) {
		Arrays.sort(a);
		int[] b = new int[a.length];
		for (int i = 0, j = 0, k = a.length - 1; i < a.length; i++) {
			if (i % 2 == 0) {
				b[i] = a[k];
				k--;
			} else {
				b[i] = a[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
