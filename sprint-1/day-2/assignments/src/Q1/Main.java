package Q1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<? super Integer>  fun1(List<? super Integer> list) {
		

		return list;

	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the random number of list till 5");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		List<Integer> ilist= Arrays.asList(a,b,c,d,e);
	
		Object obj=fun1(ilist);
		System.out.println(obj);
		
	}

}
