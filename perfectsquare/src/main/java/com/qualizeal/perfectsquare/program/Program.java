package com.qualizeal.perfectsquare.program;
public class Program {
	public void CheckPerfectSquare(int num) {
		int n = (int)Math.round(Math.pow(num, 1.0/2.0));
		if(num==(n*n)) {
			System.out.println("Yes, Number is a perfect square..");
		}else {
			System.out.println("No, Number is not a perfect square..");
		}
	}
	/*static boolean CheckPerfectSquare(int num) {
		for(int i=1;i*i<=num;i++) {
			if((num%i)==0 && (num/i)==i) {
				return true;
			}
		}
		return false;
	}*/
public static void main(String[] args){
	Program p = new Program();
	p.CheckPerfectSquare(25);
    	/*if(CheckPerfectSquare(25)) {
        	System.out.println("Yes, Number is a perfect square..");
        }else {
        	System.out.println("No, Number is not a perfect square..");
        }*/
    }
}
