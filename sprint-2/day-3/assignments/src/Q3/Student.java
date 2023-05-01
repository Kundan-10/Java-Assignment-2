package Q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Student {

	private int roll;
	private String name;
	private String email;
	private int marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name, String email, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email=email;
		this.marks = marks;
	}
	
	

	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}





	
	
	
}
