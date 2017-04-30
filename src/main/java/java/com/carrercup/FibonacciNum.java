package com.carrercup;

// Find the nth fibonacci number
//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
// 0, 1, 1, 2, 3, 5, 8, 13, 21… and so on
public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNum Obj = new FibonacciNum();
		System.out.println(Obj.fibo(8));
	}

	public int fibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n > 1)
			return fibo(n - 1) + fibo(n - 2);
		else
			return -1;
	}
}
