package com.qualizeal.threads;

import com.qualizeal.threads.operation.Addition;
import com.qualizeal.threads.operation.Divison;

public class App{
    public static void main( String[] args ){
        Addition add = new Addition();
        Divison divide = new Divison();
        System.out.println("Thread Created");
        
        add.start();
        divide.start();
    }
}
