package org.bovink.javalearning.thread;

import java.util.Random;

public class TestLock {

	public static void  main(String args[]) {
		Bank b  = new Bank();
		for(int i =0;i<1000;i++) {

			TestThread r = new TestThread(b,new Random().nextInt(100),new Random().nextInt(1000));
			Thread t= new Thread(r);

			t.start();
		}
	}
}
