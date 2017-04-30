
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Singleton utility
 * 
 * @author palash.k
 * 
 */
class Singleton implements Cloneable, Serializable {
	/**  
	 *   
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Private variable to hold the instance of the Singleton object
	 */
	private static Singleton instance;

	/**
	 * Private constructor to block instantiation using new and Class.forName()
	 */
	private Singleton() {
		// Dummy constructor
	}

	/**
	 * Instantiates this class if object is not available and returns the
	 * instance
	 * 
	 * @return the singleton instance
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				// Double checked thread locking
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton class cannot be cloned");
	}

	/**
	 * This also returns the instance of the single ton class. Which ensures
	 * singleton behavior through deserialization.
	 * 
	 * @return the instance of Singleton
	 */
	public final Object readObject() {
		return getInstance();
	}
}

/**
 * Class to get Singleton instance
 * 
 * @author palash.k
 * 
 */
class TrySingletonThread implements Runnable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + " got singleton with ID: " + Singleton.getInstance().hashCode());
	}
}

/**
 * Singleton test
 * 
 * @author palash.k
 * 
 */
public class NewSingleton {
	public static void main(String args[]) throws IOException {
		// We'll try all possibilities. We can not use new keyword here. Trying
		// others.
		// Try Class.forName()
		int i = 0;
		try {
			@SuppressWarnings("unused")
			Singleton singleton = (Singleton) Class.forName("main.Singleton").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Singleton singleton = Singleton.getInstance();
		FileOutputStream fileOut = new FileOutputStream("singleton.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(singleton);
		out.close();
		fileOut.close();
		// Try deserialization
		try {
			FileInputStream fileIn = new FileInputStream("singleton.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton = (Singleton) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Try clone
		try {
			@SuppressWarnings("unused")
			Singleton singleton2 = (Singleton) singleton.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Try multi-threading
		while (i < 10) {
			Thread t = new Thread(new TrySingletonThread());
			t.setName("Thread - " + i);
			t.start();
			i++;
		}
	}
}