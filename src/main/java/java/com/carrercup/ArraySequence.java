package com.carrercup;

import java.util.ArrayList;
import java.util.List;

/*
 * 
Check if an integer array is arithmetic sequence. 

Example: 1, 2, 3, 4, 5, 6, 7, 8 => true 
1, 3, 5, 7, 9 => true 

Array may not be sorted.


(max - min)/(len - 1) = difference 
(70 - 10)/(7 - 1) 
60/6 = 10

 */
public class ArraySequence {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7 };
		ArraySequence obj = new ArraySequence();
		obj.FindArithametic(arr);
	}

	public void FindArithametic(int[] arr) {
		int min = arr[0], max = arr[0], count, diff, val;
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		count = arr.length;
		for (int a : arr) {
			aList.add(a);
			if (min > a)
				min = a;
			if (max < a)
				max = a;
		}

		diff = ((max - min) / (count - 1));
		// System.out.println(min + " " + max + " " + diff + " " + count);
		val = min;
		while (count > 0) {
			bList.add(val);
			val += diff;
			count--;
		}
		bList.removeAll(aList);
		// System.out.println(bList.size() + " " + aList.size());
		if (bList.size() == 0)
			System.out.println("arithemetic");
		else
			System.out.println("not ari");
	}
}
