//check the number of braces are equal for closing and opening
package com.carrercup;

import java.util.Stack;

public class CheckBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBraces obj = new CheckBraces();
		System.out.println(obj.checkBraces("{{[()()()]}}"));
	}

	private boolean checkBraces(String str) {
		Stack<Character> stack1 = new Stack<Character>();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				stack1.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				if (stack1.isEmpty())
					return false;
				if (!checkClosedBracket(str.charAt(i), stack1.pop())) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkClosedBracket(char a, char b) {
		if ((a == '}' && b == '{') || (a == ']' && b == '[') || (a == ')' && b == '('))
			return true;
		else
			return false;

	}
}
