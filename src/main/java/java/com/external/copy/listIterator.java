package com.external.copy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class myClass {
	String name;
	Integer value;

	myClass(String str, Integer v) {
		this.name = str;
		this.value = v;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

public class listIterator {
	public static void main(String Args[]) {
		Set<String> mySet = new HashSet<String>();
		List<myClass> classList = new LinkedList<myClass>();
		myClass obj1 = new myClass("Shine", 1);
		myClass obj2 = new myClass("abc", 2);
		myClass obj3 = new myClass("xyz", 3);
		classList.add(obj1);
		classList.add(obj2);
		classList.add(obj3);
		for (myClass obj : classList) {
			System.out.println(obj.getName() + obj.getValue());
		}
		System.out.println(classList.size());
		Iterator<myClass> classIterator = classList.iterator();
		while (classIterator.hasNext()) {
			System.out.println(classIterator.next().getName());
		}

	}
}
