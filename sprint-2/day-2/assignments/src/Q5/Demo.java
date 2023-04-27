package Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> p=new ArrayList<>();
		
		p.add(new Product(1,"kundan",5,200));
		p.add(new Product(5,"mahesh",10,20));
		p.add(new Product(4,"khanan",50,200));
		p.add(new Product(3,"pankaj",15,2000));
		p.add(new Product(5,"kedar",511,20000));
		p.add(new Product(6,"john",52,200000));
		
		Collections.sort(p, (s1,s2) -> s2.getPrice() > s1.getPrice() ? +1: -1);
//		
//		for(Product pp:p) {
//			System.out.println(pp);
//		}
		System.out.println(p);
		
		
		

	}
}
