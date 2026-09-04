package MiniProject4;

import java.util.ArrayList;

class useraccountt
{
    private String username;
    private String password;
    private double balance;
    useraccountt(String username, String password)
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
}
public class Third
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
    static void login(String username, String password)
    {
        for (UserAccount user : users)
        {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password))
            {
                System.out.println("Login successful");
                return;
            }
        }
        System.out.println("Invalid credentials");
    }
    public static void main(String[] args)
    {
        register("kanisha", "12345");
        register("dipak", "45678");
        register("siddhi", "98765");
        System.out.println();
        login("kanisha", "12345");
        login("dipak", "11111");
        login("unknown", "99999");
    }
}