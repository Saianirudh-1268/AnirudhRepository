package com.qualizeal.polymorphism;
class Tree {
	int age=10;
	void grow() {
		System.out.println("Growing..");
	}
}
class fruits extends Tree{
	int age=2;
	void grow() {
		System.out.println("Growing Fruits..");
	}
}
class seeds extends fruits{
	int age=1;
	void grow() {
		System.out.println("Growing Seeds..");
	}
}
public class App {
	public static void main(String[] args){
		Tree t1,t2,t3;
	    t1=new Tree();
	    t2=new fruits();
	    t3=new seeds();
	    t1.grow();
	    t2.grow();
	    t3.grow();
	    System.out.println(t1.age);
	    System.out.println(t2.age);
	    System.out.println(t3.age);
	}
}
