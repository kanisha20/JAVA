package MiniProject4;

class UserAccount
{
    private String username;
    private String password;
    private double balance;

    UserAccount(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void addFunds(int i) {
		// TODO Auto-generated method stub
		
	}
	public void spendFunds(int i) {
		// TODO Auto-generated method stub
		
	}
}
public class First
{
    public static void main(String[] args)
    {
        UserAccount user = new UserAccount("kanisha", "12345");
        user.setBalance(5000);
        System.out.println("Username: kanisha");
        System.out.println("Balance: Rs. " + user.getBalance());
    }
}