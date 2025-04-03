package com.sec09;

public class A_Test {
	public static void main(String[] args) {
		int a = 100;
		int b = 3;
		int res = 0;
		try{
			res = a / b;
		} catch(ArithmeticException ae) {
			System.out.println("예외처리 했어 : "+ ae.getMessage());
		} catch (RuntimeException re) {
			System.out.println("또다른 경우 RuntimeException");
		} catch (Exception e) {
			System.out.println("또다른 경우 Exception");
		} finally {
			System.out.println("반드시 수행해야 할 구문");
		}
		System.out.printf("a=%d b=%d res=%d\n", a, b, res);

	}
}
