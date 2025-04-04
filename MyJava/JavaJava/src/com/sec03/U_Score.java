package com.sec03;

public class U_Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public U_Score() {}
	
	public U_Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return this.getKor() + this.getMath() + this.getEng();
	}

	public int getAvg() {
		return this.getTot() / 3;
	}

	@Override
	public String toString() {
		return String.format("U_Score [getName()=%s, getKor()=%d, getEng()=%d, getMath()=%d, getTot()=%d, getAvg()=%d]",
				getName(), getKor(), getEng(), getMath(), getTot(), getAvg());
	}

	public static void main(String[] args) {
		U_Score a1 = new U_Score();
		U_Score b1 = new U_Score();
		U_Score c1 = new U_Score();

		a1.setName("홍길동");
		a1.setKor(100);
		a1.setEng(100);
		a1.setMath(100);
		System.out.println(a1);

		b1.setName("홍길동");
		b1.setKor(90);
		b1.setEng(90);
		b1.setMath(90);
		System.out.println(b1);

		c1.setName("홍길동");
		c1.setKor(80);
		c1.setEng(80);
		c1.setMath(80);
		System.out.println(c1);

		//// 이름만 출력해보자., 세명의 전체 총점을 구해보자.
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("%10s %10s %10s\n", a1.getName(), b1.getName(), c1.getName());
		int tot = a1.getTot() + b1.getTot() + c1.getTot();
		System.out.printf("Total Score = %10d \n", tot);
	}

}
