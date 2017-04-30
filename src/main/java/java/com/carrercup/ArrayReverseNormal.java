package com.carrercup;

public class ArrayReverseNormal {
	int[] reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		ArrayReverseNormal obj = new ArrayReverseNormal();
		int[] rev = obj.reverse(arr);
		for (int i = 0; i < rev.length; i++)
			System.out.println(rev[i]);
	}
}
