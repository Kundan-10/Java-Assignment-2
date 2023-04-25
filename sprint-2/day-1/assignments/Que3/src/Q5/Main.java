package Q5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name of student");
		String name=sc.next();
		
		System.out.println("enter the city name");
		String city=sc.next();
		
		UserRegistration us=new UserRegistration();
		try {
			us.registerUser(name, city);
		}catch(Exception e) {
			System.out.println("User Outside India cannot be registered");
		}
		
		System.out.println("Thank you");
		
	}
}
