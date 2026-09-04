package MiniProject4;

import java.util.ArrayList;

class UserAaccountt
{
    private String username;
    private String password;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();
    UserAaccountt(String username, String password)
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
    public void addFunds(double amount)
    {
        balance = balance + amount;
        String transaction = "Added ₹" + amount;
        transactionHistory.add(transaction);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Latest Transaction: " + transaction);
        System.out.println();
    }
    public void spendFunds(double amount)
    {
        if (amount > balance)
        {
            System.out.println("Error: Insufficient balance!");
            System.out.println("Available Balance: ₹" + balance);
            System.out.println();
            return;
        }
        balance = balance - amount;
        String transaction = "Spent ₹" + amount;
        transactionHistory.add(transaction);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Latest Transaction: " + transaction);
        System.out.println();
    }
}
public class Fifth
{
    public static void main(String[] args)
    {
        UserAccount user = new UserAccount("kanisha", "12345");
        user.addFunds(1000);
        user.spendFunds(300);
        user.spendFunds(500);
        user.spendFunds(500);
    }
}