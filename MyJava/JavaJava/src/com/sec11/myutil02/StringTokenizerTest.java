package com.sec11.myutil02;

import java.util.StringTokenizer;

/*
 * 문자열 추출해서 <find할 경우> 문자열 단위로 자르기, 찾기, 변환하기
 * 1. Scanner
 * 2. java.util.regex
 * 3. String
 * 4. StringTokenizer
 */
public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "java,jdbc,servlet/jsp,spring/JDBCTemplate";
		StringTokenizer st = new StringTokenizer(str, ",/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}