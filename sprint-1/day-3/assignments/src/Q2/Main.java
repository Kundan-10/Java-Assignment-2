package Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	static void user(String dob) {
		
		try {
        LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
			
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1,c1);
			
			if(p.getYears()<= 0) {
				System.out.println("Date should not be in future");
			}else {
			
				System.out.println(ChronoUnit.YEARS.between(d1, c1) + " years");
			}
		    
			
		}
		catch(DateTimeParseException da) {
			System.out.println("Please enter the date in correct format");
		}
			
			
		}
		
		
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		
		user(dob);

	}
}


