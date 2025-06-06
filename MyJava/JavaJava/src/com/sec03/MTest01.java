package com.sec03;

/*MyAddress
 * name addr tel
 * 이름	주소	전화번호
 * ---------------------
 * 홍길동 서울 02-000-0000	a1
 * 정길동 인천 031-000-0000	b1
 * 최길동 부산 051-000-0000	c1
 */

class MyAddress{
	///////// 멤버 변수 은닉화
	private String name;
	private String addr;
	private String tel;
	
	// 멤버 메소드 name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// 멤버 메소드 addr
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
		
	// 멤버 메소드 tel
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
}

public class MTest01 {

	public static void main(String[] args) {
		MyAddress a1 = new MyAddress();
		MyAddress b1 = new MyAddress();
		MyAddress c1 = new MyAddress();
		
		a1.setName("홍길동");
		a1.setAddr("서울");
		a1.setTel("02-000-0000");
		
		b1.setName("정길동");
		b1.setAddr("인천");
		b1.setTel("031-000-0000");
		
		c1.setName("최길동");
		c1.setAddr("부산");
		c1.setTel("051-000-0000");
		
		System.out.println("=============주소록=============");
		System.out.printf("%s \t %s \t %s\n", a1.getName(), a1.getAddr(), a1.getTel());
		System.out.printf("%s \t %s \t %s\n", b1.getName(), b1.getAddr(), b1.getTel());
		System.out.printf("%s \t %s \t %s\n", c1.getName(), c1.getAddr(), c1.getTel());
		
		System.out.println("Q1. 홍길동을  이길동으로 변경후 a1을 출력해보자.  ");
		a1.setName("이길동");
		System.out.printf("%s \t %s \t %s\n\n", a1.getName(), a1.getAddr(), a1.getTel());
		
        System.out.println("Q2. 인천을 제주도로 변경후 정길동과 제주도만 출력해보자.   ");
        b1.setAddr("제주도");
        System.out.printf("%s \t %s \n\n", b1.getName(), b1.getAddr());
        
        System.out.println("Q3. 부산을 대구로 변경 후 이름과 대구를 출력해보자.   ");
        c1.setAddr("대구");
        System.out.printf("%s \t %s\n\n", c1.getName(), c1.getAddr());
        
        System.out.println("Q4. 최길동의 전화번호를  000으로 변경후 전체 c1의 레코드를 출력해보자   ");
        c1.setTel("000");
        System.out.printf("%s \t %s \t %s\n\n", c1.getName(), c1.getAddr(), c1.getTel());
        
        System.out.println("Q5. 레코드의 3명의 이름만 출력 해보자.    ");
        System.out.printf("%s \t\n", a1.getName());
		System.out.printf("%s \t\n", b1.getName());
		System.out.printf("%s \t\n", c1.getName());
	}

}
