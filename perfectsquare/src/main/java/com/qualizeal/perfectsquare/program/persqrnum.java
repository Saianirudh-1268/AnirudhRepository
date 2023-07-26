package com.qualizeal.perfectsquare.program;

public class persqrnum {
	public void persqr(double num) {
		int n = (int)Math.round(Math.pow(num, 1.0/2.0));
		System.out.println(n);
	}
	public static void main(String[] args) {
		persqrnum p = new persqrnum();
		p.persqr(25);
	}
}
