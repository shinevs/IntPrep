package com.test.finalList;

class Increment {
	volatile int i = 1;
	volatile boolean flag = true;

	public synchronized void counter(String s) {
		try {
			while (i < 10 && flag) {
				if (s.equals("ODD")) {
					System.out.println("odd" + i++);
					notify();
					wait();
				} else {
					System.out.println("even" + i++);
					notify();
					wait();
				}
				if (i > 9) {
					flag = false;
					Thread.currentThread().interrupt();
				}
			}
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class printOdd implements Runnable {
	Increment Obj;

	public printOdd(Increment obj) {
		this.Obj = obj;
	}

	public void run() {
		// TODO Auto-generated method stub
		Obj.counter("ODD");
	}

}

class printEven implements Runnable {
	Increment Obj;

	public printEven(Increment obj) {
		this.Obj = obj;
	}

	public void run() {
		// TODO Auto-generated method stub
		Obj.counter("Even");
	}

}

public class threadImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increment obj = new Increment();
		printOdd oddObj = new printOdd(obj);
		printEven evenObj = new printEven(obj);
		new Thread(oddObj).start();
		new Thread(evenObj).start();
	}

}
