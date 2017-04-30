package com.test.finalList;

import com.carrercup.QuickSort;

public class MyQuickSort {
	private int array[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	void quickSort(int i, int j) {
		int lowIndex = i;
		int highIndex = j;
		int pivotal = array[lowIndex + (highIndex - lowIndex) / 2];
		while (i < j) {
			while (array[i] < pivotal) {
				i++;
			}
			while (array[j] > pivotal) {
				j--;
			}
			if (i < j) {
				swap(i, j);
				i++;
				j--;
			}
			if (lowIndex < j)
				quickSort(lowIndex, j);
			if (highIndex > i)
				quickSort(i, highIndex);
		}
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}