package Test1;
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReader {
	public void fileRead(){

		BufferedReader in1   = new BufferedReader(readFile);
		String readFile = "/Users/shine/Documents/studyJava.txt";
		BufferedReader inPut = new BufferedReader(readFile);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {

		String thisLine = null;
		// BufferedReader br;
		try {
			// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader(new FileReader("/Users/shine/Documents/Java/JavaFileReader.txt"));
			while ((thisLine = br.readLine()) != null) {
				System.out.println(thisLine);
				String[] arr = thisLine.split("\\s+");
				// if (arr[1] != null)
				System.out.println(arr[0] + " " + arr[1]);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}