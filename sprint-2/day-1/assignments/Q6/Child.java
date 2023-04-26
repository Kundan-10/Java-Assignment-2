package Q6;

public class Child extends Parent{


	
	Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		
		
		try {
			Parent ch=new Child();
			ch.fun1();
		}catch(Exception e) {
			System.out.println("please correct ");
		}
		
		
		
	}

}
