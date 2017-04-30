package Test.java;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer1 implements Runnable {
	public BlockingQueue bq;

	Producer1(BlockingQueue bq) {
		this.bq = bq;
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			bq.add(1);
			System.out.println("added 1");
			bq.add(2);
			System.out.println("added 2");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class Consumer1 implements Runnable {
	public BlockingQueue bq;

	Consumer1(BlockingQueue bq) {
		this.bq = bq;
	}

	public void run() {
		try {
			System.out.println(bq.take());
			System.out.println("before 2 take");
			System.out.println(bq.take());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class BlockingQ {
	public static void main(String[] ar) {
		BlockingQueue bq = new ArrayBlockingQueue(1024);
		Producer1 p = new Producer1(bq);
		Consumer1 c = new Consumer1(bq);
		new Thread(p).start();
		new Thread(c).start();
	}
}
