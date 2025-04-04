package com.sec07.mytest;

public class DD extends BB {
	private int d;
	
	public DD() {
		System.out.println("DD 기본 생성자");
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	@Override
	public int getRes() {
		return super.getRes() * d;
	}
	
//	public static void main(String[] args) {
//		DD d1 = new DD();
//		d1.setA(100);
//		d1.setB(50);
//		d1.setC(5);
//		d1.setD(2);
//		System.out.println("result : "+d1.getRes());
//	}
}
