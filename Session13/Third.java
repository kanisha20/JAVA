package Session13;

class InsufficientFundsException extends Exception 
{
    InsufficientFundsException(String message) 
    {
        super(message);
    }
}
class PaytmWallet 
{
    int balance = 5000;
    void sendMoney(int amount) throws InsufficientFundsException 
    {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds! Current balance is ₹" + balance
            );
        }
        balance = balance - amount;
        System.out.println("Money sent successfully!");
        System.out.println("Amount sent: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }
}
public class Third 
{
    public static void main(String[] args) 
    {
        PaytmWallet wallet = new PaytmWallet();
        try 
        {
            wallet.sendMoney(2000);
        }
        catch (InsufficientFundsException e) 
        {
            System.out.println("Transaction failed!");
            System.out.println(e.getMessage());
        }
    }
}