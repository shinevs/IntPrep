package com.test.finalList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class producer implements Runnable {
	BlockingQueue bq = null;

	public producer(BlockingQueue q) {
		this.bq = q;
	}

	public void run() {
		try {
			bq.put(1);
			Thread.sleep(10);
			System.out.println("before 2");
			try {
				System.out.println("before 2");
				bq.put(2);
				System.out.println("before 3");
				bq.put(3);
				System.out.println("after writting 3");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class consumer implements Runnable {
	BlockingQueue bq = null;

	public consumer(BlockingQueue q) {
		this.bq = q;
	}

	public void run() {
		try {
			System.out.println(bq.take());
			System.out.println("before reading 2");
			System.out.println(bq.take());
			System.out.println("after reading 2");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class BlockingQueueDemo {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		BlockingQueue bq = new ArrayBlockingQueue(1024);
		producer pObj = new producer(bq);
		consumer cObj = new consumer(bq);
		new Thread(pObj).start();
		new Thread(cObj).start();
	}

}