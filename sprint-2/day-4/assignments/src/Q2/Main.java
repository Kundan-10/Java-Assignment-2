package Q2;

import java.util.ArrayList;
import java.util.List;

import Q1.Product;

public class Main {
	public static void main(String[] args) {
		  List<Student> pro = new ArrayList<>();
			

			pro.add(new Student(2, "N1", 750));
			pro.add(new Student(3, "N2", 450));
			pro.add(new Student(1, "N3", 650));
			pro.add(new Student(4, "N4", 850));
			pro.add(new Student(5, "N5", 410));
		  

			
			pro.stream()
			.filter(s -> s.getMarks() > 500)
			.forEach(s -> System.out.println(s));

	}

}
