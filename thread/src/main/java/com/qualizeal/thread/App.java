package com.qualizeal.thread;
public class App extends Thread
{
	public void run() {
		System.out.println("Thread is running..");
	}
    public static void main( String[] args )
    {
    	App t = new App();
    	t.start();
    }
}
