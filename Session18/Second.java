package Session18;

class CashbackThread extends Thread
{
    int cashbackBalance = 0;
    public void run()
    {
        for (int i = 1; i <= 6; i++)
        {
            cashbackBalance = cashbackBalance + 10;
            System.out.println("Cashback added: Rs. 10");
            System.out.println("Current Cashback: Rs. " + cashbackBalance);
            try
            {
                Thread.sleep(10000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Final Cashback Balance: Rs. " + cashbackBalance);
    }
}
public class Second
{
    public static void main(String[] args)
    {
        CashbackThread cashback = new CashbackThread();
        cashback.start();
    }
}