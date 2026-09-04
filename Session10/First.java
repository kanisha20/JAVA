package Session10;

class PaymentMethod 
{
    void topUp(double amount) 
    {
        System.out.println("Payment of ₹" + amount + " processed.");
    }
}
class CardPayment extends PaymentMethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("₹" + amount + " added using Card Payment.");
    }
}
class UpiPayment extends PaymentMethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("₹" + amount + " added using UPI Payment.");
    }
}
class CryptoPayment extends PaymentMethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("₹" + amount + " added using Crypto Payment.");
    }
}
public class First 
{
	public static void main(String[] args) 
	{
        CardPayment card = new CardPayment();
        UpiPayment upi = new UpiPayment();
        CryptoPayment crypto = new CryptoPayment();
        card.topUp(1000);
        upi.topUp(2000);
        crypto.topUp(3000);	
	}
}
