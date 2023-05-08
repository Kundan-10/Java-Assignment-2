package com.Q4;

public class Main {
	
	public static void main(String[] args) {
		
		Runthread1 t=new Runthread1();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		
	
		t2.setPriority(10);
	
		
		t1.setName("Kohli");
		t2.setName("Dhoni");
		t3.setName("Rohit");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
