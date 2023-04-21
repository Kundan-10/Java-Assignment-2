package com.Q2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product prod=new Product();
		
		Queue<Product> kk = new PriorityQueue<>(new productPrice());
	
		System.out.println("Enter the number of product");
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			
			System.out.println("Enter the productName");
			String name=sc.next();  
			prod.setProductName(name);
			
			System.out.println("Enter the productId");
			int pi=sc.nextInt();
			prod.setProductId(pi);
			
			System.out.println("Enter the productPrice");
			int pp=sc.nextInt();
			 prod.setProductPrice(pp);
			
			kk.add(new Product(pi,name,pp));
			
		}
		
     Product s;
		
		while((s = kk.poll()) != null) {
			System.out.println(s);
		}
	
	}

}
