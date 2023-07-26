package com.qualizeal.Abstract.program;
abstract class Application {
	abstract void run();
}
class Mobile extends Application{
	void run() {
		System.out.println("Mobile is running the Application..");
	}
}
class Laptop extends Application{
	void run() {
		System.out.println("Laptop is running the Application..");
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	Application m = new Mobile();
    	Application l = new Laptop();
    	
    	m.run();
    	l.run();
    }
}
