package com.Q3;

import java.security.Provider.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	Call [] vv= {
    			new Call(1),
    			new Call(10),
    			new Call(5), 
    			new Call(15),
    			new Call(11),
    			new Call(2),
    	};
    	
    	ExecutorService ss=Executors.newFixedThreadPool(3);
    	
    	for(Call pro:vv) {
    		Future ff=ss.submit(pro);
    		System.out.println(ff.get());
    	};
    	ss.shutdown();
	}

}


