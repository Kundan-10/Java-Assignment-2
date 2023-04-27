package Q1;

public class Tiger extends Animal{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating !");
		
	}

	
	public static void main(String[] args) {
		Animal ti=new Tiger();
		ti.eat();
		
		
	}
}
