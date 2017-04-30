package com.carrercup;

import java.awt.Point;

public class ChessDiagonalMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessDiagonalMove obj = new ChessDiagonalMove();
		Point a = new Point(1, 7);
		Point b = new Point(6, 2);
		obj.move(a, b);
		// 2,5
		// 2,4

	}

	public int move(Point S, Point M) {
		if (S.x == M.x && S.y == M.y) {
			System.out.println("both are same point");
			return 0;
		} else if (S.x == M.x) {
			if ((S.y % 2) == (M.y % 2)) {
				System.out.println("it is in the same color, so two move");
				return 2;
			} else {
				System.out.println("it is in different color");
				return -1;
			}
		} else if (S.y == M.y) {
			if ((S.x % 2) == (M.x % 2)) {
				System.out.println("it is in the same color, so two move");
				return 2;
			} else {
				System.out.println("it is in different color");
				return -1;
			}
		} else if (Math.abs(S.x - M.x) == Math.abs(S.y - M.y)) {
			System.out.println("it is in diagonal , return 1");
			return 1;
		} else
			return 2;
	}
}
