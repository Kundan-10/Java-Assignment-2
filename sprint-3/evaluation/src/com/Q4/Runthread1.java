package com.Q4;

public class Runthread1 implements Runnable{

	@Override
	public void run() {
		
		String tname=Thread.currentThread().getName();

		
		if(tname=="Kohli") {
			for(int i=1; i<=10; i++) {
				System.out.println(tname+" "+i);
			}
			
		}else if(tname=="Dhoni"){
			int sum1=0;
			for(int j=1; j<=20; j++) {
				sum1+=j;
			
			}
			System.out.println(tname+" "+sum1);
		}else {
			int sum=1;
			for(int k=1; k<=10; k++) {
				sum*=k;
				
			}
			System.out.println(tname+" "+sum);
		}
		
	}

}
