package Test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreeThreadImpl {

	public static class myThread {
		int id;

		public synchronized int getId() {
			return id;
		}

		public synchronized void setId(int id) {
			this.id = id;
		}
	}

	public static Thread mySync(final Lock lock, final Condition condition, final int thisId, final int nextId,
			final myThread obj) {
		Thread myThread = new Thread() {
			public void run() {
				while (true) {
					try {
						lock.lock();
						if (thisId != obj.id)
							condition.await();
						else {
							System.out.println(obj.id);
							obj.setId(nextId);
							condition.signalAll();
						}
					} catch (Exception e) {
						System.out.println(e);
					} finally {
						lock.unlock();
					}
				}
			}
		};
		return myThread;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		myThread tObj = new myThread();
		tObj.setId(1);
		Thread t1 = mySync(lock, condition, 1, 2, tObj);
		Thread t2 = mySync(lock, condition, 2, 3, tObj);
		Thread t3 = mySync(lock, condition, 3, 1, tObj);
		t1.start();
		t2.start();
		t3.start();
	}

}
