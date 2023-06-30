package com.qualizeal.javaapp1.program;

import com.qualizeal.javaapp1.operation.Divison;

public class MainProgram {
	public static void main(String[] args){
		System.out.println("main started");
		
		Divison divison = new Divison();
		divison.divide(10,2);
		
		System.out.println("main ended");
	}
}
