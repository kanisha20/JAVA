package Session10;

class paymentMethod 
{
    
    void topUp(double amount) 
    {
        System.out.println("PaymentMethod: Top up of ₹" + amount);
    }
}

class cardPayment extends paymentMethod 
{
    
    @Override
    void topUp(double amount) 
    {
        System.out.println("CardPayment: Top up of ₹" + amount + " using Card");
    }
}

class upiPayment extends paymentMethod 
{
    
    @Override
    void topUp(double amount) 
    {
        System.out.println("UpiPayment: Top up of ₹" + amount + " using UPI");
    }
}

class cryptoPayment extends paymentMethod 
{
    
    @Override
    void topUp(double amount) 
    {
        System.out.println("CryptoPayment: Top up of ₹" + amount + " using Cryptocurrency");
    }
}

public class Second 
{
    static void processWalletTopUp(paymentMethod method, double amount) 
    {
        method.topUp(amount);
    }

    public static void main(String[] args) 
    {
        paymentMethod card = new cardPayment();
        paymentMethod upi = new upiPayment();
        paymentMethod crypto = new cryptoPayment();
        processWalletTopUp(card, 1000);
        processWalletTopUp(upi, 2000);
        processWalletTopUp(crypto, 3000);
    }
}
