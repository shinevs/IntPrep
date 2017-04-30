package com.carrercup;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreeThreadSync {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		myThread objThread = new myThread();
		objThread.setId(1);
		Thread t1 = mySync(lock, condition, 1, 2, objThread);
		Thread t2 = mySync(lock, condition, 2, 3, objThread);
		Thread t3 = mySync(lock, condition, 3, 1, objThread);
		t1.start();
		t2.start();
		t3.start();
	}

	public static class myThread {
		int id;

		public synchronized int getId() {
			return id;
		}

		public synchronized void setId(int id) {
			this.id = id;
		}

	}

	public static Thread mySync(final Lock lock, final Condition condition, final int thisTid, final int nextTid,
			final myThread objThread) {
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					try {
						lock.lock();
						try {
							while (objThread.getId() != thisTid)
								condition.await();
							System.out.println(objThread.getId());
							objThread.setId(nextTid);
							condition.signalAll();
						} catch (InterruptedException e) {
							System.out.println(e);
						}
					} finally {
						lock.unlock();
					}
				}
			}

		};

		return thread;
	}
}
