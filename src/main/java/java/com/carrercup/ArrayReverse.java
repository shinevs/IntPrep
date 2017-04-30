/*
 * 
 * Reverse the array except the negative numbers
 * 
 * 
 */

package com.carrercup;

public class ArrayReverse {
	public static void main(String[] args) {
		ArrayReverse obj = new ArrayReverse();
		int[] arr = { 1, 5, 9, -4, 5, 9, 3, 2 };
		obj.reverseArray(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public void reverseArray(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			j++;
			if (a[i] < 0) {
				reverseArraySet(a, i - 1, j - 2);
				j = 0;
			}
		}
		if (j > 0) {
			// System.out.println(a.length + "," + j);
			reverseArraySet(a, a.length - 1, j - 1);
		}
	}

	public void reverseArraySet(int[] a, int i, int j) {
		int k = i - j;
		while (i >= k) {
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			i--;
			k++;
		}
	}
}
