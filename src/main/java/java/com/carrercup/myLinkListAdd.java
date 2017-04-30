package com.carrercup;

/* shine vs: (1 -> 5 -> 6) + (8 -> 9 -> 5) = (1 -> 0 - > 5 -> 1) (156+895 = 1051)
using doubly link list
*/

class myLinkList {
	private Node head = null;
	private Node tail = null;

	class Node {
		int data;
		Node next;
		Node prev;
	}

	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void listAdd(myLinkList l1, myLinkList l2) {
		myLinkList addList = new myLinkList();
		Node n1 = l1.tail;
		Node n2 = l2.tail;
		while (n1 != null && n2 != null) {
			int value = n1.data + n2.data;
			// while(

		}

	}

	public static void main(String[] args) {
		myLinkList list1 = new myLinkList();
		list1.add(1);
		list1.add(5);
		list1.add(6);
		myLinkList list2 = new myLinkList();
		list2.add(8);
		list2.add(9);
		list2.add(5);
	}
}