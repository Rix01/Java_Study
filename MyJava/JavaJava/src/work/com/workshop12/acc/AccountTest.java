package work.com.workshop12.acc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AccountTest {

	public static void main(String[] args) {
		Account account;
		// account 객체 생성
		account = new Account("441-0290-1203", 500000, 7.3);

		// account 기본 정보 출력
		System.out.printf("계좌정보: %s %.1f %.1f\n", account.getAccount(), account.getBalance(),
				account.getInterestRate());

		// account 에 -10원 입금 – Exception 처리
		account.deposit(-10);

		// account 에 600000원 출금 – Exception 처리
		account.withdraw(600000);

		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한
		System.out.println("이자: " + account.cacluateInterest());
		
		System.out.println();
		// NIO2
		Path fp = Paths.get("./src/work/com/workshop12/acc/account_ouput.txt");

		// 쓰기
		try (BufferedWriter bw = Files.newBufferedWriter(fp)) {
			bw.write("계좌번호: " + account.getAccount());
			bw.newLine();
			bw.write(String.valueOf("현재 잔고: " + account.getBalance()));
			bw.newLine();
			bw.write(String.valueOf("이자: " + account.cacluateInterest()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 읽기
		try (BufferedReader br = Files.newBufferedReader(fp)) {
			String str;
			while (true) {
				str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
