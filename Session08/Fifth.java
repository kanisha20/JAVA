package Session08;

class Registration 
{
    void registerUser(String email) 
    {
        System.out.println("User registered with email: " + email);
    }
    void registerUser(String email, String password) 
    {
        System.out.println("User registered with email: " + email);
        System.out.println("Password: " + password);
    }
    void registerUser(String email, String password, String phoneNumber) 
    {
        System.out.println("User registered with email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
public class Fifth 
{
	public static void main(String[] args) 
	{
		 Registration user = new Registration();
	        user.registerUser("kanisha@gmail.com");
	        user.registerUser("kanisha@gmail.com", "Kanisha123");
	        user.registerUser("kanisha@gmail.com", "Kanisha123", "9876543210");
	}
}
