import java.util.Enumeration;
import java.util.Vector;

public class passByReference {
	public static void pass(Integer a) {
		a = 10;
		System.out.println("value:" + a);
		// System.gc ();
		// System.runFinalization ();
	}

	public static void passarr(Integer a[]) {
		a[0] = 2;
	}

	passByReference a = new passByReference();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 2;
		pass(a);
		System.out.println("value:" + a);
		Integer arr[] = { 1, 2, 3 };
		passarr(arr);
		System.out.println(arr[0]);
		Vector v = new Vector(3, 2);
		v.addElement(new String("abc"));
		v.addElement(new Integer(1));
		Enumeration vEnum = v.elements();
		v.addElement(a);
		System.out.println("\\nElements in vector:");
		while (vEnum.hasMoreElements()) {
			System.out.print(vEnum.nextElement() + " ");
			// System.out.println();

		}
	}

}
