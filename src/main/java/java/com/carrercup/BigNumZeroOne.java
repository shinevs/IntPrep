/*
 * 
 * Given 2D Array of only 0s and 1s, Find the row which gives max decimal value. 

Input: int array[3][3] = {{0,1,0,}{1,1,0},{1,0,1}}; 
Output : 2(second row)...decimal value is 6


 */

package com.carrercup;

public class BigNumZeroOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigNumZeroOne obj = new BigNumZeroOne();
		obj.findBigNum();
	}

	public void findBigNum() {

		int[][] a = new int[][] { { 0, 1, 0 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int max = 0;
		int position = 0;
		for (int i = 0; i < a.length; i++) {
			String s = "";
			for (int j = 0; j < a[i].length; j++)
				s += a[i][j];
			int value = Integer.parseInt(s, 2);
			if (max < value) {
				max = value;
				position = i + 1;
			}

		}
		System.out.println("Position:" + position + "value:" + max);
	}
}
