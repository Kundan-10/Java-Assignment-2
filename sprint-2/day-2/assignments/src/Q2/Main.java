package Q2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		List<String> city=Arrays.asList("nagpur","nashik","amravti","mumbai");
		
		
		Collections.sort(city,(a1,a2)->a2.compareTo(a1));	
		
		System.out.println(city);
	}

}
