package com.sec07.mytest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTest extends GregorianCalendar {
	
	public MyTest(int year, int month, int dayOfMonth) {
		super(year, month, dayOfMonth);	// GregorianCalendar(int year, int month, int dayOfMonth)
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "내꺼!!!";
	}

	public static void main(String[] args) {
		MyTest m1 = new MyTest(2025, 3, 11);	// GregorianCalendar(int year, int month, int dayOfMonth)
		System.out.println(m1.toString());
		System.out.println(m1.get(Calendar.YEAR)+":"+m1.get(Calendar.MONTH)+":"+m1.get(Calendar.DAY_OF_MONTH));
		m1.set(Calendar.YEAR, 2000);
		m1.set(Calendar.MONTH, 11);
		System.out.println(m1.get(Calendar.YEAR)+":"+(m1.get(Calendar.MONTH)+1)+":"+m1.get(Calendar.DAY_OF_MONTH));
		
	}

}
