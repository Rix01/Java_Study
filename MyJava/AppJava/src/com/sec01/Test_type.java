package com.sec01;

public class Test_type {
	// 숫자 리터럴에 언더스코어(_) 사용하기
	public static void main(String[] args) {
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		// 0b 바이너리 타입
		long bytes = 0b11010010_01101001_10010100_10010010;
	}
}
