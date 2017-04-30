package Test.java;

public class MyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int i) {
			data = i;
			next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void print() {
		Node headNode = head;
		System.out.println("print it");
		while (headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList llist = new MyLinkedList();
		llist.push(3);
		llist.push(4);
		System.out.println("added" + llist.head.data);
		llist.print();
	}

}
