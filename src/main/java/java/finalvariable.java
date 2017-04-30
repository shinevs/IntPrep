
class Test1 {
	final int i = 10;
}

public class finalvariable {
	public static void main(String args[]) {
		final Test1 t1 = new Test1();
		// t1 = new Test1(); will not work
		// t1.i = 30; // will not Works
		Test1 t2 = new Test1();
		// t1 = t2; will not work
		// t2.i = 20; will not work
		// t1.i = t2.i;will not work
		t2 = new Test1(); // it works as the obj is not final
		t2 = t1;
		System.out.println(t1.i + "op" + t2.i);
	}
}
