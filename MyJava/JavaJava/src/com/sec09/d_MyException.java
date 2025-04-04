package com.sec09;

// 사용자 정의 예외 클래스
class CustomException extends Exception {   

	public CustomException(String message) {
        super(message);	// public Exception(String message)
    }
}

// 사용자 예외처리 호출
public class d_MyException {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("값을 입력하세요!");
            }

            int a = Integer.parseInt(args[0]);

            if (a < 0) {
                throw new CustomException("음수잖아~~~");
            }

            System.out.println("입력 값: " + a);

        } catch (CustomException e) {
        	e.printStackTrace();
            System.err.println("사용자 정의 예외 발생: " + e.getMessage() + e.toString());
        } catch (NumberFormatException e) {
            System.err.println("숫자가 아닌 값을 입력하셨습니다: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("잘못된 입력: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("예외 발생: " + e);
        } finally {
        	System.out.println("예외 상관 없이 무조건 실행!");
        }
    }
}
