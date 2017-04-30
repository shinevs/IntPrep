package com.carrercup;

public class PowImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4, pow = 4;
		PowImpl obj = new PowImpl();
		System.out.println(obj.powRecursive(num, pow));
	}

	int powRecursive(int num, int pow) {
		if (pow == 0)
			return 1;
		if (pow == 1)
			return num;
		int half = powRecursive(num, pow / 2);
		if (pow % 2 == 0)
			return half * half;
		else
			return half * half * num;
	}

}
