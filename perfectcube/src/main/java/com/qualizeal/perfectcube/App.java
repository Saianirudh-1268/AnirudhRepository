package com.qualizeal.perfectcube;
public class App {
		public void CheckPerfectCube(int num){
		     int n = (int)Math.round(Math.pow(num, 1.0/3.0));
		     if((num == n*n*n)) {
			     System.out.println("Yes, Number is a Perfect Cube..");
		     }else {
			     System.out.println("No, Number is not a Perfect Cube..");
		     }
		}
public static void main( String[] args ) {
    	App app = new App();
    	app.CheckPerfectCube(343);
    }
}
