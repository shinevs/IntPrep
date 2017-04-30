package com.external.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileNew {
	public static void main(String[] args) throws Exception {
		String crfile = "/Users/shine/Documents/Java/crfile";
		String defile = "/Users/shine/Documents/Java/defile";
		BufferedWriter bw = new BufferedWriter(new FileWriter(crfile));
		bw.write("again new file \n");
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(crfile));
		BufferedWriter bwd = new BufferedWriter(new FileWriter(defile));

		String newstr = "";
		while ((newstr = br.readLine()) != null) {
			bwd.write(newstr);
		}
		System.out.println("File written successfully");
		bwd.close();
		br.close();
	}
}
