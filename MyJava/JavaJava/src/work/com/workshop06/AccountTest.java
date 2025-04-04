package work.com.workshop06;

public class AccountTest {
	public static void main(String[] args) {
		// account 객체 생성 
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		// account 기본 정보 출력
		System.out.printf("계좌정보: %-15s 현재잔액: %d\n", account.getAccount(), account.getBalance());
		
		// account 에서 600000원 출금
		account.withdraw(600000);
		
		// account 에 20000원 입금
		account.deposit(20000);
		
		// account 변경 정보 출력
		System.out.printf("계좌정보: %-15s 현재잔액: %d\n", account.getAccount(), account.getBalance());
		
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
		System.out.printf("이자: %.1f\n", account.calculateInterest());
	}
}
