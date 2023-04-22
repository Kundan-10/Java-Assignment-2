package Q3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		
		hm.put("Assam","Dispur");
		hm.put("Bihar","Patna");
		hm.put("Goa","Panaji");
		hm.put("Gujarat","Gandhinagar");
		hm.put("Haryana","Chandigarh");
		
		
		for(Map.Entry<String,String> me:hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	}

}
