package com.carrercup;

public class CoinPermutations {
	/*
	 * int howManyWays(int total) { int a, ra, b, rb, ways = 0;
	 * 
	 * for (a = total / 25; a >= 0; --a) { ra = total - 25 * a; for (b = ra /
	 * 10; b >= 0; --b) { rb = ra - 10 * b; ways += rb / 5 + 1; } }
	 * 
	 * return ways; }
	 */

	void printAllWays(int total) {
		int a, ra, b, rb, c, rc;
		for (a = total / 25; a >= 0; --a) {
			ra = total - 25 * a;
			for (b = ra / 10; b >= 0; --b) {
				rb = ra - 10 * b;
				for (c = rb / 5; c >= 0; --c) {
					rc = rb - 5 * c;
					System.out.println(a + " quarters," + b + " nickels," + c + " dimes," + rc + " pence\n");
				}
			}
		}
	}

	public static void main(String[] args) {

		final int[] coins = new int[] { 1, 5, 10, 25 };
		// System.out.println(getCoinCombinations(0, coins, 78));
		CoinPermutations obj = new CoinPermutations();
		obj.printAllWays(78);
	}
}
