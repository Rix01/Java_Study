package com.sec03;

public class MyClass {
	private int a;
	
	public MyClass() {
		System.out.println("나 기본 생성자야 ~~");
	}
	
	public MyClass(int a) {
		this.a = a;
		System.out.println("오버로드 생성자 "+this.a);
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass(100);
	}

}
