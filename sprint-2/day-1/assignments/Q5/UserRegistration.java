package Q5;

public class UserRegistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else {
			InvalidCountryException ic=new InvalidCountryException("User Outside India cannot be registered");
			throw ic;
		}
	}

}
