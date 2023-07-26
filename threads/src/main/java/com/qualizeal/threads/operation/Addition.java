package com.qualizeal.threads.operation;

public class Addition extends Thread{
	public Addition() {
		System.out.println("Thread Started");
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread Running");
				System.out.println(i+"->");
				add();
				sleep(1000);
			}
		}
		catch(InterruptedException inEx) {
			inEx.printStackTrace();
		}
		System.out.println("Thread Ending");
	}
	public int add() {
		int num1 = 10;
		int num2 = 23;
		int a = num1 + num2;
		return a;
	}
}
