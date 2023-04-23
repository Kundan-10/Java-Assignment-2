package Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class Main {
	
	
	
	public static void main(String[] args) {
		
		Map<String, List<String>> hm = new TreeMap<>();

		List<String> cities = new ArrayList<>();
		
		cities.add("kolkata");
		cities.add("haldia");
		cities.add("durgapur");
				
				

		 hm.put("Maharastra",Arrays.asList("pune","mumbai","amrawati") );
		 hm.put("WestBengal", cities);      
		 hm.put("Haryana",Arrays.asList("Faridabad","Gurgaon,","Rohtak","Hisar") );
		 hm.put("Jharkhand",Arrays.asList("Dhanbad","Ranchi,","Jamshedpur","Mango") );
		 hm.put("Karnataka",Arrays.asList("Bangalore","Hubli ,","Dharwad","Mysore") );
			
		Set<Map.Entry<String, List<String>>>  set =hm.entrySet();
		
		for(Map.Entry<String, List<String>> m:set) {
		    System.out.println(m.getKey()+"========"+m.getValue());
		
	 }

   }
}
