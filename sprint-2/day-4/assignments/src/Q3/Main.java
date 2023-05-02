package Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(10,2,30,5);
		
		

		List<Integer> modifiledList= list1.stream()
												.map(s -> (s*s))
												.collect(Collectors.toList());
		
		System.out.println(modifiledList);
		
		
		
	}

}
