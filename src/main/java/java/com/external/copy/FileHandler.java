package com.external.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandler {
	public static void main(String[] args) throws Exception {
		String srcfile = "/Users/shine/Documents/Java/srcfile";
		String destnfile = "/Users/shine/Documents/Java/destnfile";
		BufferedWriter out1 = new BufferedWriter(new FileWriter(srcfile));
		out1.write("string to be copied\n");
		out1.close();
		InputStream in = new FileInputStream(new File(srcfile));
		OutputStream out = new FileOutputStream(new File(destnfile));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader(destnfile));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}
}
