package com.qualizeal.Interface.App;

public class App {
	public static void main(String[] args) {
		flower s = new sunflower();
		flower r = new rose();
		flower j = new jasmine();
		flower l = new lily();
		
		j.colour();
		j.number();
		System.out.println("---------------------------");
		l.colour();
		l.number();
		System.out.println("---------------------------");
		r.colour();
		r.number();
		System.out.println("---------------------------");
		s.colour();
		s.number();
	}
}
