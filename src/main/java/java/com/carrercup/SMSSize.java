package com.carrercup;

public class SMSSize {
	public static void main(String[] args) {
		String myString = "My Name is Shine, i would like to take ticket today";
		SMSSize obj = new SMSSize();
		obj.spitSMS(myString);
	}

	public void spitSMS(String input) {
		String[] arr = input.split(" ");
		// int i=0;
		String result = null;
		String finalResult = "";
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && finalResult.length() + arr[i].length() > 15) {
				System.out.println(finalResult);
				finalResult = "";
			}
			finalResult += arr[i] + " ";
			// System.out.println(arr[i]);
		}
		if (finalResult.length() > 0) {
			System.out.println(finalResult);
		}

	}
}
