package Test1;

class abc implements Cloneable {
	public void print() {
		System.out.println("ABC");
		abc obj = new abc();
		try {
			abc xyz = (abc) obj.clone();
		} catch (CloneNotSupportedException c) {
			System.out.println(c);
		}
	}
}

public class Worker extends abc implements Cloneable {
	int salary;

	public static void main(String args[]) {
		Worker work1 = new Worker();
		work1.salary = 3000;
		try {
			Worker work2 = (Worker) work1.clone();
			System.out.println("After cloning, work2 salary: " + work2.salary); // 3000
			work1.salary = 4000; // change work1 salary
			System.out.println("After changing work1 salary, work2 salary: " + work2.salary); // 3000
			work2.salary = 5000; // now change work2 salary
			System.out.println("After changing work2 salary, work1 salary: " + work1.salary); // 4000
			// let us see the hash codes
			System.out.println("Hash code of work1: " + work1.hashCode());
			System.out.println("Hash code of work2: " + work2.hashCode());
		} catch (CloneNotSupportedException e) {
			System.out.println("Check your class implemented Cloneable interface. " + e);
		}
	}
}
