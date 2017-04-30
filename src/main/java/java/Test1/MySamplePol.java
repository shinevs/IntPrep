package Test1;

class A implements Cloneable {
	public A() {

	}

	void print() {
		System.out.println("Class A");
	}
}

class B extends A implements Cloneable {
	void print() {
		System.out.println("Class B");
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			// either handle the exception or throw it
			return null;
		}
	}
}

public class MySamplePol implements Cloneable {

	public void print() {
		System.out.println("Class B");
	}

	B obj = new B();
	B obj1 = (B) obj.clone();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
