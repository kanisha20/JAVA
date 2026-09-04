package Session14;

class insufficientFundsException extends Exception 
{
    insufficientFundsException(String message) 
    {
        super(message);
    }
}
public class Fourth 
{
    public static void main(String[] args) 
    {
        try 
        {
            int userBalance = 100;
            int ticketPrice = 150;
            if (userBalance < ticketPrice) 
            {
                throw new insufficientFundsException("Insufficient funds! Your balance is ₹"+ userBalance + ", but the ticket costs ₹"+ ticketPrice);
            }
            System.out.println("Booking successful!");
        }
        catch (insufficientFundsException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}