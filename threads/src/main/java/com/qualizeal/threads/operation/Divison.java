package com.qualizeal.threads.operation;

public class Divison {
	public Divison() {
		System.out.println("Thread Started");
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread Running");
				System.out.println(i+"->");
				divide();
			}
		}catch(InterruptedException inEx) {
			inEx.printStackTrace();
		}
		System.out.println("Thread Ending");
	}
	public int divide() {
		int num1 = 10;
		int num2 = 23;
		int num3 = num1 / num2;
		return num3;
	}
}
