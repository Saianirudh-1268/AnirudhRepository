package com.qualizeal.perfectcube;

public class percubnum {
	public void percub(double num) {
		int n = (int)Math.round(Math.pow(num, 1.0/3.0));
		System.out.println(n);
	}
	public static void main(String[] args) {
		percubnum p = new percubnum();
		p.percub(343);
	}
}
