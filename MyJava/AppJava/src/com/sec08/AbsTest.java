package com.sec08;

abstract class My{	// new My() 객체 생성 안 한다. => 후손인 클래스가 메모리에 할당해줘
	public void prn() {
		System.out.println("나 추상의 멤버야 My's prn");
	}
	public abstract void disp();	// {}가 없는 선언만 되어 있는 추상 메소드
}

class MyTest extends My{	
	// 1. 추상 클래스를 상속 받은 후손 클래스는 추상 클래스의 추상 메소드를 반드시 정의해야 한다.
	// 2. 재정의하지 않으면 추상 클래스가 된다. => new 객체 생성 불가능
	@Override
	public void disp() {
		System.out.println("그래 난 강제로 정의한 MyTest의 disp");
	}
}


public class AbsTest {
	public static void main(String[] args) {
//		My m = new My(); -> 추상 클래스는 new 객체 생성 불가능
		MyTest m = new MyTest();
		m.prn();
		m.disp();
		
		My res = new MyTest();
		res.disp();
		res.prn();
	}
}
