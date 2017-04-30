package com.carrercup;

import java.util.Random;

//we need to model two armies that are battling
//there needs to be output to the console declaring victory, and peferrably blow by blow
//there needs to be an element of randomness in the program

public class Battle {

	public static void main(String[] args) {

		Army a = new Army(100);
		Army b = new Army(200);

		while (a.numberOfSoilders > 0 && b.numberOfSoilders > 0) {

			Battle.fight(a, b);

			if (a.numberOfSoilders == 0) {
				System.out.println("Army B wins");
			} else if (b.numberOfSoilders == 0) {
				System.out.println("Army A wins");
			}

		}

	}

	public static void fight(Army a, Army b) {
		Random r = new Random();
		int val = r.nextInt() % 2;
		if (val == 1) {
			b.numberOfSoilders--;
		} else {
			a.numberOfSoilders--;
		}

	}
}

class Army {

	public int numberOfSoilders;

	public Army(int n) {
		this.numberOfSoilders = n;
	}

}