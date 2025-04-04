package com.sec03;

class Test {
	private int a;
	private int b;

	// setter - void
	public void setA(int a) {
		this.a = a; // 전달 및 변경
	}

	public void setB(int b) {
		this.b = b;
	}

	// getter
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}

public class MTest {

	public static void main(String[] args) {
		Test m = new Test();
		Test m1 = new Test();
		Test m2 = new Test();
		
		System.out.println("각 주소를 출력해보자");
		System.out.println(m.toString() + "\t" + m);
		System.out.println(m1.toString() + "\t" + m1);
		System.out.println(m2.toString() + "\t" + m2);
		
		System.out.printf("m   a = %5d, b = %5d\n", m.getA(), m.getB());
		System.out.printf("m1  a = %5d, b = %5d\n", m1.getA(), m1.getB());
		System.out.printf("m2  a = %5d, b = %5d\n", m2.getA(), m2.getB());
	}

}
