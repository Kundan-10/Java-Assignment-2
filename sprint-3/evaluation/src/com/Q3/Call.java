package com.Q3;

import java.util.concurrent.Callable;

public class Call implements Callable{
	
	int sum;
	
	public Call(int sum) {
		this.sum=sum;
	}

	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"produnct is "+sum);
		 
		int pp=1;
		for(int i=1; i<=sum; i++) {
			pp*=i;
		}
		return pp;
	}
	

}
