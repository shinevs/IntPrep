package com.carrercup;

/*
 * Write an efficient  program to find the sum of contiguous 
 * subarray within a one-dimensional array of numbers which has the largest sum. 
 */
public class Maximum_subarray_problem {
	public int maxScan(int[] array) {
		if (array.length == 0)
			return -1;
		else if (array.length == 1)
			return array[0];
		else {
			int maxSum = array[0];
			int current_max = array[0];
			for (int i = 1; i < array.length; i++) {
				current_max = Math.max(array[i], current_max + array[i]);
				maxSum = Math.max(maxSum, current_max);
			}
			return maxSum;
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, 5, -1, -2, 2, 3, -1, 2, -2 };
		Maximum_subarray_problem obj = new Maximum_subarray_problem();
		System.out.println(obj.maxScan(arr));
	}
}
