
class ThreadSampleRun implements Runnable {
	public static volatile Integer count = 0;

	public void run() {
		try {
			while (ThreadSampleRun.count <= 10) {
				System.out.println("sample run " + (++ThreadSampleRun.count));
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Exception in run" + e);

		}

	}
}

public class ThreadSample {
	public static void main(String[] args) {

		ThreadSampleRun ts = new ThreadSampleRun();
		Thread t = new Thread(ts);
		t.start();
		while (ThreadSampleRun.count <= 10) {
			try {
				System.out.println("sample " + (++ThreadSampleRun.count));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Exception in run" + e);

			}
		}

	}

}
