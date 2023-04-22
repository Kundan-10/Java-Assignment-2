package Q2;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main {



	public static void main(String[] args) {
		
		Map<Student,String> treem = new TreeMap<>(new StudentMarksComp());
		
		treem.put(new Student(10,"Ganesh",950),"Maharastra");
		treem.put(new Student(12,"Surya",850),"Tamilnadu");
		treem.put(new Student(15,"Venkat",920),"Telangana");
		treem.put(new Student(16,"Dinesh",910),"Haryana");
		treem.put(new Student(18,"Srinu",880),"Kerla");
        
		Set<Map.Entry<Student,String>> set= treem.entrySet();
		
		for(Map.Entry<Student,String> mapentry: set) {
			
		System.out.println("name of Student of State :" + mapentry.getValue());
		System.out.println("*********************************");
		
		Student student = mapentry.getKey();
		System.out.println("Roll :" + student.getRoll());
		System.out.println("Name :" + student.getName());
		System.out.println("Marks :" + student.getMarks());

		}

	}
}


