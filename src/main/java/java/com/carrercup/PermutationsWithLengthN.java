package com.carrercup;

/*
 * 
 * Given a set of values 0-9, return all permutations of that set of length n. 
 * Example: n=2, set ={2,3,4} Return: {2,2}, {3,3}, {4,4}, {2,3}, {3,2}, {3,4}, {4,3}, {2,4}, {4,2}
 * 
 * 
 */
public class PermutationsWithLengthN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4 };
		int n = 2;
		PermutationsWithLengthN obj = new PermutationsWithLengthN();
		obj.Permutations(arr, n);
	}

	void Permutations(int[] arr, int n) {
		int j;
		int index;
		int number;
		int length = arr.length;
		int total_permutations = (int) Math.pow(length, n);// 3 power 2 means
															// length
															// power n
		// System.out.println(4 / 3);
		for (int i = 0; i < total_permutations; i++) {
			number = i;
			for (j = 0; j < n; j++) {
				index = number % length;
				// System.out.println("==" + index + " = " + number + " = " +
				// length);
				System.out.print(arr[index] + " ");
				number /= length;
			}
			System.out.println();
		}
	}
}
