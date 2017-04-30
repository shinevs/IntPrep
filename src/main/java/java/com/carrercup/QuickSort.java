package com.carrercup;

public class QuickSort {
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

	void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivotal = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// System.out.println("pivotal" + pivotal);
		while (i <= j) {
			while (array[i] < pivotal) {
				i++;
			}
			while (array[j] > pivotal) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
			if (lowerIndex < j) {
				quickSort(lowerIndex, j);
			}
			if (i < higherIndex) {
				quickSort(i, higherIndex);
			}

		}
	}

	private void swap(int i, int j) {
		System.out.println(array[i] + ":" + array[j]);
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
