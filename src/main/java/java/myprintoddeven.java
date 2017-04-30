class printnow {
	public synchronized void printit(String msg) {
		try {
			if (msg.equals("odd")) {
				for (int i = 0; i < 10; i += 2) {
					System.out.println("odd" + i);
					Thread.sleep(1000);
					notify();
					wait();
				}
			} else {
				for (int i = 1; i < 10; i += 2) {
					System.out.println("even" + i);
					Thread.sleep(1000);
					notify();
					wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class even extends Thread {
	printnow oddeven;

	public even(printnow oddeven) {
		this.oddeven = oddeven;
	}

	public void run() {
		oddeven.printit("even");
	}
}

class odd extends Thread {
	printnow obj;

	public odd(printnow obj1) {
		this.obj = obj1;
	}

	public void run() {
		obj.printit("odd");
	}

}

public class myprintoddeven {
	public static void main(String[] args) {
		printnow obj = new printnow();// only one object
		even t1 = new even(obj);
		odd t2 = new odd(obj);
		t1.start();
		t2.start();
		System.out.println("Main thread (almost) finished");
	}

}
