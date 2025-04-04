package com.test;

abstract class ABC {
	public abstract void prn();

	public abstract void display();
}

class XX extends ABC {
	@Override
	public void prn() {
		System.out.println("XX의 prn");
	}

	@Override
	public void display() {
		System.out.println("XX의 display");
	}
}

class YY extends ABC {
	@Override
	public void prn() {
		System.out.println("YY의 prn");
	}

	@Override
	public void display() {
		System.out.println("YY의 display");
	}
}

public class MTest {
	public static void view(ABC obj) {
		// 하나의 부모타입을 통해 여러 자식 객체를 참조할 수 있도록 하는 개념
		// 메소드를 오버라이딩 해서 실행 시점에서 객체의 실제 타입에 따라 적절한 메소드가 실행되도록 한다.
		switch (obj) {
		case XX xx -> {
			xx.display();
			xx.prn();
		}
		case YY yy -> {
			yy.display();
			yy.prn();
		}
		default -> System.out.println("알 수 없는 타입이야");
		}
//		obj.display();
//		obj.prn();
	}

	public static void main(String[] args) {
		ABC a1 = new XX();
		ABC a2 = new YY();

		view(a1);
		view(a2);
		// 밑 형태는 매우 비추. 메모리 형태가 다름.
		// XX x1 = new XX();
		// YY y1 = new YY();
	}
}
