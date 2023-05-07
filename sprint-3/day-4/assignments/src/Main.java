import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("abc.txt");
		
		System.out.println("enter the ");
		
		f.createNewFile();
		
		
		System.out.println(f.exists()); //true

	}

}
