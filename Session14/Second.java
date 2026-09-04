package Session14;

class InsufficientFundsException extends Exception 
{
    InsufficientFundsException(String message) 
    {
        super(message);
    }
}
class PaymentHandler 
{
    double balance = 5000;
    void processPayment(String amountInput) 
    {
        try {
            double amount = Double.parseDouble(amountInput);
            if (amount > balance) 
            {
                throw new InsufficientFundsException("Insufficient balance! Available balance: ₹" + balance);
            }
            if (amount <= 0) 
            {
                throw new Exception("Payment amount must be greater than zero.");
            }
            balance = balance - amount;
            System.out.println("PhonePe payment successful!");
            System.out.println("Amount paid: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid payment amount!");
        }
        catch (InsufficientFundsException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) 
        {
            System.out.println("Error: Something went wrong!");
        }
    }
}
public class Second {
    public static void main(String[] args) 
    {
        PaymentHandler payment = new PaymentHandler();
        payment.processPayment("2000");
        System.out.println();
        payment.processPayment("abc");
        System.out.println();
        payment.processPayment("5000");
    }
}