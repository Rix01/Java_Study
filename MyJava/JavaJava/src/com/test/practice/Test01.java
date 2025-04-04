package com.test.practice;

import java.util.ArrayList;
import java.util.Set;

class Zoo<T, U>{
	ArrayList<T> bears = new ArrayList<>();
	ArrayList<U> rabbits = new ArrayList<>();
	
	public void feed(T meat, U vegetable) {
		bears.add(meat);
		rabbits.add(vegetable);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Zoo<String, String> zoo1 = new Zoo<>();
		zoo1.feed("닭", "당근");
		System.out.println(zoo1.bears.get(0));
		System.out.println(zoo1.rabbits.get(0));
		
		ArrayList<Set<String>> list = new ArrayList<Set<String>>();
	}
}
