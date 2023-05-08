package com.Q2;

public class K {
	
	public static void main(String[] args) throws InterruptedException {
		
		Product pp=new Product();
		pp.start();
		
		synchronized (pp) {
			pp.wait();
		}
		System.out.println(pp.c);
	}

}
