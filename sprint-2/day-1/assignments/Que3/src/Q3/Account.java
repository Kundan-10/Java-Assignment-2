package Q3;

public class Account {
        
	String accountNumber;
	double balance;
	
	void deposit(int amount) {
	    balance+=amount;
	    System.out.println("Your account balance is "+balance);
	}
	
	double withdraw(int amount) throws InsufficientFundsException {
	if(amount>balance) {
			InsufficientFundsException ie=new InsufficientFundsException("less balance");
			throw ie; 
		}else {
			balance-=amount;
			return balance;
		}

	}

	
	
}
