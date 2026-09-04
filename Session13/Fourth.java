package Session13;

public class Fourth 
{
    public static void main(String[] args) 
    {
        int balance = 5000;
        int[] transactions = {1000, 2000, 6000, 500, 3000};
        for (int amount : transactions) 
        {
            try 
            {
                System.out.println("Processing transaction: ₹" + amount);
                if (amount > balance) 
                {
                    throw new Exception("Insufficient balance!");
                }
                balance = balance - amount;
                System.out.println("Transaction successful.");
                System.out.println("Remaining balance: ₹" + balance);
            }
            catch (Exception e) 
            {
                System.out.println("Transaction failed: " + e.getMessage());
            }
            finally 
            {
                System.out.println("Transaction complete");
                System.out.println("----------------------");
            }
        }
    }
}