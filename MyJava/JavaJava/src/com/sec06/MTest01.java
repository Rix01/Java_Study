package com.sec06;

record Person(String name, int age) {
}

public class MTest01 {
	public static void main(String[] args) {
		Person[] people = { new Person("Alice", 30), new Person("Bob", 25) };
		System.out.println(people);
	}
}
