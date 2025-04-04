package com.sec12.labmbda;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class PredicateTest02 {

	public static void main(String[] args) {
		// Q1. IntPredicate를 활용해서 짝수이면서 7의 배수인지 판별해보자.
		IntPredicate p1 = n -> (n % 2) == 0; // (3) 짝수 판정
		IntPredicate p2 = n -> (n % 7) == 0;// (4) 7의 배수 판정

		IntPredicate p_res = p1.and(p2); // (5) 짝수이면서 7의 배수인지 확인
		System.out.println(p_res.test(28));
		System.out.println(p_res.test(35));

		// Q2. Interface BiPredicate<T, U>를 사용해 보자.
		// boolean test(T t,U u)
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		System.out.println(bi.test(100, 99));
		System.out.println(bi.test(10, 99));
	}

}
