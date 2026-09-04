package Session11;

abstract class UPITransaction 
{
    abstract void processTransaction(double amount);
}
class PaytmTransaction extends UPITransaction 
{
    @Override
    void processTransaction(double amount) 
    {
        System.out.println("Paytm is processing ₹" + amount);
    }
}
class PhonePeTransaction extends UPITransaction 
{
    @Override
    void processTransaction(double amount) {
        System.out.println("PhonePe is processing ₹" + amount);
    }
}
public class Third 
{
    public static void main(String[] args) 
    {
        UPITransaction transaction;
        transaction = new PaytmTransaction();
        transaction.processTransaction(1500);
        transaction = new PhonePeTransaction();
        transaction.processTransaction(2000);
    }
}