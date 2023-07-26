package com.qualizeal.thread;

public class Anirudh1 implements Runnable{
	public void run() {
		System.out.println("Anirudh1 Thread is running..");
	}
	public static void main(String[] args) {
		Runnable r = new Anirudh1();
		Thread t1 = new Thread(r,"Anirudh New Thread..");
		t1.start();
		
		String str = t1.getName();
		System.out.println(str);
	}
}
