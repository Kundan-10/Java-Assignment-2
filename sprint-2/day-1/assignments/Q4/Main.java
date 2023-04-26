package Q4;

import java.util.Scanner;

public class Main {
	
	static void quotient(int a,int b){
		try {
			int qu=a/b;
			System.out.println("quotient is "+qu);
		}catch(Exception e) {
			System.out.println("catch of try1 ");
		}
		
		System.out.println("Inside finally block");
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 2 value ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		quotient(a,b);
	}

}
