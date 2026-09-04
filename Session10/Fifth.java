package Session10;

class CcardPayment extends Payment 
{
    void topUp(int amount) 
    {
        if (amount > 1000) 
        {
            System.out.println("Card top-up: ₹" + amount);
            System.out.println("Congratulations! You received cashback on this top-up!");
       }
        else 
        {
            System.out.println("Card top-up: ₹" + amount);
        }
    }
}

public class Fifth 
{

    public static void main(String[] args) 
    {
        Payment payment;
        payment = new CcardPayment();
        ((CcardPayment) payment).topUp(500);
        ((CcardPayment) payment).topUp(1500);
    }
}