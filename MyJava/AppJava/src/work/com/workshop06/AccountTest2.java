package work.com.workshop06;

public class AccountTest2 {
	public static void main(String[] args) {
		// 5개의 Account 형 객체 배열 선언
		Account[] accounts = new Account[5];
		
        // for문을 이용하여 Account 객체를 생성 후 배열에 저장
		for(int i = 1; i<=5; i++) {
			accounts[i-1] = new Account("221-0101-211"+i, 100000, 4.5);
		}
		
        // for문을 이용하여 Account 정보 출력
		for(int i = 0; i<5; i++) {
			accounts[i].accountInfo();
			System.out.println();
		}
		
		System.out.println();
		
        // for문을 이용하여 이자율을 변경하고 Account 정보와 이자를 화면에 출력 
		for(int i = 0; i<5; i++) {
			accounts[i].setInterestRate(3.7);
			accounts[i].accountInfo();
			System.out.printf(" 이자: %.0f원\n", accounts[i].calculateInterest());
		}
	}
}
