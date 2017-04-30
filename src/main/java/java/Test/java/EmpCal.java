package Test.java;

import java.util.Arrays;

public class EmpCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] calendar = new Employee[4];
		Employee e1 = new Employee("Bob1", 1, true);
		calendar[0] = e1;
		Employee e2 = new Employee("Bob1", 2, false);
		calendar[1] = e2;
		Employee e3 = new Employee("Bob1", 3, true);
		calendar[2] = e3;
		Employee e4 = new Employee("Bob1", 4, false);
		calendar[3] = e4;
		Arrays.sort(calendar);
		int count = 0;
		for (int i = 0; i < calendar.length; i++) {
			if (calendar[i].isStart)
				count++;
			else
				count--;
			if (count == 0 && ((i + 1) < calendar.length) && (calendar[i + 1].getTime() - calendar[i].getTime() > 0)) {
				System.out.println(calendar[i + 1].getTime() - calendar[i].getTime() + " " + calendar[i + 1].getTime()
						+ " " + calendar[i].getTime());
				break;
			}
		}
	}

}

class Employee implements Comparable<Employee> {
	String Name;
	Integer time;

	public synchronized String getName() {
		return Name;
	}

	public synchronized void setName(String name) {
		Name = name;
	}

	public synchronized Integer getTime() {
		return time;
	}

	public synchronized void setTime(Integer time) {
		this.time = time;
	}

	public synchronized boolean isStart() {
		return isStart;
	}

	public synchronized void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	boolean isStart;

	public Employee(String name, Integer te, boolean flag) {
		this.Name = name;
		this.time = te;
		this.isStart = flag;
	}

	public int compareTo(Employee e) {
		return this.time > e.time ? 1 : (this.time < e.time ? -1 : 0);
	}
}