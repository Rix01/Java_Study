package work.com.workshop12.acc;

public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {

	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double cacluateInterest() {
		return balance * (interestRate / 100.0);
	}

	// 잔액 정보 증가
	public void deposit(double money) {
		try {
			if (money < 0) {
				throw new Exception();
			} else {
				balance += money;
			}
		} catch (Exception e) {
			System.out.println("입금 금액이 0보다 적습니다.");
		}
	}

	// 출금 처리
	public void withdraw(double money) {
		try {
			if (money < 0 || money > balance) {
				throw new Exception();
			} else {
				balance -= money;
			}
		} catch (Exception e) {
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
