package Test1;

interface car {
	void carProcess();
}

class BMW implements car {

	public void carProcess() {
		System.out.println("BWM");
	}
}

class Audi implements car {
	public void carProcess() {
		System.out.println("Audi");
	}
}

class CarFactory {
	private String name;
	private car carObj;

	/*
	 * public CarFactory(String name){ this.name=name; }
	 */
	public car getCar(String name) {
		if (name == null)
			return null;
		if (name.equals("BMW")) {
			carObj = new BMW();
			return carObj;
		}
		return null;
	}
}

public class DesignCar {

}
