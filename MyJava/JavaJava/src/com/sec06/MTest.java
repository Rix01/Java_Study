package com.sec06;

record Address(String name, String addr, String tel) {
	
}

public class MTest {

	public static void main(String[] args) {
		Address a1 = new Address("홍길동", "서울", "02-000");
		System.out.println(a1.tel());

	}

}
