package com.Q2;

public class Product extends Thread{
	
	int c=1;
	
	@Override
	public void run() {
	        
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				c=c*i;
			}
			this.notify();
			
		}
	}

}
