package Session12;

public class Fourth
{
    public static void main(String[] args)
    {
        String message = "Hello! How are you? I hope you are doing great. Have a nice day!";
        if (message.length() > 30)
        {
            System.out.println(message.substring(0, 30) + "...");
        }
        else
        {
            System.out.println(message);
        }
    }
}