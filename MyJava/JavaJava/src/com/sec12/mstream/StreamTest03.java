package com.sec12.mstream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest03 {

	public static void main(String[] args) {
		// Q1. 1 ~ 10까지 정수형 값을 스트림 생성 후 출력 map() :요소 변환 -> 정수를 문자열로 변환
		Stream<String> streamOneToTen = IntStream.rangeClosed(1, 10).mapToObj(String::valueOf);
		StreamTest.printStream("Q1 Stream", streamOneToTen);

		// Q2. "import java.util.stream.Stream" 문자열을 잘라서 배열을 만든 후 스트림 생성 후 출력
		String str1 = "import java.util.stream.Stream";
		String[] str1Arr = str1.split("[ .]");
		Stream<String> streamFromArray = Arrays.stream(str1Arr);
		StreamTest.printStream("Q2 Stream", streamFromArray);
		
		// Q3. 10 ~ 1까지 정수형 값을 스트림 생성 후 출력
		Stream<String> streamTenToOne = IntStream.iterate(10, i->i-1).limit(10).mapToObj(String::valueOf);
		StreamTest.printStream("Q2 Stream", streamTenToOne);

	}

}

