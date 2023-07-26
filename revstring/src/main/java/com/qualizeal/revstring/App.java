package com.qualizeal.revstring;
public class App {
    public static void main( String[] args ){
    	String s = "758829879819";
    	StringBuilder s1 = new StringBuilder();
    	s1.append(s);
    	s1.reverse();
    	System.out.println(s1);
    }
}
