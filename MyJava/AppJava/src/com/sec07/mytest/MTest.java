package com.sec07.mytest;

// 생성자 확인
public class MTest {

	public static void main(String[] args) {
		AA a1 = new DD();
		BB b1 = new DD();
		BB b2 = new BB();
		AA a2 = new BB();
//		check_instance(a1);
//		check_instance(b1);
//		check_instance(b2);
		check_instance(a2);
	}
	
	public static void check_instance(AA obj) {
		if(obj instanceof DD) {
			System.out.println("객체는 DD 클래스의 인스턴스이다.");
		}
		
		if(obj instanceof BB) {
			System.out.println("객체는 BB 클래스의 인스턴스이다.");
		}
		
		if(obj instanceof AA) {
			System.out.println("객체는 AA 클래스의 인스턴스이다.");
		}
	}

}
