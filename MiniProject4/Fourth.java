package MiniProject4;

import java.util.ArrayList;

class UserAccountt
{
    private String username;
    private String password;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();
    UserAccountt(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void addFunds(double amount)
    {
        balance = balance + amount;
        String transaction = "Added ₹" + amount;
        transactionHistory.add(transaction);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Latest Transaction: "+ transaction);
        System.out.println();
    }
}
public class Fourth
{
    public static void main(String[] args)
    {
        UserAccount user = new UserAccount("kanisha", "12345");
        user.addFunds(500);
        user.addFunds(1000);
        user.addFunds(250);
    }
}