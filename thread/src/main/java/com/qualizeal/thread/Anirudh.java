package com.qualizeal.thread;

public class Anirudh {
		public static void main(String[] args) {
			Thread t1 = new Thread("Anirudh's Thread is running..");
			t1.start();
			t1.setName("Anirudh's Thread is not running..");
			String str = t1.getName();
			System.out.println(str);
		}
}

