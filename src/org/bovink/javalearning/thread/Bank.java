package org.bovink.javalearning.thread;

public class Bank {

	public static final int ACCOUTS = 100;
	public static final int BALANCE = 1000;
	private int accoutArray[];
	public Bank() {
		accoutArray = new int[ACCOUTS];
		for(int i =0;i<ACCOUTS;i++) {
			accoutArray[i] = BALANCE ;
		}

	}
	
	public void changeTo(int from,int to,int num) {
		
		accoutArray[from] -= num;
		accoutArray[to] += num;
	}
	
	public void showSum() {
		int sum = 0;
		for(int i =0;i<ACCOUTS;i++) {
			sum += accoutArray[i];
		}
		System.out.println("sum is "+sum);
	}
}
