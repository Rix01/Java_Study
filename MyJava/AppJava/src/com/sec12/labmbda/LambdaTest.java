package com.sec12.labmbda;

public class LambdaTest {

	// 함수형 인터페이스 체크
	@FunctionalInterface
	interface Fun01 {
		public String prn(String name); // 매개인자 메소드
	}

	interface Fun02 {
		public String prn02(); // 매개인자 없는 메소드
	}

	interface Fun03 {
		public void say(String name); // 문자열 받아서 출력하는 메소드
	}

	public static void main(String[] args) {
		Fun01 m_name = n -> "hello!!" + n; // (name)을 생략
		System.out.println("m_name: " + m_name.prn("홍길동"));

		Fun02 m_test = () -> "테스트";
		System.out.println("m_test: " + m_test.prn02());

		Fun03 m_test03 = (name) -> System.out.println("m_test03: " + name);
		m_test03.say("정길동");
	}

}
