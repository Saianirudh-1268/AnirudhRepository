package com.qualizeal.Interface.App;
interface flower{
	void colour();
	int number();
}
class sunflower implements flower{
	public void colour() {
		System.out.println("Yellow.");
	}
	public int number() {
		return 100;
	}
}
class rose implements flower{
	public void colour() {
		System.out.println("Red.");
	}
	public int number() {
		return 50;
	}
}
class lily implements flower{
	public void colour() {
		System.out.println("White.");
	}
	public int number() {
		return 20;
	}
}
class jasmine implements flower{
	public void colour() {
		System.out.println("Purple.");
	}
	public int number() {
		return 10;
	}
}
