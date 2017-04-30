package com.external.copy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CharCompinations {
	public static void main(String[] args) {
		try {
			BufferedReader bread = new BufferedReader(new FileReader(""));
			// ObjectOutputStream oos = new ObjectOutputStream(out);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
