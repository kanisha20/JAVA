package Session18;

class MusicCheck implements Runnable
{
    public void run()
    {
        while (true)
        {
            System.out.println("Background music check running...");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }
}
public class Third
{
    public static void main(String[] args)
    {
        MusicCheck mc = new MusicCheck();
        Thread t = new Thread(mc);
        t.start();
    }
}