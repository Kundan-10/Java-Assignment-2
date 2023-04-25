package Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			try {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter an integer: ");
				int v1=sc.nextInt();
				
				
				
				int sq=(v1*v1);
				System.out.println("The square value is :"+sq);
			}catch(InputMismatchException im) {
				System.out.println("Entered input is not a valid format for an integer");
			}
		  System.out.println("The work has been done successfully");
		
		
            
		
        
	}

}
