package com.qualizeal.thread;

public class Mythread implements Runnable{
	public void run() {
		System.out.println("Thread  is running..");
	}
	public static void main(String[] args) {
		Runnable r = new Mythread();
		Thread t = new Thread(r);
		t.start();
	}
}
