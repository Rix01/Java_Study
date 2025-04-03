package com.sec07.exam;

public class AA {
	private int a;
	private int b;
	
	public AA() {
		System.out.println("AA 기본 생성자");
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	// 패키지 상관 없이 상속받으면 우리끼리 사용 가능
	// protected = default + 상속시 우리끼리
	int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getHap() {
		return a+b;
	}
}
