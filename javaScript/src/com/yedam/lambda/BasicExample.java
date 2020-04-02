package com.yedam.lambda;

import java.awt.Toolkit;

class RunnableCls implements Runnable {

	@Override
	public void run() {
		Toolkit tkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {
			tkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class BasicExample {
	public static void main(String[] args) {
		RunnableCls rcs = new RunnableCls(); // 신규 작업 인스턴스
		Thread thread = new Thread(rcs); // 쓰레드 생성
		thread.start(); // 신규 작업 시작

		for (int i = 0; i < 10; i++)
			System.out.println("print it" + i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
