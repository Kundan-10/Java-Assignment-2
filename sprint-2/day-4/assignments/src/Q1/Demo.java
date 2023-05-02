package Q1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
	
         List<Product> pro = new ArrayList<>();
		
			pro.add(new Product(2, "N1", 750,10));
			pro.add(new Product(3, "N2", 450,5));
			pro.add(new Product(1, "N3", 650,10));
			pro.add(new Product(4, "N4", 850,2));
			pro.add(new Product(5, "N5", 410,10));
		
		
		
//		Stream<Product> p1=pro.stream();
//		
//		Stream<Product> p2= p1.filter(s->s.getQuantity()>10);
//		
//		p2.forEach(s->System.out.println(s));
		
			List<Product> filterLIst=pro.stream()
		.filter(s->s.getQuantity()>10)
		.collect(Collectors.toList());
			
//			System.out.println(pro);
			System.out.println(filterLIst);
			
			
			List<Product> sortedList=filterLIst.stream()
					.filter(s->s.getPrice()>s.getPrice())
					.collect(Collectors.toList());
			System.out.println(sortedList);
			System.out.println(pro);
			
		
			
	}

}
