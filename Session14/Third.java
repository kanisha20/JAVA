package Session14;

class ZomatoOrder
{
    int stock = 5;
    double walletBalance = 500;
    void placeOrder(int quantity, double amount)
            throws OutOfStockException, InsufficientFundsException
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException( "Order amount cannot be negative.");
        }
        if (quantity > stock)
        {
            throw new OutOfStockException("Sorry! The dish is out of stock.");
        }
        if (amount > walletBalance)
        {
            throw new InsufficientFundsException("Insufficient wallet balance. Please add money.");
        }
        stock = stock - quantity;
        walletBalance = walletBalance - amount;
        System.out.println("Order placed successfully!");
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Amount: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + walletBalance);
    }
}

public class Third
{
    public static void main(String[] args)
    {
        ZomatoOrder order = new ZomatoOrder();
        try
        {
            order.placeOrder(10, 200);
        }
        catch (OutOfStockException e)
        {
            System.out.println( "Order failed: " + e.getMessage());
        }
        catch (InsufficientFundsException e)
        {
            System.out.println( "Payment failed: " + e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid order: " + e.getMessage());
        }
        System.out.println();
        try
        {
            order.placeOrder(1, 1000);
        }
        catch (OutOfStockException e)
        {
            System.out.println( "Order failed: " + e.getMessage());
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Payment failed: " + e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid order: " + e.getMessage());
        }
        System.out.println();
        try
        {
            order.placeOrder(1, -100);
        }
        catch (OutOfStockException e)
        {
            System.out.println("Order failed: " + e.getMessage());
        }
        catch (InsufficientFundsException e)
        {
            System.out.println( "Payment failed: " + e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println( "Invalid order: " + e.getMessage());
        }
    }
}