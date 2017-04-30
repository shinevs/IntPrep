package com.carrercup;

/*
 * 
 * Given predicted stock prices for next n days for a stock e.g : 10, 30, 42, 15, 20, 50, 10, 25 find the maximum profit that can be made with a single buy-sell transaction. If no profit can be made return 0. 
 * 
 * 
 */
public class BuySellShare {
	public static void main(String[] args) {
		BuySellShare obj = new BuySellShare();
		int[] num = { 40, 10, 20, 17, 56, 40, 5, 5, 5, 40 };
		// System.out.println(Arrays.toString(num)); // Arrays.deepToString(a)
		// if it is an object ( Integer instead of int )
		obj.becomeABillionaire(num);
	}

	static void becomeABillionaire(int arr[]) {
		int i = 0, buy = 0, sell = 0, min = 0, profit = 0;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] < arr[min])
				min = i;
			else if (arr[i] - arr[min] > profit) {
				buy = min;
				sell = i;
				profit = arr[i] - arr[min];
			}

		}

		System.out.println(
				"We will buy at : " + arr[buy] + " sell at " + arr[sell] + " and become billionaires worth " + profit);

	}
}
