package Test.java;

class MyPrintit {
	volatile int i = 0;

	public synchronized void print(String str) {
		try {
			while (i < 10) {
				if (str.equals("ODD")) {

					System.out.println("Odd" + i);
					i++;
					notify();
					wait();
				} else {

					System.out.println("even" + i);
					i++;
					notify();
					wait();
				}
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class printodd extends Thread {
	MyPrintit obj;

	printodd(MyPrintit obj) {
		this.obj = obj;
	}

	public void run() {
		obj.print("ODD");
	}
}

class printeven extends Thread {
	MyPrintit obj;

	printeven(MyPrintit obj) {
		this.obj = obj;
	}

	public void run() {
		obj.print("Even");
	}
}

public class ThreadSample {

	public static void main(String[] args) {
		MyPrintit obj = new MyPrintit();
		printodd p = new printodd(obj);
		p.start();
		printeven e = new printeven(obj);
		e.start();
	}
}
