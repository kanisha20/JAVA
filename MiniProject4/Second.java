package MiniProject4;

import java.util.ArrayList;

class useraccount
{
    private String username;
    private String password;
    private double balance;
    useraccount(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }
    public String getUsername()
    {
        return username;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
public class Second
{
    static ArrayList<UserAccount> users = new ArrayList<>();

    static void register(String username, String password)
    {
        for (UserAccount user : users)
        {
            if (user.getUsername().equals(username))
            {
                System.out.println("Username already exists: " + username);
                return;
            }
        }
        UserAccount newUser = new UserAccount(username, password);
        users.add(newUser);
        System.out.println("Registration successful: " + username);
    }
    public static void main(String[] args)
    {
        register("kanisha", "12345");
        register("dipak", "45678");
        register("siddhi", "98765");
        register("kanisha", "11111");
        System.out.println();
        System.out.println("Total Users: " + users.size());
    }
}