package com.carrercup;

public class myBinaryTree {
	Node Root = null;

	public static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (Root == null) {
			Root = newNode;
			return;
		} else {
			Node current = Root;
			Node parent = null;
			while (true) {
				if (current.data < data) {
					parent = current;
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				} else {
					parent = current;
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						// current = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(" " + root.data);
			inOrder(root.right);
		}
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(" " + root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" " + root.data);
		}
	}

	public static void main(String arg[]) {
		myBinaryTree b = new myBinaryTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.inOrder(b.Root);
		System.out.println();
		b.preOrder(b.Root);
		System.out.println();
		b.postOrder(b.Root);
	}

}
