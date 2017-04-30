/*
 * 
 * Write a method that takes in a positive integer, return the number of 2s between 0 and the input number. 

If the input value given is 13, it should return 2 as the number 2 and 12 are between 0 and 13. 

If the input value given is 21, it should return 3 as the number 2,12 and 20 are between 0 and 21.


 * 
 */
package com.carrercup;

public class TwoBtwNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoBtwNumber obj = new TwoBtwNumber();
		obj.FindTwo(22);
		obj.FindTwoAnotherWay(22);
	}

	public void FindTwo(int value) {
		String sValue = null;
		char two = '2';
		for (int i = 2; i <= value; i++) {
			sValue = String.valueOf(i);
			if (sValue.contains("2"))
				System.out.println(sValue);
		}
	}

	public void FindTwoAnotherWay(int a) {
		int k, b;
		while (a > 0) {
			b = a;
			while (b > 0) {
				k = b % 10;
				if (k == 2) {
					System.out.print(a + " ");
					break;
				}
				b = b / 10;
			}
			a--;
		}
	}
}
