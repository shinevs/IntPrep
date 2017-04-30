import java.awt.Point;

/*
 * In Java, Objects are passed by reference, and primitives are passed by value.

This is half incorrect. Everyone can easily agree that primitives are passed by value; there's no such thing in Java as a pointer/reference to a primitive.

However, Objects are not passed by reference. A correct statement would be Object references are passed by value.


 */
public class pass_by_ref {
	public static void swap(Integer i, Integer j, Point P1, String s1) {
		// Integer temp = new Integer(i);
		P1.x = 100;
		i = 100;
		s1 = "xyz";

		// i = j;
		// j = temp;
	}

	public static void swap2(Integer i, Integer j) {
		i = 20;
		j = 10;
	}

	public static void main(String[] args) throws java.lang.Exception {
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		Point p1 = new Point(0, 0);
		String s1 = "abcd";
		swap(i, j, p1, s1);
		System.out.println("i = " + i + ", j = " + j);
		swap2(i, j);
		System.out.println("i = " + i + ", j = " + j);
		System.out.println(p1.x + " " + s1);

	}
}