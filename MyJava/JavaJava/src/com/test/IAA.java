package com.test;

// static final == 상수. 따라서, 초기값 필수적으로 와야 함.
// abstract 메소드, default, static 메소드
// 생성자 없음
// new 할 수 없음
// 다중 구현한다.
public interface IAA {
	int a = 10;	// 반드시 초기값이 있어야 함. -> public static final int a  = 10;
}
