package com.sec11.myutil02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// 추상클래스 -> 필드 -> 생성자, 메소드 확인 -> getInstance() 메소드 : 스태틱 메소드를 통해 메모리를 단 한 번 로드
		Calendar cal = Calendar.getInstance();	// 싱글톤 패턴

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.println("현재 날짜와  시간");
		System.out.println(year + "년 " + mon + "월 " + day + "일");
		System.out.println(hour + "시 " + min + "분 " + sec + "초");

		System.out.println("24시간 기준  시간 : " + cal.get(Calendar.HOUR_OF_DAY));

		System.out.println("12시간 기준 시간." + cal.get(Calendar.HOUR));

		System.out.println("오늘이 이번주의 몇번째 날: " + cal.get(Calendar.DAY_OF_WEEK));

		System.out.println("이번주의 요일이 이번달의 몇번째 요일 :  "
				+ cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) +" 번째");

		System.out.println("1년중에  오늘이 " + cal.get(Calendar.DAY_OF_YEAR)
				+ "  번째 날 ");

	}

}
