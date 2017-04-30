package Test.java;

class A {
	A get() {
		System.out.println("A get");
		return this;
	}

	public Integer abc() {
		return 1;
	}
}

class B2 extends A {
	B2 get() {
		System.out.println("welcome to covariant return type");
		return this;
	}

	public Integer abc() { // try return type String it will throw error
		return 2;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String[] args) {

		A a = new B2();
		a.get();
		new B2().get().message();

	}
}