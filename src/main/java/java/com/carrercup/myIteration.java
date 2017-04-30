package com.carrercup;

import java.util.Iterator;

class MyCollection<E> implements Iterable<E> {

	public Iterator<E> iterator() {
		return new MyIterator<E>();
	}
}

class MyIterator<T> implements Iterator<T> {
	T t;

	public boolean hasNext() {

		// implement...
		return true;
	}

	public T next() {
		// implement...;
		return t;
	}

	public void remove() {
		// implement... if supported.
	}
}

public class myIteration {
	public static void main(String[] args) {
		MyCollection<String> stringCollection = new MyCollection<String>();

		for (String string : stringCollection) {

		}
	}
}
