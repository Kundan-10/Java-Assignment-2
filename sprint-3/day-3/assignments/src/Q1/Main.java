package Q1;

public class Main extends Thread{
	
	@Override
	public void run() {
	
		int pro=1;
		for(int i=1; i<=10; i++) {
			pro*=i;
		}
	}
	
	
	public static void main(String[] args) {
		
		Main t1= new Main();
		t1.start();
		
	}

}
