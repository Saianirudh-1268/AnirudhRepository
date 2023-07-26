package com.qualizeal.triangle.program;
public class Triangle {
	public void input(int a, int b, int c) {
		if(a==b && b==c && a==c) {
			System.out.println("Equilateral Triangle");
		}else if(a==b && a==c && b!=c) {
			System.out.println("Isosceles Triangle");
		}else if(a!=b && b!=c && a!=c){
			System.out.println("Scalene Triangle");
		}else {
			System.out.println("Invalid");
		}
	}
}
