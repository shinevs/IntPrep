package com.external.copy;

///how to check a number is power of two
public class PowerOf2Test {

	public static void main(String args[]) {

		int[] numbers = { 0, 1, 2, 6, 8 };

		for (int num : numbers) {
			System.out.println("powerOfTwo()-- is " + num + " power of two in Java :" + powerOfTwo(num));
		}
	}

	private static boolean powerOfTwo(int number) {
		int square = 1;
		while (number >= square) {
			if (number == square) {
				return true;
			}
			square = square * 2;
		}
		return false;
	}

}