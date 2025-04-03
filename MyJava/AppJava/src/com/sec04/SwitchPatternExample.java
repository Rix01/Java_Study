package com.sec04;

public class SwitchPatternExample {
	public static void main(String[] args) {
		Object obj = "Hello";

		switch (obj) {
		case Integer i -> System.out.println("정수: " + i);
		case String s -> System.out.println("문자열: " + s);
		case Double d -> System.out.println("실수: " + d);
		default -> System.out.println("알 수 없는 타입");
		}
	}
}
