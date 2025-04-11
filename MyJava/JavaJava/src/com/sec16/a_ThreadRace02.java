package com.sec16;

public class a_ThreadRace02 {
	public static void main(String[] args) {
		// 캐릭터를 많이 추가해 보자.
		String[] runners = {"😺 야옹이", "🐶 멍멍이", "🐤 병아리", "🐰 토끼", "🐢 거북이"};
		for (String name : runners) {
			new Racer(name).start();
		}
	}
}

class Racer extends Thread{
	private static int rank = 1;
	
	public Racer(String name) {
		this.setName(name);
	}
	
	@Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "달리는 중 🏃~~‍: " + i + "미터");
            try {
                Thread.sleep((int)(Math.random() * 400 + 100)); // 100~500ms 랜덤 지연
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (Racer.class) {
            System.out.println("🎉🎉🎉 " + getName() + " 도착!!! 순위: " + rank++);
        }
    }
	
}