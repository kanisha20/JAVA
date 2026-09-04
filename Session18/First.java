package Session18;

class NotificationUpdater implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("You have new notifications!");
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
public class First
{
    public static void main(String[] args)
    {
        NotificationUpdater notification = new NotificationUpdater();
        Thread t = new Thread(notification);
        t.start();
    }
}