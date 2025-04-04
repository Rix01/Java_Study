package com.sec07.mytest;

public class MTest01 {
	public static void main(String[] args) {
		DD d1 = new DD();	// (a+b)-c*d =
		System.out.println("초기값 확인 = "+d1.getRes());
		
		prn(d1);
		BB b1 = new BB();
		prn02(b1);	// DD가 없어서 에러가 남.
		
	}
	
	// 정적 바인딩
	public static void prn(DD res) {
		// 값 전달 및 변경
		res.setA(100);
		res.setB(20);
		res.setC(1);
		res.setD(1);
		System.out.println(res.getRes());
	}

	// 동적 바인딩
	public static void prn02(AA res) {
		// 값 전달 및 변경
		res.setA(100);
		res.setB(20);
		((BB) res).setC(1);
		((DD) res).setD(1);
		System.out.println(((DD) res).getRes());
	}
}
