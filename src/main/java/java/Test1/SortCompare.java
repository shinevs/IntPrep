package Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Order implements Comparable<Order> {
	private int orderId;
	private int amount;
	private String customer;

	public Order(int orderId, int amount, String customer) {
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}

	public synchronized int getOrderId() {
		return orderId;
	}

	public synchronized void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public synchronized int getAmount() {
		return amount;
	}

	public synchronized void setAmount(int amount) {
		this.amount = amount;
	}

	public synchronized String getCustomer() {
		return customer;
	}

	public synchronized void setCustomer(String customer) {
		this.customer = customer;
	}

	public int compareTo(Order o1) {
		return this.orderId > o1.orderId ? 1 : (this.orderId < o1.orderId ? -1 : 0);
	}
}

class OrderByCustomer implements Comparator<Order> {
	public int compare(Order o1, Order o2) {
		return o1.getCustomer().compareTo(o2.getCustomer());
	}
}

public class SortCompare {
	private int orderId;
	private int amount;
	private String customer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Order object to demonstrate Sorting of Object in Java
		Order ord1 = new Order(101, 2000, "Sony");
		Order ord2 = new Order(102, 4000, "Hitachi");
		Order ord3 = new Order(103, 6000, "Philips");

		// putting Objects into Collection to sort
		List<Order> orders = new ArrayList<Order>();
		orders.add(ord3);
		orders.add(ord1);
		orders.add(ord2);
		Collections.sort(orders);
		Iterator<Order> orderItr = orders.iterator();
		while (orderItr.hasNext())
			System.out.println(orderItr.next().getOrderId());
		Collections.sort(orders, new OrderByCustomer());
		Iterator<Order> orderItr1 = orders.iterator();
		while (orderItr1.hasNext())
			System.out.println(orderItr1.next().getOrderId());
	}

}
