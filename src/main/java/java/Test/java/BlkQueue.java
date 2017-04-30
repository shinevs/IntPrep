package Test.java;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
	private BlockingQueue bq = null;

	public Producer(BlockingQueue bq) {
		this.bq = bq;
	}

	public void run() {
		try {
			bq.put(1);
			System.out.println("111");
			Thread.sleep(10);
			System.out.println(222);
			bq.put("ab");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue bq = null;

	public Consumer(BlockingQueue bq) {
		this.bq = bq;
	}

	public void run() {
		try {
			System.out.println(bq.take());
			System.out.println(bq.take());
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}

public class BlkQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue bq = new ArrayBlockingQueue(1024);
		Producer pObj = new Producer(bq);
		Consumer cObj = new Consumer(bq);
		new Thread(pObj).start();
		new Thread(cObj).start();
	}

}
