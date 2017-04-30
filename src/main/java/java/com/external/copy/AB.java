package com.external.copy;

class A {
	private final void print() {
		System.out.println("class a");
	}

	public static void myMethod() {
		System.out.println("Class a static");
	}
}

public class AB extends A {
	public void print() {
		myMethod();
		System.out.println("class b");
	}

	public AB() {
		System.out.println("Protected AB");
	}

	protected void method1() {
		System.out.println("protected method");

	}

	public static void main(String[] args) {
		A a = new AB();
		A a1 = new A();
		AB b = new AB();
		b.print();
	}
}
