package Q4;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import Q2.Student;

public class Main {
	public static void main(String[] args) {
		  Set<Student> pro = new LinkedHashSet<>();
			

			pro.add(new Student(2, "N2", 750));
			pro.add(new Student(3, "N1", 450));
			pro.add(new Student(1, "N3", 650));
			pro.add(new Student(4, "N1", 450));
			pro.add(new Student(4, "N1", 410));
			
			Set<Student> filteredList= pro.stream()
					.filter(s -> s.getMarks() < 500)
					.collect(Collectors.toSet());
	
		
			 HashSet<Student> pro1=new HashSet<>(filteredList);
			 
			 for(Student c:pro1) {
					System.out.println(c);
				}

		
	}

}
