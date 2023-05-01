package Q2;

import java.util.function.Consumer;

public class consumerD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
//and here make a object and callilng this above method 
//	Consumer<Student> c=new MyConsumer();
//	c.accept(new Student(10,"N1",500));
//		

		// short cut method 
		
		
		
Consumer<Student> c2=s->{
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
    };
		
		 
		c2.accept(new Student(10, "N1", 500));		
      }
}

	


