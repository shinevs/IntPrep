package com.carrercup;

/*
 * 
 * Given an array of ints (positive numbers) find out the index that balances the array. 
 * If no such index exists, return the index that minimizes the difference. 
 * How can you do it by touching each element only once.
 * 
 * 
 * 
 */
public class ArrayBalanceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 10, 22, 2, 8, 23 };
		ArrayBalanceIndex obj = new ArrayBalanceIndex();
		System.out.println(obj.balanceArray(arr));
	}

	public static int balanceArray(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		int leftSum = 0;
		int rightSum = 0;

		while (right > left) {

			if (rightSum >= leftSum) {
				leftSum += arr[left];
				left++;
			} else {
				rightSum += arr[right];
				right--;
			}

		}
		return right;
	}

}
