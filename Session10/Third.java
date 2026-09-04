package Session10;

class Paymentmethod 
{
    void topUp(double amount) 
    {
        System.out.println("PaymentMethod: Top up ₹" + amount);
    }
}

class Cardpayment extends Paymentmethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("Card Payment: Wallet recharged ₹" + amount);
    }
}

class Upipayment extends Paymentmethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("UPI Payment: Wallet recharged ₹" + amount);
    }
}
class Cryptopayment extends Paymentmethod 
{
    @Override
    void topUp(double amount) 
    {
        System.out.println("Crypto Payment: Wallet recharged ₹" + amount);
    }
}
public class Third 
{
	public static void main(String[] args) 
	{
        Paymentmethod[] payments = {
            new Cardpayment(),
            new Upipayment(),
            new Cryptopayment()
        };
        for (Paymentmethod payment : payments) 
        {
            payment.topUp(500);
        }
    }
}
