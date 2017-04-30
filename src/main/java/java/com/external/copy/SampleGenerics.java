package com.external.copy;

public class SampleGenerics {

	public static <E> void sampleGen(E[] array) {
		for (E ele : array) {
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3 };
		String[] strArray = { "abc", "xyz" };
		sampleGen(intArray);
		System.out.println("next string");
		sampleGen(strArray);
	}

}
