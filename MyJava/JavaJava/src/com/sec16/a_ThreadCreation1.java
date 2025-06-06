package com.sec16;

// [4. 스레드 생성 방법]
// case01: Thread 상속 - run() 오버라이드, start()로 실행

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
        	//  name을 한 게 없으므로 시스템이 알아서 0, 1 지정
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(500);	// static method
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();	// static method
            }
        }
    }
}

public class a_ThreadCreation1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}