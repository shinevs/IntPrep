package Test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollSortSample {
	public static void main(String[] args) {
		Order o1 = new Order(1, "Shine", 10);
		Order o2 = new Order(2, "Name1", 20);
		Order o3 = new Order(3, "Name2", 15);
		List<Order> l1 = new ArrayList<Order>();
		l1.add(o1);
		l1.add(o2);
		l1.add(o3);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1, new Order.orderByName());
		System.out.println(l1);
		Collections.sort(l1, new Order.orderByValue());
		System.out.println(l1);
	}

}

class Order implements Comparable<Order> {
	int orderId;
	String name;
	int value;

	public Order(int orderId, String name, int value) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.value = value;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int compareTo(Order o) {
		return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1 : 0);
	}

	public static class orderByName implements Comparator<Order> {

		public int compare(Order o1, Order o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}

	}

	public static class orderByValue implements Comparator<Order> {

		public int compare(Order o1, Order o2) {
			// TODO Auto-generated method stub
			return o1.value > o2.value ? 1 : (o1.value < o2.value ? -1 : 0);
		}

	}

	@Override
	public String toString() {
		return String.valueOf(orderId);
	}
}