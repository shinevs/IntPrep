package com.carrercup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {
	String name;
	int id;

	public Employee1(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

public class SelializationImpl {
	public static String fileName = "/Users/shine/Documents/Java/serializeOP";

	public static void read() {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee1 e = (Employee1) ois.readObject();
			System.out.println(e.name);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		try {
			// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oop = new ObjectOutputStream(fos);
			Employee1 emp = new Employee1("Shine", 1163);
			oop.writeObject(emp);
			read();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
