package com.qualizeal.exception;

import com.qualizeal.ani.exception;

public class App {
    public static void main( String[] args ) {
    	System.out.println("Welcome To ATM.");
    	
    	exception ex = new exception();
    	ex.withdraw(10000, 1000);
    	
    	System.out.println("Have a Good Day!.");
    }
}
