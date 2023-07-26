package com.qualizeal.Abstract.program;
abstract class App {
	abstract void run();
}
class Mobile extends App{
	void run() {
		System.out.println("Mobile is running the app..");
	}
}
class Laptop extends App{
	void run() {
		System.out.println("Laptop is running the app..");
	}
}
class Abstraction{
	public static void main(String[] args) {
		App m = new Mobile();
		App l = new Laptop();
		
		m.run();
		l.run();
	}
}
