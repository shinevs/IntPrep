//How to find largest of three integers in Java?

//Read more: http://javarevisited.blogspot.com/2011/06/top-programming-interview-questions.html#ixzz3PNhA5QUa

public class Bigof3Numbers {
	public int addition(int a, int b, int c) {
		return (a > b) ? (a > c ? a : c) : (b > c ? b : c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		int c = 12;
		Bigof3Numbers obj = new Bigof3Numbers();
		int op = obj.addition(a, b, c);
		System.out.println("OP" + op);
	}

}