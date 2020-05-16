package org.bovink.javalearning.thread;

import java.util.Random;

public class TestThread implements Runnable{
	
	
	private Bank b;
	private int from;
	private int balance;

	public TestThread(Bank b, int from, int balance) {
		this.b = b;
		this.from = from;
		this.balance = balance;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
		b.changeTo(from, new Random().nextInt(100), balance);
		b.showSum();
	
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	

}
