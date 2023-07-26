package com.qualizeal.inheritance;

import com.qualizeal.inheritance.program.Y;

public class App 
{
    public static void main( String[] args )
    {
    	Y yObj = new Y();
        System.out.println(yObj.a);
        System.out.println(yObj.b);
        System.out.println(yObj.c);
        System.out.println(yObj.d);
        yObj.hi();
        yObj.hello();
        yObj.hey();
    }
}
