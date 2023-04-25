package Q3;

public class AccountDemo {
	public static void main(String[] args) {
		Account a=new Account();
        a.accountNumber="1234";
        a.balance=500;
        
        
        a.deposit(600);
        
        try {
        	double b=a.withdraw(1000);
        	System.out.println("your money is withdraw your current balance is "+b);
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        
	}

}
