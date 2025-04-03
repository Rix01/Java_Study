package com.sec12.labmbda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest01 {

	public static void main(String[] args) {
		BiFunction<String, String, String> bi = (x, y) -> {
			return x + y;
		};
		
		System.out.println("bi = "+bi.apply("오늘은 ", "금요일이다!"));
		

		Function<String, String> f = x -> x + " !";
		// default <V> BiFunction<T,U,V> andThen(Function<? super R,? extends V> after)
		// apply("Getting Start", "java") 호출되어서 문자열이 합한 String 리턴되고 andThen() 호출만큼 실행된다.
		System.out.println(bi.andThen(f).andThen(f).apply("Getting Start", " java"));
	}
}
