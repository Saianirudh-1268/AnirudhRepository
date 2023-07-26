package com.qualizeal.polymorphism;
class Grandfather{
	int age=75;
	void slogan() {
		System.out.println("Listen words..");
	}
}
class father extends Grandfather{
	int age=50;
	void slogan() {
		System.out.println("Listen words..");
	}
}
class son extends father{
	int age=25;
	void slogan() {
		System.out.println("Listening words..");
	}
}
public class Family {
	public static void main(String[] args) {
		Grandfather f1,f2,f3;
		f1 = new Grandfather();
		f2 = new father();
		f3 = new son();
		f1.slogan();
		f2.slogan();
		f3.slogan();
		System.out.println(f1.age);
		System.out.println(f2.age);
		System.out.println(f3.age);
	}
}
