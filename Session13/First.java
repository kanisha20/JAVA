package Session13;

public class First 
{
    static void withdrawAmount(int balance, int amount) throws Exception 
    {
        if (amount > balance) 
        {

            throw new Exception("Insufficient balance!");

        }
        balance = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("New balance: ₹" + balance);
    }
    public static void main(String[] args) 
    {
        int balance = 5000;
        try 
        {
            withdrawAmount(balance, 2000);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}