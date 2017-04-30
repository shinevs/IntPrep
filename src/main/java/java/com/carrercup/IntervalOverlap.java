package com.carrercup;
/*
 * An interval is represented as a combination of start time and end time. 
 * Given a set of intervals, check if any two intervals overlap.
 *  Input: arr[ ]={{1,3},{5,7},{2,4},{6,8}} Output: True. 
 *  The intervals {1,3}and {2,4} overlap. Input: arr[ ]={{1,3},{7,9},{4,6},{10,13}}
 *   Output: false No pair of intervals overlap

 */

public class IntervalOverlap {
	public static void main(String[] args) {
		IntervalOverlap obj = new IntervalOverlap();
		int arr[][] = { { 1, 3 }, { 5, 7 }, { 2, 4 }, { 6, 8 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i != j)
					System.out.println(obj.findOverlap(arr[i], arr[j]));
			}
		}
		System.out.println(obj.findOverlap(arr[0], arr[2]));
	}

	boolean findOverlap(int[] a, int[] b) {
		if ((a[0] >= b[0] && a[0] < b[1]) || (a[1] >= b[0] && a[1] < b[1]))
			return true;
		else
			return false;
	}
}
