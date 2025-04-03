package com.sec12.mstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		// Q1. 1 ~ 10까지 정수형 값을 스트림 생성 후 출력
		Stream<String> streamOneToTen = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		StreamTest.printStream("Q1 Stream", streamOneToTen);

		// Q2. "import java.util.stream.Stream" 문자열을 잘라서 배열을 만든 후 스트림 생성 후 출력
		String str1 = "import java.util.stream.Stream";
		String[] str1Arr = str1.split("[ .]");
		Stream<String> streamFromArray = Arrays.stream(str1Arr);
		StreamTest.printStream("Q2 Stream", streamFromArray);
		
		// Q3. 10 ~ 1까지 정수형 값을 스트림 생성 후 출력
		Stream<String> streamTenToOne = Stream.of("10", "9", "8", "7", "6", "5", "4", "3", "2", "1");
		StreamTest.printStream("Q2 Stream", streamTenToOne);

	}

}
