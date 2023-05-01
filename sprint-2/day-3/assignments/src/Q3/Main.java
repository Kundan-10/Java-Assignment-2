package Q3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	

	 public Map<String, Student> sortMapUsingStudentName(Map<String,Student> originalMap){
		
		 Set<Map.Entry<String,Student>> set = originalMap.entrySet();
		 
		 Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(new StuedentComp());
		  sortedSet.addAll(set);
		  
		  
		  LinkedHashMap<String, Student> sortedMap = new LinkedHashMap<>();
		  
		  for(Map.Entry<String, Student> s:sortedSet) {
			  sortedMap.put(s.getKey(), s.getValue());
		  }
		return sortedMap;
	
	}

	public static void main(String[] args) {
		
		 HashMap<String, Student> map = new HashMap<>();
			
			map.put("Delhi",new Student(23, "Mohit", "Mohit@gmail.com",120));
			map.put("Noida",new Student(12, "Sita", "sita@gmail.com",100));
			map.put("Kanpur",new Student(89, "Aunil","Sunil@gmail.com", 789));
			map.put("Bamlesh",new Student(19, "Sunil","Bamlesh@gmail.com", 489));
			map.put("Bihar",new Student(19, "Rakesh","Rakesh@gmail.com", 189));
			
			Main d=new Main();
			
			Map<String, Student> finalMap = d.sortMapUsingStudentName(map);
			
			for(Map.Entry<String, Student> l:finalMap.entrySet()) {
				
				System.out.println("Employee From: "+l.getKey());
				System.out.println("================================");
				Student em = l.getValue();
				
				
				System.out.println("student Name: "+em.getName());
				System.out.println("student email: "+em.getEmail());
				System.out.println("student roll: "+em.getRoll());
				System.out.println("student marks: "+em.getMarks());
				System.out.println("----------------------------------");
			}
	}

}
