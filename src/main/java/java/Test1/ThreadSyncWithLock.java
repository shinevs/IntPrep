package Test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSyncWithLock {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		myThread tObj = new myThread();
		tObj.setId(1);
		Thread t1 = syncProcess(lock, condition, 1, 2, tObj);
		Thread t2 = syncProcess(lock, condition, 2, 3, tObj);
		Thread t3 = syncProcess(lock, condition, 3, 1, tObj);
		t1.start();
		t2.start();
		t3.start();
	}

	static class myThread {
		int id;

		public synchronized int getId() {
			return id;
		}

		public synchronized void setId(int id) {
			this.id = id;
		}

	}

	public static Thread syncProcess(final Lock lock, final Condition condition, final int thisTid, final int nextTid,
			final myThread tObj) {
		Thread t = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (true) {
						try {
							while (thisTid != tObj.getId())
								condition.await();
							System.out.println(tObj.getId());
							tObj.setId(nextTid);
							condition.signalAll();
						} catch (InterruptedException e) {
							System.out.println(e);
						}
					}
				} finally {
					lock.unlock();
				}
			}
		};
		return t;
	}
}
