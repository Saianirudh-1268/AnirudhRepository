package com.qualizeal.ani;

public class exception {
	public void withdraw(double withdraw, double curbal) {
		double rembal = curbal - withdraw;
		if(withdraw>curbal) {
			System.out.println("Sorry User!! you have an insufficient Balance.");
		}else {
			System.out.println("Withdrawal Transaction started.");
			System.out.println("Current Balance is: "+ curbal);
			System.out.println("Withdrawal Transaction Successful");
			System.out.println("Withdrawal Amount is: "+ withdraw);
			System.out.println("Remaining Balance is: "+ rembal);
		}
		/*try {
			System.out.println(curbal/rembal);
		}catch(Exception Ex) {
		}*/
		
	}
}
