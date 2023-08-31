package Q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll: ");
		int roll =sc.nextInt();
		
		System.out.println("Enter name: ");
		String name =sc.next();
		
		System.out.println("Enter address: ");
		String address =sc.next();
		
		
		System.out.println("Enter mobile: ");
		String mobile =sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "101099")) {

			
			
		
		 PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
		 
		 
		
			
		ps.setInt(1, roll);	
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setString(4, mobile);
		
		
		
		
		int x= ps.executeUpdate();	
		 
		if(x > 0)
			System.out.println("Record Inserted Sucessfully");
		else
			System.out.println("Not inserted...");
		 
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

		
	}


